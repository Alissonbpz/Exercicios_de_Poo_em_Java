package Aula_13_14.ex1;

public class Carro extends Veiculo {
    private int numPortas;

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public Carro(int numPortas, String marca, String modelo,int ano) {
        super(marca,modelo,ano);
        this.numPortas = numPortas;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "- " +numPortas+ " portas";
    }
}
