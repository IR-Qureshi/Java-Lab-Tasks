package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i =0;
        int j =0;
        String primeNos = " ";

        for (i=1; i<=100 ; i++){
            int count =0;
           for(j=i ; j>=1; j--){
               if(i % j ==0){
                  count = count + 1;
               }
           }
            if(count == 2){
                System.out.println(i);

            }

        }
    }
}
