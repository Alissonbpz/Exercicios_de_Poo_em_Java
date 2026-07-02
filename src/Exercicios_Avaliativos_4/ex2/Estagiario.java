package Exercicios_Avaliativos_4.ex2;


public class Estagiario extends Funcionario {

    private double bolsa;

    public Estagiario(String nome, double salarioBase, double bolsa) {
        super(nome, salarioBase);
        this.bolsa = bolsa;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Estagiário: " + nome);
        System.out.println("Bolsa: R$ " + bolsa);
    }

}