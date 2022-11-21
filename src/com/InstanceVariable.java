package com;

public class InstanceVariable {

    // instance variable declaration :-
    // outside / before main
       int a = 50; //class level variable

    //creating instance variables using access modifiers :-
    public int num1 = 10;
    private int num2 = 20;
    protected int num3 = 30;

    //created a separate method and define variable inside it
    public void m1(){
        //variable in a method
        int c = 30;
    }

    public static void main(String[] args) {

        // define inside main
        int b = 20;

        //length variable is only applicable for arrays

        int[] arr1 = new int[] {1,2,3,4,5};
        System.out.println(arr1.length);

        String[][] arr2 = new String[][] {{"Mangala","Bharat"},{"Jagruti","Vishal"}};
        System.out.println(arr2.length);
        System.out.println(arr2[0][0].length());

        String[] arr3 = new String[] {"Avinash","Devendra","Gaurav","Neelam"};
        System.out.println(arr3.length);
        System.out.println(arr3[1].length());

        String S = "Digital Partners";
        System.out.println(S.length());

        //accessing b variable:-
        System.out.println("value of b is "+b);

        //accessing a variable:-
       // System.out.println("value of a is "+a); => wrong

        //accessing c variable:-
        //System.out.println("value of c is "+c); => wrong

        //creating object for our class:-
        //here t is your reference variable
        InstanceVariable t = new InstanceVariable();
        System.out.println("value of a is "+t.a);

        //this will always give you compilation error
        //System.out.println("value of c is "+t.c);
        //System.out.println("value of b is "+t.b);
    }
}
