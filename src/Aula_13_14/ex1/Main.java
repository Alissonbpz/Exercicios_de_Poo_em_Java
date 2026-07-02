package Aula_13_14.ex1;

public class Main {
    public static void main() {

        Carro c = new Carro(4,"ford","Fiesta",2004);
        Moto m = new Moto("suzuki", "modelo",2034,500);

        System.out.println(c.getDescricao());
        System.out.println(m.getDescricao());


    }
}
