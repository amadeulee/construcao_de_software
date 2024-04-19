package org.example.entity;

public class Bairro {
    private String nome;
    private Cidade cidade;

    public Bairro(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Bairro{" +
                "nome='" + nome + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
