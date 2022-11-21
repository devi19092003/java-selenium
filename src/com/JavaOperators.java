package com;

public class JavaOperators {
    public static void main(String[] args) {

        // Unary operators :- single operand
        // 1-Increment
        // a-Pre-Increment (++x)

        int num1;
        num1 = 10;
        System.out.println(num1);
        System.out.println(++num1);

        // System.out.println(++(++num1)); => invalid
        System.out.println(++num1);

        // b-Post-Increment (x++)

        int num3;
        num3 = 5;

         int num4 = num3++;

        System.out.println(num3);
        System.out.println(num3++);
        System.out.println(num3);

        // 2-Decrement
        // a-Pre-Decrement (--x)

        int num2;
        num2 = 20;

        System.out.println(num2);
        System.out.println(--num2);

       // System.out.println(--(--num2)); => invalid
        System.out.println(--num2);

        // b-Post-Decrement (x--)

        int num5;
        num5 = 4;

        System.out.println("Initial value of num5 = "+num5);
        System.out.println(num5--);
        System.out.println("value of num5 after post decrement= "+num5);

        System.out.println(num5--);
        System.out.println(num5--);
        System.out.println(num5);



    }
}
