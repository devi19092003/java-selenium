package com;

public class Practice implements Showable,Digital,Printable {

    @Override
    public void print() {
        System.out.println(" common Implementation");
    }

    @Override
    public void show() {
        System.out.println("showing");
    }

    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    public static void main(String[] args) {

        Practice p = new Practice();
        p.print();
        p.m1();
        p.show();

    }
}
