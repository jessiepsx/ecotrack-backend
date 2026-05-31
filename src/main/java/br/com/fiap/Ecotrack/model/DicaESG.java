package br.com.fiap.Ecotrack.model;

import jakarta.persistence.*;

@Entity
@Table(name = "DICA_ESG")

public class DicaESG {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DICA")
    private Long idDica;

    @Column(name = "TITULO", nullable = false)
    private String titulo;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "CATEGORIA", nullable = false)
    private String categoria;

    public DicaESG() {
    }

    public DicaESG(Long idDica, String titulo, String descricao, String categoria) {
        this.idDica = idDica;
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Long getIdDica() {
        return idDica;
    }

    public void setIdDica(Long idDica) {
        this.idDica = idDica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}
