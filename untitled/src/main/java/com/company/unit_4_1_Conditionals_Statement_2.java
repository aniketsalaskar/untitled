package com.company;
import java.util.Scanner;

public class unit_4_1_Conditionals_Statement_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //if-else-if Conditional Statement
        System.out.println("***if-else-if Conditional Statement***");
        System.out.println("Enter your Age ");
        int age = input.nextInt();
        System.out.println("Your are " + age+ " years old");
        if(50<age){
            System.out.println("You are Experienced!");
        }
        else if(40<age){
            System.out.println("You are Semi-Experienced!");
        }
        else if(25<age){
            System.out.println("You are Not have much Experience!");
        }
        else{
            System.out.println("You are Fresher");
        }



    }
}