package com.company.com.company.chapter_2;

public class unit_2_operators {
     public static void main(String[] args){

         // Types of Operators

         // Arithmatic Operators
         System.out.println("Arithmatic Operators");
         int a = 5;
         int b = 5 + a;
         System.out.println(b);

         int a1 = 6;
         int b1 = 8 % a;   //  ('%' Modulo Operator)
         System.out.println(b1);

         // Assignment Operators
         System.out.println("Assignment Operators");
         int a2 = 9;
         int b2 = 10;
         b2 += 3;
         System.out.println(b2);

         // Comparison Operators
         System.out.println("Comparison Operators");
         int a3 = 11;
         int b3 = 66;
         System.out.println(b3>55);
         System.out.println(b3==6);
         System.out.println(b3<=96);

         // logical Operators
         System.out.println("logical Operators");
         int a4 = 50;
         int b4 = 60;
         System.out.println(b4 > a4 || a4 > b4);
         System.out.println(b4 > a4 && a4 > b4);
         System.out.println(b4 > a4 && a4 > b4 || b4 >30);
         System.out.println(b4 > a4);

         //Bitwise Operator
         System.out.println("Bitwise Operator");
         System.out.println(2&3);
         System.out.println(2|3);
         System.out.println(2&2);
         System.out.println(2|2);

     }
 }
