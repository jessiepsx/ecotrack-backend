package br.com.fiap.Ecotrack.controller;

import br.com.fiap.Ecotrack.dto.AcaoCadastroDTO;
import br.com.fiap.Ecotrack.dto.AcaoExibicaoDTO;

import br.com.fiap.Ecotrack.service.AcaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AcaoController {

    @Autowired
    private AcaoService acaoService;

    //CREATE = criar o ação - POST
    @PostMapping("/acoes")
    @ResponseStatus(HttpStatus.CREATED)
    public AcaoExibicaoDTO salvar(
            @Valid @RequestBody AcaoCadastroDTO acao){
        return acaoService.salvarAcao(acao);
    }

    //READ = lista todos as acoes - GET
    @GetMapping("/acoes")
    @ResponseStatus(HttpStatus.OK)
    public List<AcaoExibicaoDTO> listarTodos(){
        return acaoService.listarTodos();
    }

    //READ = buscar por id - GET
    @GetMapping("/acoes/{acaoId}")
    public ResponseEntity<AcaoExibicaoDTO> buscarPorId(
            @PathVariable Long acaoId){

        return ResponseEntity.ok(
                acaoService.buscarPorId(acaoId)
        );
    }

    //DELETE - excluir acao - DELETE
    @DeleteMapping("/acoes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        acaoService.excluir(id);
    }

}