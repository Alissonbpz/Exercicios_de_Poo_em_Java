package Aula_12.ex2;

import java.util.ArrayList;


public class Departament {
    private String name;
    private ArrayList<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public Departament(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmp(Employee emp){
        employees.add(emp);
    }

    public void mostrarFuncionarios(){

        System.out.println("Departament:" + name);

        for(Employee emp : employees){
            System.out.println("Name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
        }
    }

}
