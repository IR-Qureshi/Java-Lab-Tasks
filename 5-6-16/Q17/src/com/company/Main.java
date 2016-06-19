package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int fuelPerLitre = 100;

        if(fuelPerLitre>=100 && fuelPerLitre<=150){
            System.out.println("Your fuel charges for 5 litres fuel will be is between Rs.500 and Rs.750");
        }
        if(fuelPerLitre>=90 && fuelPerLitre<100){
            System.out.println("Your fuel charges for 5 litres fuel will be is between Rs.450 and Rs.500");
        }
        if(fuelPerLitre <90 && fuelPerLitre>150){
            System.out.println("Your fuel charges for 5 litres fuel is not decided yet");
        }
    }
}
