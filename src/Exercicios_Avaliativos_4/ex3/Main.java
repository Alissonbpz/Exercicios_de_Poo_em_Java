package Exercicios_Avaliativos_4.ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Transporte> transportes = new ArrayList<>();

        transportes.add(new Onibus(10));
        transportes.add(new Taxi(10));

        for (Transporte t : transportes) {
            System.out.println("Custo: R$ " + t.calcularCusto());
        }
    }
}