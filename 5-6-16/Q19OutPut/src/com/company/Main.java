package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean doesSignificantWork = false;
        boolean makesBreakthrough = false;
        boolean noblePrizeCandidate = false;

        if(doesSignificantWork){
            if(makesBreakthrough){
                noblePrizeCandidate = true;
            }
            else{
                noblePrizeCandidate = false;
            }
        }
        else if(!doesSignificantWork){
            noblePrizeCandidate = false;
        }
        System.out.println("Print all variable values");
        System.out.println("doesSignificantWork : "+ doesSignificantWork);
        System.out.println("makesBreakthrough : "+ makesBreakthrough);
        System.out.println("noblePrizeCandidate : "+ noblePrizeCandidate);
    }
}
