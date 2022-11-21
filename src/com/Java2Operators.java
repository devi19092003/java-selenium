package com;

public class Java2Operators {
    public static void main(String[] args) {

        // 2 - Arithmetic operators :- (+,-,*,/,%)

        int a = 20;
        int b = 10;

        // a-Addition (+)
        System.out.println("The addition of 10 and 20 is : "+(a+b));

        // b-Subtraction (-)
        System.out.println("The Subtraction of 10 and 20 is : "+(a-b));

        // c-Multiplication (*)
        System.out.println("The Multiplication of 10 and 20 is : "+(a*b));

        // d-Division (/) Returns Quotient
        System.out.println("The Division of 10 and 20 is : "+(a/b));

        // e-Modulus (%) Returns Remainder
        System.out.println("The Modulus of 10 and 20 is : "+(a%b));

        // 3 Relational operators :-
        // equality (==,!=)

        int num1 = 5;
        int num2 = 5;
        int num3 = 3;

        if (num1==num2) // checking whether two nos are equal
        {
            System.out.println("Both the numbers are same.");
        }

        if(num1!=num3) // checking whether two nos are not equal
        {
            System.out.println("Both the numbers are different.");
        }

        // comparison (<,>,<=,>=)

        if(num3<num1) //(3<5) => true
        {
            System.out.println("3 is always less than 5");
        }

        if(num2>num3) //(5>3) => true
        {
            System.out.println("5 is always greater than 3");
        }

        if(num3<=num1) //(3<=5) => true
        {
            System.out.println("3 is not equal to 5 but , 3 is less than 5");
        }

        if(num2>=num3) //(5>=3) => true
        {
            System.out.println("5 is not equal to 3 but, 5 is greater than 3");
        }

        // 4-Logical operators :-


        // a- Logical AND (&&)
        // A => num1==num2 => 5 == 5 => true
        // B => num3!=num2 => 3 != 5 => true
        if(num1==num2&&num3!=num2) {
            System.out.println("both the conditions are true!");
        }

        // b-Logical OR (||)
        // A => num1!=num2 => 5 != 5 => false
        // B => num1!=num3 => 5 != 3 => true
        if(num1!=num2||num1!=num3){
            System.out.println("second condition is true!");
        }

        // String concatenation operator (+)
        String m = "Summer Season";
        String n = "Mango Fruit";
        System.out.println(m+" "+n);

        String p = "Pollution level :";
        int pl = 98;
        System.out.println(p+" "+pl);

        int x = 5;
        int y = 7;
        System.out.println(x+y);

        System.out.println(x&y); // 5
        System.out.println(x|y); // 7

    }
}
