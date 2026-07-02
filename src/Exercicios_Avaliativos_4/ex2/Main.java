package Exercicios_Avaliativos_4.ex2;

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 5000, 2000);

        Estagiario estagiario = new Estagiario("João", 0, 1200);

        gerente.exibirInfo();

        System.out.println();

        estagiario.exibirInfo();

    }

}
