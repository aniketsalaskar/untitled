package com.company;
import java.util.Scanner;


public class Unit_3_1_String {
    public static void main(String[] args){
        String s = new String("*** String ***");
        System.out.println(s);
        String name = "Aniket";
        System.out.print("The name is ");
        System.out.println(name);

        int a = 6;
        float b = 5.654f;
        System.out.printf("The value of a is %d and value of b is %f ", a, b);
        System.out.println("");
        System.out.printf("The value of a is %d and value of b is %5.1f ", a, b);
        System.out.println("");
        System.out.format("The value of a is %d and value of b is %f ", a, b);
        System.out.println("");

        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String  a1 = sc.nextLine(); //First word of a Sentence
        String  a2 = sc.nextLine(); // Whole Sentence
        System.out.print("your first string is " + a1 );
        System.out.println("your second string is " + a2 );

    }
}
