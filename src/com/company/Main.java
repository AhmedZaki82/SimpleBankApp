package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank();

    public static void main(String[] args) {

        printOptions();
        boolean cont = true;

        while (cont) {
            System.out.println("\nChoose a number: \n" );
            int choose = scanner.nextInt();

            switch (choose) {

                case 0:
                    printOptions();
                    break;

                case 1:
                    addBranch();
                    break;

                case 2:
                    addCustomer();
                    break;

                case 3:
                    addTransaction();
                    break;

                case 4:
                    displayCustomers();
                    break;

                case 5:
                    displayTransaction();
                    break;

                case 6:
                    displayBranches();
                    break;
            }
        }

    }

    public static void printOptions() {

        System.out.println("\nPress:" + "\t0.Display options." + "\t1.Add Branch." +
                "\t2.Add Customer." + "\t3.Add Transaction" + "\t4.Display customers." +
                "\t5.Display customer's transaction.\n" + "\t\t6.Display Branches.");
    }

    public static void addBranch() {
        System.out.println("Add the new branch: ");
        String branchName = scanner.next();
        branchName += scanner.nextLine();

        bank.branchesList.add(new Branch(branchName));
    }

    public static void displayBranches() {
        for (int i = 0; i < bank.branchesList.size(); i++) {

            System.out.println(bank.branchesList.get(i).getBranchName());
        }
    }

    public static void addCustomer() {

        System.out.println("Enter the name of the nearest branch: ");
        String branchName = scanner.next();
        branchName += scanner.nextLine();

        System.out.println("Pls, enter your name: ");
        String customerName = scanner.next();
        customerName += scanner.nextLine();

        System.out.println("Pls, enter the amount of the initial transaction: ");
        double initialTransaction = scanner.nextDouble();

        bank.addCustomer(branchName,customerName,initialTransaction);
    }

    public static void displayCustomers() {

        System.out.println("Enter the name of the branch: ");
        String branchName = scanner.next();
        branchName += scanner.nextLine();

        bank.displayBranchsCustomers(branchName);
    }

    public static void displayTransaction() {

        System.out.println("Enter your name to see your transaction: ");
        String name = scanner.next();
        name += scanner.nextLine();

        bank.displayCustomerTransaction(name);
    }

    public static void addTransaction() {

        System.out.println("Enter your name for the Transaction: ");
        String name = scanner.next();
        name += scanner.nextLine();

        System.out.println("Enter the amount of the Transaction: ");
        double amount = scanner.nextDouble();

        bank.addTransaction(name,amount);
    }
}
