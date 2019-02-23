package com.company.HomeTask2dot8;

public class Account {
    private int id;
    private Customer customer;
    private double balnce = 0.0;

    public Account(int id, Customer customer, double balnce) {
        this.id = id;
        this.customer = customer;
        this.balnce = balnce;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalnce() {
        return balnce;
    }

    public void setBalnce(double balnce) {
        this.balnce = balnce;
    }

    public Account deposit (double amount){
        balnce += amount;
        return this;
    }

    public Account withdraw (double amoutnt){
        if(balnce >= amoutnt){
            balnce -= amoutnt;
        }else{
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s balance=$%2f", customer, balnce);
    }
}




