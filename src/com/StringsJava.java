package com;

public class StringsJava {

    //string literals :-
    //to store a bunch of characters :-
    String s = "Rohit Sharma";
    // s = "aarti";
    String s1 = "Aarti sharma";
    // s1 = "strdtuy";

    String s3 = s1;

    //by new keyword :-
     String s4 = new String("Ratan tata");
     String s5 = new String("Aarti sharma");
     String s6 = new String("Ratan tata");


    //to store a single character :-
    char c = 'A';

    public static void main(String[] args) {

        StringsJava sj = new StringsJava();

        System.out.println(sj.s);
        System.out.println(sj.s1);
        System.out.println(sj.s3);

        sj.s = "drdtfggiyg";
        System.out.println(sj.s);

        //comparison based on addresses of strings (equal to operator) :-
        System.out.println(sj.s1==sj.s3);
        System.out.println(sj.s==sj.s1);

        //comparison based on content of strings (equals method) :-
        System.out.println(sj.s1.equals(sj.s4));
        System.out.println(sj.s1.equals(sj.s5));
        System.out.println(sj.s4.equals(sj.s6));
        System.out.println(sj.s4==sj.s6);

        //length method :-
        System.out.println(sj.s1.length());

        //charAt method :-
        System.out.println(sj.s1.charAt(3));
        System.out.println(sj.s1.charAt(11));
       // System.out.println(sj.s1.charAt(12));
       // System.out.println(sj.s1.charAt(-1));

        //compare to method :-
        String sa = "Summer season";
        String sb = "Mango";
        String sc = "Rain Rain go away";
        String sd = "Summer season";

        System.out.println(sa.compareTo(sb)); //1
        System.out.println(sa.compareTo(sc)); //-1
        System.out.println(sa.compareTo(sd)); //0

    }
}
