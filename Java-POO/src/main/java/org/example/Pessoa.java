package org.example;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Endereco endereco;

    //=====Construtor=======
    public Pessoa(String nome, Integer idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }




    //=============Getters and Setters==============
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    //Metodo para exibir
    @Override //Reescrevendo da super classe Object
    public String toString() {
        return "Nome: " + nome + " idade: " + idade + " Endereço: " + endereco;
    }
}
