package com.company.HomeTask4dot2;

public class Person {
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Person[name = %s, address = %s", name, address);
    }
}
