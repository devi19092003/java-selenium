package com;

public interface Printable {

    int a = 10;
    int b = 20;
    int c = 30;

    void print();

    //default method :- having own implementation body
      default void m2(){
          System.out.println("default method");
      }

    //static method
      static void m3(){
          System.out.println("static method");
      }


}
