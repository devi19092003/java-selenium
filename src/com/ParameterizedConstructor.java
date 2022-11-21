package com;

public class ParameterizedConstructor {

    //creating a parameterized constructor :-
    ParameterizedConstructor(int a, int b){
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {

        //creating a object for private constructor in another class :-
        // PrivateConstructor pc = new PrivateConstructor();

        ParameterizedConstructor pt = new ParameterizedConstructor(89,90);
        ParameterizedConstructor pt1 = new ParameterizedConstructor(30,40);
        ParameterizedConstructor pt2 = new ParameterizedConstructor(10,20);
    }
}
