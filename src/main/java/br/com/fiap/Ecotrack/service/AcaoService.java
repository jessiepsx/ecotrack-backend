package br.com.fiap.Ecotrack.service;

import br.com.fiap.Ecotrack.dto.AcaoCadastroDTO;
import br.com.fiap.Ecotrack.dto.AcaoExibicaoDTO;
import br.com.fiap.Ecotrack.exception.AcaoNaoEncontradoException;
import br.com.fiap.Ecotrack.repository.AcaoRepository;

import br.com.fiap.Ecotrack.model.AcaoSustentavel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AcaoService {

    @Autowired
    private AcaoRepository acaoRepository;

    // CREATE -> cadastrar acao
    public AcaoExibicaoDTO salvarAcao(
            AcaoCadastroDTO acaoDTO){

        AcaoSustentavel acao = new AcaoSustentavel();
        BeanUtils.copyProperties(acaoDTO, acao);
        AcaoSustentavel acaoSalvo = acaoRepository.save(acao);

        return new AcaoExibicaoDTO(acaoSalvo);
    }

    // READ -> buscar por ID
    public AcaoExibicaoDTO buscarPorId(Long id){

        Optional<AcaoSustentavel> acaoOptional = acaoRepository.findById(id);

        if(acaoOptional.isPresent()){
            return new AcaoExibicaoDTO(acaoOptional.get());
        } else {
            throw new AcaoNaoEncontradoException(
                    "Ação não encontrada!"
            );
        }
    }

    // READ -> listar acoes
    public List<AcaoExibicaoDTO> listarTodos(){
        return acaoRepository
                .findAll()
                .stream()
                .map(AcaoExibicaoDTO::new)
                .toList();
    }

    // DELETE -> excluir acao
    public void excluir(Long id){

        Optional<AcaoSustentavel> acaoOptional = acaoRepository.findById(id);

        if(acaoOptional.isPresent()){
            acaoRepository.delete(acaoOptional.get());
        } else {
            throw new RuntimeException(
                    "Ação não encontrada!"
            );
        }
    }
}
