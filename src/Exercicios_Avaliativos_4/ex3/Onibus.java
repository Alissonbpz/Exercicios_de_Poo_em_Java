package Exercicios_Avaliativos_4.ex3;

public class Onibus extends Transporte {

    public Onibus(double distanciaKm) {
        super(distanciaKm);
    }

    @Override
    public double calcularCusto() {
        return distanciaKm * 0.25;
    }
}