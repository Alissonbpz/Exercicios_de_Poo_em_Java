package Exercicios_Avaliativos_4.ex3;

public class Taxi extends Transporte {

    public Taxi(double distanciaKm) {
        super(distanciaKm);
    }

    @Override
    public double calcularCusto() {
        return 5.0 + (distanciaKm * 1.80);
    }
}