package Aula_10.ex2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos produtos deseja cadastrar? ");
        int quant = sc.nextInt();
        Produtos[] produto  = new Produtos[quant];

        for(int i =0; i<quant; i++){
            System.out.print("Nome do produto: ");
           String nome = sc.next();
            System.out.print("Valor do produto: ");
           double preco = sc.nextDouble();

           Produtos prod = new Produtos(nome, preco);
           produto[i]=prod;
        }

        System.out.println("Produtos:");

        double soma = 0.0;
        for(Produtos prod : produto){
            System.out.println(prod.getNome() + " " + prod.getPreco());
        }
        System.out.println("O media dos valores dos produtos: " + soma/produto.length);
    }
}
