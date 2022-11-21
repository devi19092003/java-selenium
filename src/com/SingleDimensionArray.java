package com;

public class SingleDimensionArray {
    public static void main(String[] args) {

        // only a single variable can store only one value at a time.
        int a = 10;

        // no one variable can store multiple values at once
        // int b = 10 20 30 40 50; => invalid

        // we will use arrays
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num100 = 100;

        // we will use loops
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num100);

        // different ways of declaring/creating an array :-
        // 1st way:-(most recommended)
        int[] intArray1;

        // 2nd way :-
        int []intArray2;

        // 3rd way:-
        int intArray3[];

        // allocating memory to an array:-
        // wrong way:-
        //int [5]intArray4;

        //right way:- (use new keyword)
        int[] intArray5 = new int[10];



    }
}
