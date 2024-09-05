package org.example;

public class Vendedor extends Funcionario{
    private Double comissao;

    //Construtor
    public Vendedor(String nome, Double salario, double comissao){
        super(nome, salario);
        this.comissao = comissao;
    }

    @Override
    public double calcularBonus() {
        return getComissao();
    }

    //Getters and Setters

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public Double getSalario() {
        return super.getSalario();
    }

    @Override
    public void setSalario(Double salario) {
        super.setSalario(salario);
    }

    @Override
    public String toString() {
        return String.format("%s (Vendedor) - Sálario: R$ %.2f, Bônus: R$ %.2f", getNome(), getSalario(), calcularBonus());
    }
}
