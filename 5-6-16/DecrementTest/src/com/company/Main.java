package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 3;
        System.out.println("i value:" + i);
        int j = i-- + 2;
        System.out.println("j value:" + j);
        int k = --j - i--;
        System.out.println("k value:" + k);
        int l = k-- - --j + i-- + --i;
        System.out.println("l value:" + l);
    }
}
