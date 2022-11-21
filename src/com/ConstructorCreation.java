package com;

public class ConstructorCreation {

    //creating instance variables for all types :-
    // no values are initialized
    int a;
    char c;
    boolean b;
    short s;
    byte bt;
    float f;
    long l;
    double d;
    String name;

    //defining/creating a constructor
    // default constructor
   ConstructorCreation(){

   }

  /* int ConstructorCreation(){

    } => wrong way*/

    public static void main(String[] args) {

        ConstructorCreation ct = new ConstructorCreation();

        System.out.println("Value of integer datatype "+ct.a);
        System.out.println("Value of character datatype "+ct.c);
        System.out.println("Value of boolean datatype "+ct.b);
        System.out.println("Value of short datatype "+ct.s);
        System.out.println("Value of byte datatype "+ct.bt);
        System.out.println("Value of float datatype "+ct.f);
        System.out.println("Value of long datatype "+ct.l);
        System.out.println("Value of double datatype "+ct.d);
        System.out.println("Value of string datatype "+ct.name);

    }
}
