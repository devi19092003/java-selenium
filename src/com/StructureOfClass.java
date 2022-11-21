package com;

//skeleton of a class and what does a class consist of :-

// class creation :-
public class StructureOfClass {

    //fields :-
     int a = 30;

    //constructors :-
     StructureOfClass(){
         System.out.println("default constructor!!");
     }

     //blocks :-
       static {
         System.out.println("static block!!");

     }

     // methods :-
       public  void m1(){
           System.out.println("method");
       }

     //advantages of using a method in java :-
       public void addition(){
         int a = 20, b = 30;
           System.out.println(a+b);
       }

       public void add(int num1 , int num2){
           System.out.println(num1+num2);
       }

     // main method :-
     public static void main(String[] args) {

         StructureOfClass sc = new StructureOfClass();
         sc.addition();

         sc.add(10,20);
         sc.add(30,40);
         sc.add(40,50);
         sc.add(3,4);

     }
}
