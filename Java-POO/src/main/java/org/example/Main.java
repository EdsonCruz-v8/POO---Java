package org.example;



public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Edson Gabriel", 12_345.00, 123);

        conta.simular();

        Endereco endereco = new Endereco("Rua Haddock Lobo", "512N", "São Paulo");
        Pessoa p = new Pessoa("João Silva", 30, endereco);
        System.out.println(p);

        Gerente gerente = new Gerente("Carlos", 5000.00, 1000.00, "Contabilidade");
        Vendedor vendedor = new Vendedor("Ana", 3000.00, 500.00);

        System.out.println(gerente);
        System.out.println(vendedor);

        Produto livro = new Livro(1, "Livro feito para amantes da arte",
                56.12, "livro","Como desenhar aquarela", "Suspense");
        Produto eletronico = new Eletronico(1234, "Celular de ultima geração tela LED", 12_000.00, "Celular", "Iphone", 12.00);

        System.out.println(livro.calcularPrecoFinal());
        System.out.println(eletronico.calcularPrecoFinal());

    }
}