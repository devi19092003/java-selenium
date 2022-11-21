package com;

public class EncapsulatedClass {

    //define all the data members as private :-
    private int a = 10;
    private int b = 20;
    private int c = 30;
    private int d = 40;
    private int e = 50;

    private int num1;
    private int num2;
    private int num3;

    //setter method is used to set values for variables :-

    public void setNum1(int num1) {
        this.num1 = num1;
        System.out.println(num1);
    }

    public void setNum2(int num2) {
        this.num2 = num2;
        System.out.println(num2);
    }

    public void setNum3(int num3) {
        this.num3 = num3;
        System.out.println(num3);
    }

    //how to access these private data values :-

    //writing getter method to read or get data.
      public int getA(){
          return a;
      }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }
}
