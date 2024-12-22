package com.company;

public class unit_2_operator_pre {
    public static void main(String[] args){

        // Precedence Associativity
        int a = 6*5-34/2;
        /*
            Left to Right
           = 30-17
           = 13
        */
        int b= 34/2-6*5;
        /*
            = 17-30
            = -13
        */
        System.out.println(a);
        System.out.println(b);

        // Quick Quiz
        System.out.println("****Quiz****");
        int x = 6;
        int y = 1;
        System.out.println(x*y/2);

        int x1=5;
        int y1=1;
        int z1=4;
        System.out.println(y1*y1 - (4*x1*z1) / (2*x1));   // "(" added
        System.out.println(y1*y1 - 4*x1*z1 / 2*x1);
    }
}
