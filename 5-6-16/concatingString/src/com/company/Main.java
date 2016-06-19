package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        String forthString = firstString+ " "+ secondString+ "," + thirdString;
        System.out.println(thirdString);
        System.out.println(forthString);
    }
}
