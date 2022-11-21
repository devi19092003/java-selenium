package com;

public class ProblemWithoutThisKeyword {

    // creating instance Variables :-
       int rollNumber;
       String name;
       float fee;

   // creating a parameterized constructor :-
       ProblemWithoutThisKeyword(int rollNumber, String name, float fee){

           // this method is used to invoke/call current class constructor :-
           this();
           this.rollNumber = rollNumber;
           this.name = name;
           this.fee = fee;
           // this(); => error
       }

    // creating a default constructor :-
      ProblemWithoutThisKeyword(){
          System.out.println(" default constructor");
      }

   // creating a display method to print values :-
      public void display(){
          System.out.println(rollNumber+" "+name+" "+fee);
          this.m1();
      }

      // this keyword is also used to call current class method :-
      // creating a new method :-
        static void m1(){
             System.out.println("m1 method");
         }

    public static void main(String[] args) {

       // creating an object of the class :-
        ProblemWithoutThisKeyword pwt = new ProblemWithoutThisKeyword(1,"Bharat",1000.50f);
        ProblemWithoutThisKeyword pwt1 = new ProblemWithoutThisKeyword(2,"Jagruti",2000.25f);
        ProblemWithoutThisKeyword pwt2 = new ProblemWithoutThisKeyword(3,"Mangala",3000.75f);
        ProblemWithoutThisKeyword pwt3 = new ProblemWithoutThisKeyword(4,"Avinash",4000.35f);

        //calling the display method for all objects :-
        pwt.display();
        pwt1.display();
        pwt2.display();
        pwt3.display();

    }
}
