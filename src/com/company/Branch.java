package com.company;

import java.util.ArrayList;

public class Branch {

    private String branchName;

    ArrayList<Customer> customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void addNewCustomer(Customer newCustomer, double initialTransaction) {

        customerList.add(newCustomer);
        newCustomer.transactionList.add(initialTransaction);
    }

//    public void addAdditionalTransaction(Branch branch, Customer customer, double addTransaction) {
//
//        for (int i = 0; i < branch.customerList.size(); i++) {
//
//            if (branch.customerList.contains(customer.getCustomerName())) {
//
//                branch.customerList.get(i).transactionList.add(addTransaction);
//            }
//
//        }
//
//
//    }
}
