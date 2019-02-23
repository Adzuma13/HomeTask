package com.company.HomeTask2dot8;

public class Customer {
    public static final char MALE = 'm';
    public static final char FEMALE = 'f';

    private int ID;
    private String name;
    private char gender;


    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)", name,ID);
    }
}
