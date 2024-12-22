package com.company;
import java.util.Scanner;

public class practice_1{
    public static void main(String[] args){
        int total_marks = 500;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks");

        System.out.println("Enter your English Marks");
        int english = sc.nextInt();

        System.out.println("Enter your Maths Marks");
        int maths = sc.nextInt();

        System.out.println("Enter your Science Marks");
        int science = sc.nextInt();

        System.out.println("Enter your SSD Marks ");
        int ssd = sc.nextInt();

        System.out.println("Enter your Hindi Marks ");
        int hindi = sc.nextInt();

        int sum = english + maths + science + ssd +hindi;
        System.out.println(" The Sum of your Marks is " + sum);

        float percentage = (float) sum / total_marks * 100 ;
        System.out.println("Percentage =" + percentage);

    }
}

