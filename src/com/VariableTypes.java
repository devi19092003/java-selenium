package com;

public class VariableTypes {

    //defining an instance variable :-
     int b = 10;

    //defining a static variable :-
     static int a = 50; // class variable
     static int number ;
     static String name ;
     static boolean bool ;

    //creating a normal/non-static method :-
    public void m1(){
        int c = 30;
        System.out.println("value of m1 method "+c);
        //we can call a static method inside a non-static method
        m2();
    }

    //defining a static method :- (class level methods)
     public  static  void m2(){
         // static int m = 87;
         System.out.println("Hello I am a static method!");
     }

     //how to define a static block :-
        static {
        //role => providing values to above declared static variable
         number = 100;
         name = "Ram";
         bool = true;
         System.out.println("Hi I am a Static Block!!");
         System.out.println(number+" "+name+" "+bool);
     }

     public static void main(String[] args) {

        //we cannot define static variable in static main method
       // static int c = 90;

        VariableTypes vt = new VariableTypes();
        System.out.println(vt.b);

        System.out.println(a);

        //accessing a normal/non-static method in main
        // m1(); => compilation error

        //always access with the help of object (instance variable / non-ststic method)
          vt.m1();

        //1-accessing a static method in main(most recommended)
          m2();

        //2-accessing a static method in main using only class name
        VariableTypes.m2();

        //3-accessing a static method in main using an object(not needed)
         vt.m2();
    }
}
