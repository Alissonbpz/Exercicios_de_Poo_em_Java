package Exercicios_Avaliativos_4.ex2;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Gerente: " + nome);
        System.out.println("Salário Total: R$ " + (salarioBase + bonus));
    }

}
