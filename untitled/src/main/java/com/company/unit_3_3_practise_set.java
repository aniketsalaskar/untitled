package com.company;
import java.util.Scanner;

public class unit_3_3_practise_set {
    public static void main(String[] args){

        // Question 1
        System.out.println("***Question - 1***");
        String str = "I am Aniket Salaskar";
        String lowercase =str.toLowerCase();
        System.out.println("Return String in Lower Case : "+ lowercase+"\n");

        // Question 2
        System.out.println("***Question - 2***");
        String replace  = str.replace(" ","_");
        System.out.println("Replaced String is : " + replace +"\n");

        //Question 3
        System.out.println("***Question - 3***");
        String letter = "Dear name, Thanks alot";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String userinput = sc.nextLine();
        String replace2 = letter.replace("name", userinput);
        System.out.println("Letter : " + replace2 +"\n");


        // Question 4
        System.out.println("***Question - 4***");
        String new1 = "hello Aniket    double";
        System.out.println(new1.indexOf("  ") + "\n");

        // Question 5
        System.out.println("***Question - 5***");
        String new2 = "Hello Aniket,\nThis Java Course is Nice.\nThanks";
        System.out.println(new2);

    }
}
