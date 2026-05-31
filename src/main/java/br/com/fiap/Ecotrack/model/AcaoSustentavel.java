package br.com.fiap.Ecotrack.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ACAO_SUSTENTAVEL")

public class AcaoSustentavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACAO")
    private Long idAcao;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "PONTOS", nullable = false)
    private Integer pontos;

    public AcaoSustentavel() {
    }

    public AcaoSustentavel(Long idAcao, String nome, String descricao, Integer pontos) {
        this.idAcao = idAcao;
        this.nome = nome;
        this.descricao = descricao;
        this.pontos = pontos;
    }

    public Long getIdAcao() {
        return idAcao;
    }

    public void setIdAcao(Long idAcao) {
        this.idAcao = idAcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

}
