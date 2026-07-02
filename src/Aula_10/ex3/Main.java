package Aula_10.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> func = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Employee #"+(i+1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            Employee e = new Employee(id,name,salary);
            func.add(e);
        }
        System.out.print("Enter the employee ID that will have salary increase: ");
        Integer id = sc.nextInt();
        System.out.print("Salary percentage: ");
        Double percentage = sc.nextDouble();

        System.out.println("List of employees: ");
        for(Employee e: func){
            if(e.getId().equals(id)){
                e.increaseSalary(percentage);
            }
            System.out.println(e.getId() +" | " + e.getName() +" | " +  e.getSalary());
        }


    }
}
