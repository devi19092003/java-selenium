package com;

public class VariableNModifier {

    //access modifier declaration :-
    //1-private modifier :- ( accessed within class only)
    private int mod1 = 10;

    //2-default modifier :- (access is not given then it is default)
    String fruit = "Apple";
    String season = "Winter";

    //3-public modifier :- (can be accessed anywhere)
    public int y = 34;

    public void m3(){

        System.out.println("Hello i am a public method!");
    }

   //creating an instance variable without initializing:-
     String name;
     float f1;

   //creating a static variable without initializing :-
    static double db;
    static short s;

    static int d = 67;

    public void m1(){
        //  defining a as a local variable :-
        int a = 20;
        int num;

        // final modifier is allowed
        final int number = 890;

        // accessing local variable without initializing:-
        // System.out.println(num);

        System.out.println(a);

        //private modifier
        System.out.println(mod1);

        // access modifiers are not alloed with local variables
        // public int number1 = 67;
        // private int number2 = 90;
        // protected int number4 = 90;

        // local variable cannot be used with static keyword
       // static int b = 27;
    }

    //creating a private method :-
      private void m2(){
          System.out.println("hi i am a private method!");
          System.out.println(mod1);
      }

    public static void main(String[] args) {

        VariableNModifier vt = new VariableNModifier();

        //accessing instance variables:-
        System.out.println(vt.name);
        System.out.println(vt.f1);

        //accessing static variables:-
        System.out.println(db);
        System.out.println(s);

        //accessing local variable inside main
        // System.out.println(a);

        // static int c = 90;

        //private modifier
        System.out.println(vt.mod1);

        //private method
        vt.m2();

        System.out.println(vt.fruit);
        System.out.println(vt.season);

        //accessing public variable and method :-
        vt.m3();
        System.out.println(vt.y);

    }
}
