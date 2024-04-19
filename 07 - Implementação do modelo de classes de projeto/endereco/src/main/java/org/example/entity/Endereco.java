package org.example.entity;

public class Endereco {
    private Integer numero;
    private String complemento;
    private Integer cep;
    private Logradouro logradouro;
    private Bairro bairro;
    private TipoEndereco tipoEndereco;

    public Endereco(Integer numero, String complemento, Integer cep, Logradouro logradouro, Bairro bairro, TipoEndereco tipoEndereco) {
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.tipoEndereco = tipoEndereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", cep=" + cep +
                ", logradouro=" + logradouro +
                ", bairro=" + bairro +
                ", tipoEndereco=" + tipoEndereco +
                '}';
    }
}
