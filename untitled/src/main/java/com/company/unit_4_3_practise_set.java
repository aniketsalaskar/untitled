package com.company;
import java.util.Scanner;

public class unit_4_3_practise_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Question 1
        System.out.println("***Question-1***");
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }


        // Question 2
        System.out.println("***Question-2***");
        System.out.println("Enter your Marks");
        System.out.println("Enter your sub1 marks");
        float sub1 = sc.nextInt();
        System.out.println("Enter your sub2 marks");
        float sub2 = sc.nextInt();
        System.out.println("Enter your sub3 marks");
        float sub3 = sc.nextInt();
        float percentage_sub1 = sub1/100 *100;
        System.out.println("Percentage of Sub1 = "+ percentage_sub1 + "%");
        float percentage_sub2 = sub2/100 *100;
        System.out.println("Percentage of Sub2 = "+ percentage_sub2 + "%");
        float percentage_sub3 = sub3/100 *100;
        System.out.println("Percentage of Sub3 = "+ percentage_sub3 + "%");

        float total_marks = 300;
        float total_marks_obtain = sub1 + sub2 + sub3;
        System.out.println("Total Marks Obtain = "+ total_marks_obtain);
        float total_percentage = total_marks_obtain/total_marks * 100.2f;
        System.out.println("Your Percentage  = "+ total_percentage + "%");

        if(percentage_sub1 >= 33 && percentage_sub2 >= 33 && percentage_sub3 >= 33 && total_marks_obtain >= 33 && total_percentage>= 40){
            System.out.println("Your Result = Pass");
        }
        else{
            System.out.println("Your Result = Fail");
        }


        // Question 3
        System.out.println("***Question-3***");
        System.out.println("Enter your Income in Lakhs");
        float tax = 0;
        float income = sc.nextFloat();
        if (income<2.5){
            tax = tax + 0;
        }
        else if (income >= 2.5f && income < 5.0f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>=5.0f && income<10.0f){
            tax = tax + 0.05f * (income - 2.5f);
            tax= tax + 0.2f * (income - 5.0f);
        }
        else if (income >= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("Total tax paid by Employee is : = "+ tax );


        // Question 4
        System.out.println("***Question -4***");
        System.out.println("Enter the Day");
        int day = sc.nextInt();
        switch(day) {
            case 1: {
                System.out.println("Today is a Sunday");
                break;
            }

            case 2: {
                System.out.println("Today is a Monday");
                break;
            }
            case 3: {
                System.out.println("Today is a Tuesday");
                break;
            }
            case 4: {
                System.out.println("Today is a Wednesday");
                break;
            }
            case 5: {
                System.out.println("Today is a Thursday");
                break;
            }
            case 6: {
                System.out.println("Today is a Friday");
                break;
            }
            case 7: {
                System.out.println("Today is a Saturday");
                break;
            }
            default: {
                System.out.println("Day is not a valid day");
            }
        }


        // Question -6
        System.out.println("***Question -6***");
        System.out.println("Enter your Webside");
        String user = sc.next();
        if(user.endsWith(".org")) {
            System.out.println("Your Website is an Organizational");
        }
        else if(user.endsWith(".com")) {
            System.out.println("Your Website is an Commercial");
        }
        else if(user.endsWith(".in")) {
            System.out.println("Your Website is a Indian ");
        }
        else{
            System.out.println("Your Website is unknown");
        }

    }
}
