package com.company;

import java.util.ArrayList;

public class Customer {

    private String customerName;

    ArrayList<Double> transactionList;

    public Customer(String name) {
        this.customerName = name;
        this.transactionList = new ArrayList<Double>();
    }

    public String getCustomerName() {
        return customerName;
    }
}
