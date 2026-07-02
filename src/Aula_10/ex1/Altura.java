package Aula_10.ex1;

import java.util.Scanner;
public class Altura {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas deseja digitar a altura? ");
        int quant = sc.nextInt();

        double[] altura = new double[quant];

        double media_alt = 0.0;

        for(int i = 0; i < altura.length; i++){
            System.out.print("Digite a "+(i+1)+" altura: ");
            altura[i] = sc.nextDouble();
            media_alt += altura[i];
        }

        System.out.println("Alturas: ");

        for(int i = 0; i < altura.length; i++){
            System.out.println(altura[i]);
        }

        System.out.println("Media das alturas: "+ media_alt/altura.length);

            sc.close();

    }
}
