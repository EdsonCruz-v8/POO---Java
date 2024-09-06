package org.example;

abstract class Funcionario {
    private String nome;
    private Double salario;

    //Construtor
    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //Metodos

    public abstract double calcularBonus();

    @Override
    public String toString(){
        return String.format("%s - Salário: R$ %.2f", nome, salario);
    }
    //=======Getters and Setters==========
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
