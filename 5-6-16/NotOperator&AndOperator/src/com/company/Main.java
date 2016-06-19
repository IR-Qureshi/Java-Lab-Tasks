package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean var1 = true;
        boolean var2 = true;
        if(var1 && var2){
            System.out.println("if block execute var1 && var2");
        }
        else{
            System.out.println("else block execute var1 && var2");
        }

        if(!var1 && var2){
            System.out.println("if block execute !var && var2");
        }
        else{
            System.out.println("else block execute !var && var2");
        }

        var1 = false;
        var2 = false;

        if (!var1 && !var2){
            System.out.println("if block execute !var1 && !var2");
        }
        else{
            System.out.println("else block execute !var1 && !var2");
        }
    }
}
