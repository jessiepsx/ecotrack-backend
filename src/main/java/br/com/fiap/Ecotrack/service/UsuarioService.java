package br.com.fiap.Ecotrack.service;


import br.com.fiap.Ecotrack.dto.UsuarioCadastroDTO;
import br.com.fiap.Ecotrack.dto.UsuarioExibicaoDTO;
import br.com.fiap.Ecotrack.exception.UsuarioNaoEncontradoException;
import br.com.fiap.Ecotrack.repository.UsuarioRepository;

import br.com.fiap.Ecotrack.model.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // CREATE -> cadastrar usuário
    public UsuarioExibicaoDTO salvarUsuario(
            UsuarioCadastroDTO usuarioDTO){

        String senhaCriptografada =
                new BCryptPasswordEncoder().encode(usuarioDTO.senha());

        Usuario usuario = new Usuario();

        BeanUtils.copyProperties(usuarioDTO, usuario);

        usuario.setSenha(senhaCriptografada);

        // salva no banco
        Usuario usuarioSalvo = usuarioRepository.save(usuario);

        // retorna DTO
        return new UsuarioExibicaoDTO(usuarioSalvo);
    }

    // READ -> buscar por ID
    public UsuarioExibicaoDTO buscarPorId(Long id){

        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        if(usuarioOptional.isPresent()){
            return new UsuarioExibicaoDTO(usuarioOptional.get());
        } else {
            throw new UsuarioNaoEncontradoException(
                    "Usuário não encontrado!"
            );
        }
    }

    // READ -> listar usuários
    public List<UsuarioExibicaoDTO> listarTodos(){
        return usuarioRepository
                .findAll()
                .stream()
                .map(UsuarioExibicaoDTO::new)
                .toList();
    }

    // UPDATE -> atualizar usuário
    public Usuario atualizar(Usuario usuario){

        Optional<Usuario> usuarioOptional =
                usuarioRepository.findById(usuario.getIdUsuario());

        if(usuarioOptional.isPresent()){
            return usuarioRepository.save(usuario);
        } else {
            throw new RuntimeException(
                    "Usuário não encontrado!"
            );
        }
    }

    // DELETE -> excluir usuário
    public void excluir(Long id){

        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        if(usuarioOptional.isPresent()){
            usuarioRepository.delete(usuarioOptional.get());
        } else {
            throw new RuntimeException(
                    "Usuário não encontrado!"
            );
        }
    }

}