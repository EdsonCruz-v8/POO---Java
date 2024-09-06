package org.example;

public class Livro extends Produto{
    private String titulo;
    private String genero;

    public Livro(int codigo,String descricao, Double preco, String categoria, String titulo, String genero){
        super(codigo,descricao,preco,categoria);
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public Double calcularPrecoFinal() {
        if(genero.equals("Suspense")){
            return getPreco() - getPreco() * 10;
        }else{
            return getPreco();
        }
    }


    @Override
    public Double getPreco() {
        return super.getPreco();
    }

    @Override
    public void setPreco(Double preco) {
        super.setPreco(preco);
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public void setCodigo(int codigo) {
        super.setCodigo(codigo);
    }

    @Override
    public String getCategoria() {
        return super.getCategoria();
    }

    @Override
    public void setCategoria(String categoria) {
        super.setCategoria(categoria);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
