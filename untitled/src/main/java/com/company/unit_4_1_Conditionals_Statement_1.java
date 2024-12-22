package com.company;

public class unit_4_1_Conditionals_Statement_1 {
    public static void main(String[] args) {
        System.out.println("*****If - else conditions*****");
        int age = 18;
        if (age > 18) {
            System.out.println("You are Eligible for Appling Driving Licence ");
        } else {
            System.out.println("You are not Eligible for Apppling Driving License");
        }

        System.out.println("\n****If - else conditions by using Relational Operator****");
        if (age >= 18) {
            System.out.println("You are Eligible for Appling Driving Licence ");
        } else {
            System.out.println("You are not Eligible for Apppling Driving License");
        }

        System.out.println("\n****If - else conditions by using logical Operator****");
        boolean a = true;
        boolean b = false;

        // AND Operator
        System.out.println("---AND OPERATOR---");
        if (a && b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        // OR Operator
        System.out.println("---OR OPERATOR---");
        if (a || b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }


        // AND Operator & OR Operator
        System.out.println("---AND OPERATOR & OR OPERATOR---");
        if ( a && b || a || b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        //NOT Operator
        System.out.println("---NOT OPERATOR---");
        b = !b;
        System.out.println("NOT A is " + !a + "\nNOT B is " + b);

    }
}