package br.com.fiap.Ecotrack.service;

import br.com.fiap.Ecotrack.dto.DicaCadastroDTO;
import br.com.fiap.Ecotrack.dto.DicaExibicaoDTO;
import br.com.fiap.Ecotrack.repository.DicaRepository;

import br.com.fiap.Ecotrack.model.DicaESG;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicaService {

    @Autowired
    private DicaRepository dicaRepository;

    // CREATE -> cadastrar dicas
    public DicaExibicaoDTO salvarDica(
            DicaCadastroDTO dicaDTO){

        DicaESG dica = new DicaESG();
        BeanUtils.copyProperties(dicaDTO, dica);
        DicaESG dicaSalva = dicaRepository.save(dica);

        return new DicaExibicaoDTO(dicaSalva);
    }

    // READ -> listar dicas
    public List<DicaExibicaoDTO> listarTodos(){
        return dicaRepository
                .findAll()
                .stream()
                .map(DicaExibicaoDTO::new)
                .toList();
    }
}
