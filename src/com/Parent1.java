package com;

public class Parent1 {

    //creating instance variable for parent class :-
      int a = 20;

    //creating a default constructor of parent class :-
       Parent1(){
           System.out.println("Parent1 Constructor");
       }

       Parent1(int a,int b){
           System.out.println("Parameterized constructor "+(a+b));
       }

      public void m1(){
          System.out.println("Parent1 m1 method");
      }
}
