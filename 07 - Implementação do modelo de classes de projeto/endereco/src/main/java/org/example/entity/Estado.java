package org.example.entity;

public class Estado {
    private String sigla;
    public String nome;
    private Pais pais;

    public Estado(String sigla, String nome, Pais pais) {
        this.sigla = sigla;
        this.nome = nome;
        this.pais = pais;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "sigla='" + sigla + '\'' +
                ", nome='" + nome + '\'' +
                ", pais=" + pais +
                '}';
    }
}
