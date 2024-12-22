package com.company;

public class unit_3_2_StringMethods {
    public static void main(String[] args) {
        String str = "I am Aniket";
        System.out.printf("Your String is '%s'", str );
        System.out.println();

        int l = str.length();  //  Reture length of String
        System.out.println("The length of String is "+ l);

        String lowercase = str.toLowerCase();  // Return Lower Case String
        System.out.println("Lower Case String : "+ lowercase);

        String uppercase = str.toUpperCase();  // Return UpperCase String
        System.out.println("Upper Case String : "+ uppercase);

        String substr = str.substring(5); // return Substring of String
        System.out.println("Substr Of String : "+ substr);

        String substr1 = str.substring(2,8); //  Return SubString Of String Form 2 to 8
        System.out.println("Substring of Sring Form Index 2 to 8 "+ substr1);  // 8 get excluded

        String str1 = "       Harry        ";
        String trim = str1.trim();  // return trim string
        System.out.println("Trimmed String : "+ trim);

        String replace_char= str.replace('A','B');  //Retrun New String Replacing A with B
        System.out.println("Replaced Char of String : "+ replace_char);

        String replace_string = str.replace("I am","My name is");  //Return New String Replacing "I am" with "My name is"
        System.out.println("Replaced String : " + replace_string );

        Boolean startwith = str.startsWith("I"); // Return boolean expression
        System.out.println("Startwith of String : "+ startwith);

        Boolean endwith = str.endsWith("et"); // Return boolean expression
        System.out.println("Endwith of String : " + endwith);

        char char_find = str.charAt(6); // Return Char of given index
        System.out.println("Char find of String : "+ char_find);

        String str2 = "Harrrry";
        int index = str2.indexOf("r"); // Return the Index  of Given String
        int index2 = str2.indexOf("r", 4); // Return the Index Of given String From Starting  index 4
        System.out.println("Index of Given String : " + index );
        System.out.println("Index of Given String : " + index2 );

        int lastindex1 = str2.lastIndexOf("r"); // Return Last Index of given String
        int lastindex2 = str2.lastIndexOf("r",4); // Return Last Index of given String before 4
        System.out.println();
        System.out.println();

        boolean check = str.equals("I am Aniket"); // Return Boolean Expression
        boolean check_ignore_case = str.equalsIgnoreCase("i am Aniket");//Return Boolean Expression igonre case
        System.out.println("String is present : " + check);
        System.out.println("String is present : " + check_ignore_case);

    }
}
