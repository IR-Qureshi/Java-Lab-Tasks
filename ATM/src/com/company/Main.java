package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int pin = 2369;
        int balance = 20000;
        int amount;
        int input;
        int selectOpt;

        do{
            System.out.println("\t\t\tWELCOME TO ATM MANAGEMENT SYSTEM");
            System.out.println("\t\t\t=================================");
            System.out.println("Please enter a Pin to enter : ");


            Scanner sc = new Scanner(System.in);
            input= sc.nextInt();

            if(input == pin){

                do{
                    System.out.println("\t\t\tWELCOME TO YOUR ACCOUNT");
                    System.out.println("\t\t\t=======================");
                    System.out.println();
                    System.out.println("Please select for the operation to perform : ");
                    System.out.println(" 1. Balance Inquiry");
                    System.out.println(" 2. Withdraw transactions ");
                    selectOpt = sc.nextInt();
                        switch (selectOpt) {
                            case 1:
                                System.out.println("\t\t\tWELCOME TO BALANCE INQUIRY MENU");
                                System.out.println("\t\t\t===============================");
                                System.out.println();
                                System.out.print("Your balance is : " + balance);
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("\t\t\tWELCOME TO WITHDRAW TRANSACTION MENU");
                                System.out.println("\t\t\t====================================");
                                System.out.println();
                                System.out.print("Enter the amount to withdraw : ");
                                amount = sc.nextInt();
                                if (amount <= balance) {
                                    System.out.println();
                                    System.out.println("Successfully withdraw");
                                    System.out.println("Thank you for using our services...!!");
                                    balance = balance - amount;
                                    System.out.println();

                                } else {
                                    System.out.println("Amount exceeds to your balance ");
                                    System.out.println("Please enter a correct amount ");
                                }
                                break;
                            default:
                                System.out.print("\n Please enter the correct input....!!");
                                System.out.println();

                        }


                }
                while (selectOpt != 3);
                return;
            }

        }

        while (input != pin) ;



        }
    }

