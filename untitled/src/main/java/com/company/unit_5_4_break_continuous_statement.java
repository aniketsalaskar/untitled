package com.company;

public class unit_5_4_break_continuous_statement{
    public static void main(String[] args){
        int n =10;
        System.out.println("For loop Using Break statement");
        for(int i=0; i<n;i++){
            int num = i + 1;
            System.out.println("Your '"+ num + "' time Iteration is " + i);
            if(i==4){
                System.out.println("Your Code gets over \n");
                break;
            }
        }

        System.out.println("For loop Using Continuous statement");
        for(int i=0; i<n; i++){
            if(i==4){
                continue;
            }
            int num = i + 1;
            System.out.println("Your '"+ num + "' time Iteration is " + i);
        }
    }

}
