package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 post increment: " + num1++);
        System.out.println("num2 pre increment: " + ++num2);
        int num3 = num1++ + ++num2;
        System.out.println("num3 result: " + num3);
        int num4 = num3++ + ++num1 + num2++;
        System.out.println("num4 result: " + num4);
        num2 = num2 + 2;
        System.out.println("num2 result: " + num2);
        int num5 = num4++ + ++num4 + ++num1 + num2++;
        System.out.println("num5 result: " + num5);
        num4 = num5 + 4;
        System.out.println("num4 result: " + num4);


    }
}
