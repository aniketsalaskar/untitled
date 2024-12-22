package com.company;

public class unit_6_1_array {
    public static void main(String[] args){

        // Different Way of Writing a Array

        // Declaration and Memory alocation
        int[] marks = new int[3];
        marks[0] = 60;
        marks[1] = 80;
        marks[2] = 90;
        System.out.println("Marks = " + marks[0]);

        // Declaration and then memory alocation
        int[] classes;  // Declaration
        classes = new int[3]; // memory alocation
        classes[0] = 1;
        classes[1] = 2;
        classes[2] = 3;
        System.out.println("Class = "+ classes[2]);


        // Declaration, Memory alocation and Initialization
        String[] teacher = {"aniket","rajat","darshan","adarsh"};
        System.out.println("Teacher = "+ teacher[3]);

    }
}
