package org.example;

public class Eletronico extends Produto{
    private Double taxa;
    private String marca;


    public Eletronico(int codigo,String descricao, Double preco, String categoria, String marca, Double taxa) {
        super(codigo, descricao, preco, categoria);
        this.marca =  marca;
        this.taxa = taxa;
    }


    @Override
    public Double calcularPrecoFinal() {
        return getPreco() + (getPreco() * taxa / 100);
    }
}

