package br.com.fiap.Ecotrack.controller;

import br.com.fiap.Ecotrack.dto.DicaCadastroDTO;
import br.com.fiap.Ecotrack.dto.DicaExibicaoDTO;

import br.com.fiap.Ecotrack.service.DicaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DicaController {

    @Autowired
    private DicaService dicaService;

    //CREATE = cria dicas - POST
    @PostMapping("/dicas")
    @ResponseStatus(HttpStatus.CREATED)
    public DicaExibicaoDTO salvar(
            @Valid @RequestBody DicaCadastroDTO dicas){
        return dicaService.salvarDica(dicas);
    }

    //READ = lista todos as dicas - GET
    @GetMapping("/dicas")
    @ResponseStatus(HttpStatus.OK)
    public List<DicaExibicaoDTO> listarTodos(){
        return dicaService.listarTodos();
    }
}
