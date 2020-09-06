package com.company;

import java.util.ArrayList;

public class Bank {

    ArrayList<Branch> branchesList;


    public Bank() {
        this.branchesList = new ArrayList<Branch>();
    }

    public void addNewBranch(String name) {

        branchesList.add(new Branch(name));
    }

    public void addCustomer(String branchName, String customerName, double initTrans) {

        for (int i = 0; i < branchesList.size(); i++) {

            for (int j = 0; j < branchesList.get(i).customerList.size(); j++) {

                if (branchesList.get(i).customerList.get(j).getCustomerName().equals(customerName)) {
                    System.out.println("The name: " + customerName + " is already exist!");
                    return;
                }
            }



            if (branchesList.get(i).getBranchName().equals(branchName)) {

                branchesList.get(i).addNewCustomer((new Customer(customerName)),initTrans);
            }
        }
    }

    public void displayBranchsCustomers(String branchName) {

        for (int i = 0; i < branchesList.size(); i++) {

            if (branchesList.get(i).getBranchName().equals(branchName)) {

                for (int j = 0; j < branchesList.get(i).customerList.size(); j++) {

                    System.out.println("Customer Name: " + branchesList.get(i).customerList.get(j).getCustomerName() +
                            "\n" + "The Transaction History for this Customer are: ");


                    if (branchesList.get(i).getBranchName().equals(branchName)) {

                        for (int x = 0; x < branchesList.get(i).customerList.get(j).transactionList.size(); x++) {

                            System.out.println(branchesList.get(i).customerList.get(j).transactionList.get(x));
                        }
                    }

                }
            }
        }
    }

    public void displayCustomerTransaction(String customerName) {

        for (int i = 0; i < branchesList.size(); i++) {

            for (int j = 0; j < branchesList.get(i).customerList.size(); j++) {

                if (branchesList.get(i).customerList.get(j).getCustomerName().equals(customerName)) {

                    for (int x = 0; x < branchesList.get(i).customerList.get(j).transactionList.size(); x++) {

                        System.out.println("The branch of the customer is: " +
                                branchesList.get(i).getBranchName() + ", And the Transaction is: " +
                                branchesList.get(i).customerList.get(j).transactionList.get(x));

                        System.out.println("size" + branchesList.get(i).customerList.get(j).transactionList.size());
                    }
                }
            }
        }
    }

    public void addTransaction(String customerName, double transactionAmount) {

        for (int i = 0; i < branchesList.size(); i++) {

            for (int j = 0; j < branchesList.get(i).customerList.size(); j++) {

                if (branchesList.get(i).customerList.get(j).getCustomerName().equals(customerName)) {

                    branchesList.get(i).customerList.get(j).transactionList.add(transactionAmount);
                }
            }

        }
    }

}
