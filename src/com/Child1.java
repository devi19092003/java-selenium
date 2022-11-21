package com;

public class Child1 extends Parent1 {

    //creating an instance variable :-
      int a = 40;

      // overridding m1 method in parent1 class :-
       public void m1(){

           //accessing parent class instance variable :-
           System.out.println("parent class variable value "+super.a);

           //accessing parent class method :-
           super.m1();

           System.out.println("Child m1 method");
       }

    //creating a default constructor of child class :-
        Child1(){

            //accessing parameterized constructor :-
            super(10,20);

            System.out.println("Child1 Constructor");

        }


    public static void main(String[] args) {

           //creating a normal object of child class :-
             Child1 c1 = new Child1();
             c1.m1();

             //accessing m1 method from parent class :-
             Parent1 p1 = new Parent1();
             p1.m1();

            //upcasting :-
              Parent1 p = new Child1();
              System.out.println(p.a);

              //downcasting :-
               Child1 c = (Child1)p;
               c.m1();
               System.out.println("value of instance variable in child class "+c.a);

             //try downcasting implicitly :-
             //  Child1 c = new Parent1();

            //accessing parent variable and method :-
              System.out.println(p.a);
              p.m1();
    }

   // webDriver driver = new ChromeDriver();
}
