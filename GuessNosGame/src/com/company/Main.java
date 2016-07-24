package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random rn = new Random();
        int RanInput = rn.nextInt(10);
        int Input = RanInput;
        int select;
        int count = 0;
        int userInput;
        int recharge;
        int coin;
        int secondUserInput;

        do {
            System.out.println("\t\t\tGUESSING NUMBER GAME.......!!");
            System.out.println("\t\t\t==============================");
            System.out.println("Do you want to play this game??");
            System.out.print("Press 1 to enter & 2 to exit : ");

            Scanner sc = new Scanner(System.in);
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.println("\t\t\tWelcome to the game......!!");
                    System.out.println("\t\t\t============================");
                    System.out.println();
                    System.out.println("(Hint : Guess a number between 1-10)");
                    count = 0;
                    do {

                        System.out.print("Guess any number : ");
                        userInput = sc.nextInt();
                        //System.out.println(RanInput);

                        count++;

                        if (userInput == Input) {
                            System.out.println();
                            System.out.println("Congratulation You Win....!!");
                            break;
                        }


                    }
                    while (count != 3);

                    if (userInput != Input && count == 3) {
                        System.out.println();
                        System.out.println("Sorry you loose.......!!");
                        System.out.println();
                        System.out.println("Your free trial is over......!!");
                        System.out.println("Please recharge to play again");
                        System.out.print("If you want to recharge press 1 : ");
                        recharge = sc.nextInt();
                        if(recharge == 1){

                            System.out.println();
                            System.out.print("Please enter a amount to recharge : ");
                            coin = sc.nextInt();
                            System.out.println("Recharged successfully, now you can avail " + coin + " more attempts");
                            count = coin;
                            do {

                                System.out.print("Guess a number :");
                                secondUserInput = sc.nextInt();
                                count --;
                                if(secondUserInput == Input){
                                    System.out.println("Congratulation You Win....!!");
                                    break;
                                }

                                if(count == 0 && secondUserInput != Input){
                                    System.out.println();
                                    System.out.println("Sorry you loose Try Again.......!!");
                                }

                            }
                            while (count != 0);
                           // return;
                        }
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Good Bye.....!!");
                    break;
            }

            if (select != 1 && select != 2) {

                System.out.println();
                System.out.println("Sorry Wrong input....!!");
                System.out.println();
            }

        }
        while (select != 1 && select != 2);


    }
}
