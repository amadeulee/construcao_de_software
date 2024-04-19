package org.example.entity;

public class Logradouro {
    private String nome;
    private TipoLogradouro tipoLogradouro;

    public Logradouro(String nome, TipoLogradouro tipoLogradouro) {
        this.nome = nome;
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    @Override
    public String toString() {
        return "Logradouro{" +
                "nome='" + nome + '\'' +
                ", tipoLogradouro=" + tipoLogradouro +
                '}';
    }
}
