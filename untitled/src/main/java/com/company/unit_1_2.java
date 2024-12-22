package com.company;
import java.util.Scanner;

public class unit_1_2 {
    public static void main(String[] args){
        System.out.println("Enter Input");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b =  sc.nextInt();
        int sum = a + b;

        System.out.println("Enter Float Value 1 ");
        float a1 = sc.nextFloat();
        System.out.println("Enter Float Value 2 ");
        Float b1 = sc.nextFloat();
        Float sum1 = a1 + b1;

        System.out.println("Enter your String ");
        String srt = sc.nextLine();

        System.out.println("Your String is this "+ srt);

        System.out.println("The Sum of Integer " + sum);
        System.out.println("The Sum of Float = " + sum1);



    }
}
