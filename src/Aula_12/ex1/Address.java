package Aula_12.ex1;

public class Address {
    private String way;
    private String city;
    private int number;

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Address(String way, String city, int number) {
        this.way = way;
        this.city = city;
        this.number = number;
    }
}
