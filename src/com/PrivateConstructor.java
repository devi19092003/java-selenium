package com;

public class PrivateConstructor {

    static int a = 78;
    static String str = "Private";

    //creating a private constructor :-
     private PrivateConstructor(){

     }

     // for static methods you can use private constructor :-
       public static void m1(){
           System.out.println("private method");
       }

    public static void main(String[] args) {

         PrivateConstructor pc = new PrivateConstructor();

        System.out.println(a);
        System.out.println(str);
        m1();
    }
}
