package com.company;
import java.util.Scanner;

public class unit_4_1_Conditionals_Statement_3 {
    public static void main(String[] args) {

        //Nested if-else Conditional Statement
        System.out.println("Nested if-else Conditional Statement!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a and b ");
        int a = input.nextInt();
        int b = input.nextInt();

        if(a > 0 && b > 0 ){
            System.out.println("your value a = "+ a + " and b = "+ b);
            if(a>b){
                System.out.println("a is Greater than b");
            }
            else if (a<b){
                System.out.println("b is Greater than a");
            }
            else{
                System.out.println("a and b both are equal");
            }
        }
        else{
            System.out.println("You Entered Value is Less than 1 ");
        }
    }
}
