package org.example.entity;

public class Pais {
    public String nome;

    public Pais(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
