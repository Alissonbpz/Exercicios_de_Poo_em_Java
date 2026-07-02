package Aula_12.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do seu departamento: ");
        String dep = input.nextLine();
        Departament d = new Departament(dep);

        Employee f1 = new Employee("Joao", 2500.0);
        Employee f2 = new Employee("Maria", 2500.0);

        d.addEmp(f1);
        d.addEmp(f2);

        d.mostrarFuncionarios();

    }
}
