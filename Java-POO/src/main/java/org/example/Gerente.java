package org.example;

public class Gerente extends Funcionario {
    private Double bonus;
    private String departamento;

    //Construtor
    public Gerente(String nome, Double salario, Double bonus, String departamento){
        super(nome, salario);
        this.bonus = bonus;
        this.departamento = departamento;
    }

    @Override
    //Metodos
    public double calcularBonus() {
        double porcentagem = 0.17;
        return getSalario() * porcentagem + bonus;
    }


    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
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
    public String getNome() {
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return String.format("%s (Gerente) - Departamento: %s, Salário: R$S %.2f, Bônus: R$%.2f",
                getNome(), departamento, getSalario(), calcularBonus());
    }
}
