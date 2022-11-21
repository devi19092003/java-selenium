package com;

public class Borrower extends Partner {

    Borrower(int a,int b,int c){
       super(a,b,c);
    }

    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    public static void main(String[] args) {
        Borrower b = new Borrower(10,20,30);
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);

        //upcasting :-
       // Partner p = new Borrower();
       // p.m2();

        b.m1();
        b.m2();
    }
}
