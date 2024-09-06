package org.example;

public abstract class Produto {
    private int codigo;
    private String descricao;
    private Double preco;
    private String categoria;

    //Construtor
    public Produto(int codigo, String descricao, Double preco, String categoria){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    //Metodos
    public abstract Double calcularPrecoFinal();


    //Getters and Setters
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
