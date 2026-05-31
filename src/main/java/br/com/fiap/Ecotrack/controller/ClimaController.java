package br.com.fiap.Ecotrack.controller;

import br.com.fiap.Ecotrack.model.Clima;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
public class ClimaController {

    // READ = Consultar clima - GET /api/clima
    @GetMapping("/clima")
    @ResponseStatus(HttpStatus.OK)
    public Clima buscarClima(){

        Clima clima = new Clima();
        clima.setTemperatura(BigDecimal.valueOf(24.5));
        clima.setUmidade(70);
        clima.setQualidadeAr("Boa");
        clima.setIndiceUv("5");

        return clima;
    }
}