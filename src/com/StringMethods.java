package com;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
         String s1 = "Jagruti ";
         String s2 = "Patil";

         //concat method :-
        System.out.println(s1.concat(s2));

        //split method :-
        String s3 = "Runny Sunny Windy Cloudy";
        String[] ss = s3.split(" ");
        System.out.println(ss);

        //using for each loop to fetch values :-
        for (String a : ss){
            System.out.println(a);
        }

        //using for loop to fetch values :-
        for(int i = 0; i<=ss.length-1; i++){
            System.out.println(ss[i]);
        }

        //touppercase method :-
        String s4 = "australia";
        System.out.println(s4.toUpperCase());

        //tolowercase method :-
        String s5 = "AUSTRALIA";
        System.out.println(s5.toLowerCase());

        //trim method :-
        String s6 = "    Taj Mahal       ";
        String s7 = "Qutub Minar         ";
        String s8 = "           Golden Temple";

        System.out.println("Before Trim ");
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);

        System.out.println("After Trim ");
        System.out.println(s6.trim());
        System.out.println(s7.trim());
        System.out.println(s8.trim());

        //write the program of the reverse string :-
        String s9 = "potato";
        //output :- otatop

        for(int i = s9.length()-1; i>=0; i--){
            System.out.print(s9.charAt(i));
        }

        //string buffer class defined in 3 ways :-
        StringBuffer sa = new StringBuffer();
        StringBuffer sb = new StringBuffer(10);
        StringBuffer sc = new StringBuffer("Digital Partners");

        String s10 = " Devendra";
        String s11 = "Lilhare";
        StringBuffer sd = new StringBuffer(s10);

        //appending text :-
        System.out.println(sd.append(" is studying software testing"));

        //inserting text :-
        System.out.println(sd.insert(0,s11));

        //replacing text :-
        StringBuffer se = new StringBuffer(s9);
        System.out.println(se.replace(0,2,"tom"));

        //deleting text :-
        System.out.println(sd.delete(0,7));

        //reversing string :-
        System.out.println(sd.reverse());

        //scanner class :-
        System.out.println("Enter the String ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
    }
}
