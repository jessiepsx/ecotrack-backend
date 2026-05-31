package br.com.fiap.Ecotrack.controller;

import br.com.fiap.Ecotrack.dto.UsuarioCadastroDTO;
import br.com.fiap.Ecotrack.dto.UsuarioExibicaoDTO;

import br.com.fiap.Ecotrack.model.Usuario;
import br.com.fiap.Ecotrack.service.UsuarioService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    //CREATE = criar o usuario - POST
    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioExibicaoDTO salvar(
            @Valid @RequestBody UsuarioCadastroDTO usuario){

        return usuarioService.salvarUsuario(usuario);
    }

    //READ = lista todos os usuarios - GET
    @GetMapping("/usuarios")
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioExibicaoDTO> listarTodos(){

        return usuarioService.listarTodos();
    }

    //READ = buscar por id - GET
    @GetMapping("/usuarios/{usuarioId}")
    public ResponseEntity<UsuarioExibicaoDTO> buscarPorId(
            @PathVariable Long usuarioId){

        return ResponseEntity.ok(
                usuarioService.buscarPorId(usuarioId)
        );
    }

    //UPDATE - atualizar usuario - PUT
    @PutMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Usuario atualizar(
            @PathVariable Long id,
            @Valid @RequestBody Usuario usuario){

        return usuarioService.atualizar(usuario);
    }

    //DELETE - excluir usuario - DELETE
    @DeleteMapping("/usuarios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){

        usuarioService.excluir(id);
    }

}