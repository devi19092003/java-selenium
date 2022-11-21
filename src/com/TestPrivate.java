package com;

public class TestPrivate {

    public static void main(String[] args) {

        EncapsulatedClass ec = new EncapsulatedClass();
        // System.out.println(ec.a);
       // System.out.println(ec.b);
       // System.out.println(ec.c);
      //  System.out.println(ec.d);
      //  System.out.println(ec.e);

        System.out.println(ec.getA());
        System.out.println(ec.getB());
        System.out.println(ec.getC());
        System.out.println(ec.getD());
        System.out.println(ec.getE());

        ec.setNum1(24);
        ec.setNum2(35);
        ec.setNum3(45);
    }
}
