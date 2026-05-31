package br.com.fiap.Ecotrack.service;
import br.com.fiap.Ecotrack.model.Clima;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

    @Service
    public class ClimaService {

        public Clima buscarClima(){

            Clima clima = new Clima();
            clima.setTemperatura(BigDecimal.valueOf(24.5));
            clima.setUmidade(70);
            clima.setQualidadeAr("Boa");
            clima.setIndiceUv("5");

            return clima;
        }
    }

