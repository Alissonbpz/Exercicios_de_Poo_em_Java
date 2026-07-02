package Exercicios_Avaliativos_4.ex3;

public abstract class Transporte {

    protected double distanciaKm;

    public Transporte(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public abstract double calcularCusto();
}