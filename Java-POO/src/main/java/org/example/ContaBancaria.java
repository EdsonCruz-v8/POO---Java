package org.example;
import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private Double saldo;
    private int numeroConta;

    //====Construtor======
    public ContaBancaria(String titular, Double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    //=========Metodos==========
    public boolean sacar(Double valor){
        if(valor != null && valor > 0 && valor <= saldo) {
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque de R$ %.2f realizado com sucesso. \n", valor);
            mostrarSaldo();
            return true;
        }else{
            System.out.println("Saldo insuficiente ou valor invalido!");
            return false;
        }
    }

    public boolean depositar(Double valor){
        if(valor != null && valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.printf("Deposito de R$ %.2f realizado com sucesso. \n", valor);
            mostrarSaldo();
            return true;
        }else{
            System.out.println("O valor do deposito deve ser positivo!");
            return false;
        }
    }

    public void mostrarSaldo(){
        System.out.println("Seu saldo atual é de: R$ " + getSaldo());
    }

    //==========Getters and Setters==========

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void simular(){
        Scanner c = new Scanner(System.in);
        int escolha;

        do{
            System.out.println("Bem vindo ao sistema bancario V8!");
            System.out.println("1. Depósitar");
            System.out.println("2. Sacar");
            System.out.println("3. Mostrar Saldo");
            System.out.println("4. Sair");
            System.out.println("Escolha o que deseja fazer: ");
            escolha = c.nextInt();


            switch(escolha) {
                case 1:
                    System.out.println("Digite o valor do deposito: ");
                    double valorDeposito = c.nextDouble();
                    depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = c.nextDouble();
                    sacar(valorSaque);
                    break;
                case 3:
                    mostrarSaldo();
                    break;
                case 4:
                    System.out.println("Saindo... Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente");
                    break;
            }
        } while(escolha != 4);

        c.close();
    }

}
