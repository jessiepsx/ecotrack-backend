package br.com.fiap.Ecotrack.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "CLIMA")

public class Clima {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIMA")
    private Long idClima;

    @Column(name = "TEMPERATURA")
    private BigDecimal temperatura;

    @Column(name = "UMIDADE")
    private Integer umidade;

    @Column(name = "INDICE_UV")
    private String indiceUv;

    @Column(name = "QUALIDADE_AR")
    private String qualidadeAr;

    @Column(name = "DESCRICAO")
    private String descricao;

    public Clima() {
    }

    public Clima(Long idClima, BigDecimal temperatura, Integer umidade, String indiceUv, String qualidadeAr, String descricao) {
        this.idClima = idClima;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.indiceUv = indiceUv;
        this.qualidadeAr = qualidadeAr;
        this.descricao = descricao;
    }

    public Long getIdClima() {
        return idClima;
    }

    public void setIdClima(Long idClima) {
        this.idClima = idClima;
    }

    public BigDecimal getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(BigDecimal temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getUmidade() {
        return umidade;
    }

    public void setUmidade(Integer umidade) {
        this.umidade = umidade;
    }

    public String getIndiceUv() {
        return indiceUv;
    }

    public void setIndiceUv(String indiceUv) {
        this.indiceUv = indiceUv;
    }

    public String getQualidadeAr() {
        return qualidadeAr;
    }

    public void setQualidadeAr(String qualidadeAr) {
        this.qualidadeAr = qualidadeAr;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
