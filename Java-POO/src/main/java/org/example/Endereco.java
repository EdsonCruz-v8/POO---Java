package org.example;

public class Endereco {
    private String rua;
    private String numero;
    private String cidade;

    //=====Construtor======
    public Endereco(String rua, String numero, String cidade){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    //=========Getters and Setters=========
    public String getRua(){
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return rua + ", " + numero + " - " + cidade;
    }
}
