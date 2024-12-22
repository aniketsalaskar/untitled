package com.company;
import java.util.Scanner;

public class unit_2_practice_set {
    public static void main(String[] args){
        // Question - 1
        System.out.println("***Question - 1***");
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);
        System.out.println(" ");

        // Question - 2
        System.out.println("***Question - 2***");
             //  encrypting the Grade
        char grade = 'A';
        grade = (char)(grade + 6);
        System.out.println("Grade are encrypted: " + grade);

             //  decrypting the Grade
        grade = (char)(grade - 6);
        System.out.println("Grade are decrypted: " + grade);
        System.out.println(" ");

        // Question - 3
        System.out.println("***Question - 3***");
        System.out.println("Enter the value of : ");
        Scanner sc = new Scanner(System.in);
        int a3 = sc.nextInt();
        System.out.println(a3 > 5);
        System.out.println(" ");

        //Question - 4
        System.out.println("***Question - 4***");
        int v = 2 ;
        int u = 6;
        int t = 5;
        System.out.println( v*v - (u*u) / (2*t*5));
        System.out.println(" ");

        //Question - 5
        System.out.println("***Question - 5***");
        int x = 7;
        int y = 7*49/7+35/5;
        System.out.println("Value of y : " + y);
    }

}
