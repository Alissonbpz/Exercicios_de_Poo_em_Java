package Aula_12.ex1;

public class Person {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public String toString(){
       return "Nome: " + name +
        "\nRua: " + address.getWay()+
        "\nNumero: " + address.getNumber() +
        "\nCidade: " + address.getCity();
    }



}
