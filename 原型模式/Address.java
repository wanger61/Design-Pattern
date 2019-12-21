package 原型模式;

import java.io.Serializable;

public class Address implements Serializable {
    private String street;
    private int num;

    public Address() {
    }

    public Address(String street, int num) {
        this.street = street;
        this.num = num;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
