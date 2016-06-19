package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("******************UNIVERSITY MANAGEMENT***********************");
        System.out.println("Press 1 for Teacher record");
        System.out.println("Press 2 for Student record");
        System.out.println("Press 3 to exit");


        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if(i == 1){
            System.out.println("*********************TEACHER************************");
            System.out.println("Press 1 to insert into the record");
            System.out.println("Press 2 to show");
            System.out.println("Press 3 to exit");
            /*System.out.println("Tname \t\t Regno \t\t Qualification \t\t1 Dept");
            Teacher in = new Teacher();
            in.Insert();
            */
        }
        if(i == 2){
            System.out.println("******************STUDENT**********************");
            System.out.println("Press 1 to insert into the record");
            System.out.println("Press 2 to show");
            System.out.println("Press 3 to exit");


        }
        if(i == 3){

        }
    }
}
