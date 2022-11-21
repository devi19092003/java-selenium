package com;

public abstract class Partner {

    //instance variables :-
     int a , b ,c;

     //parameterized constructor :-
      Partner (int a,int b ,int c){
         this.a = a;
         this.b = b;
         this.c = c;
      }

    //default constructor :-
     Partner(){
         System.out.println("Constructor");
     }

    public abstract void m1(); //abstract method

    // public void m2(); => wrong in case of normal method

    //concrete method :-
    public void m2(){
        System.out.println("Hii!!");
    }

    //static method :-
    public static void m3(){
        System.out.println("static method");
    }

    public static void main(String[] args) {
      // Partner p = new Partner();
     //  p.m1();

    }
}
