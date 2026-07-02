package Aula_12.ex2;

public class Employee {
    private String name;
    private double Salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.Salary = salary;
    }
}
