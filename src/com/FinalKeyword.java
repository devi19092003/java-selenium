package com;

public final class FinalKeyword {

    //final variable :-
      final int a = 10;
        //a = 20;

    //blank final variable :-
      final int c ;

     int b = 20;

     //static final variable :-
     static final int e = 70;

     //static final blank variable :-
      static final int d;

     FinalKeyword(){
         c = 50;
     }

     static {
         d=90;
     }

     //final method :-
    public final void m1(int a , int b){
        System.out.println("final method "+a+" "+b);
    }

    public final void m1(int a , int b,int c){
        System.out.println("final method "+a+" "+b);
    }

    public final void m1(int a , int b, int c, int d){
        System.out.println("final method "+a+" "+b);
    }

}
