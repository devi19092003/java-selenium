package com;

public class ShiftOperators {
    public static void main(String[] args) {

        // shift operators :-

        int a = 5;
        int b = 7;
        int c = 10;
        int d = 9;

        //1-Left shift operators (<<)
        //(a<<2) => (5<<2) => 0101<<2 => 20 => 010100
        System.out.println("Left shift operator "+(a<<2));

        //2-Right shift operators (>>)
        //(a>>2) => (5>>2) => 0101>>2 => 1 => 00001
        System.out.println("Right shift operator "+(a>>2));

        //3-Unsigned Right shift operator (>>>)
        //(a>>>2) => (5>>>2) => 0101>>>2 => 1 => 0001
        System.out.println("Unsigned Right shift operator "+(a>>>2));

        // BITWISE NOT OPERATOR (NEGATION/NEGATE)
        int x = 0001; //1110
        System.out.println("Negation of 0001 is "+(~x));
        System.out.println("Negation of 0101 is "+(~a));
        System.out.println(~0001);

        // BITWISE XOR OPERATOR (^)
        //(a^b) => (5^7)/(5 XOR 7) => (0101 ^0111) => 2 => 0010
        System.out.println("5 XOR 7 is "+(a^b));

        // TERNARY OPERATOR (?:)
        int max = (a>b) ? a : b;
        // max = (5>7) ? 5 : 7;
        // max = 7;
        System.out.println("Maximum number is : "+max);

        System.out.println("Maximum number is : "+((c>d) ? c : d));
        // (c>d) ? c : d
        // (10>9) ? 10 : 9
        // 10
    }
}
