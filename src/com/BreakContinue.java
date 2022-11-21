package com;

public class BreakContinue {

    //1st way to name a method:-
    public static void run(){

    }

    // 2nd way to name a method:-
    public static void cookingIsGreat(){
        // camel case convention
    }

    public static void main(String[] args) {

        // why do we use loops ? :-

        //1-saving the lines in a code:-
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");

        //2- to avoid repeatition:-
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

        //3- to save time:-
        System.out.println("1 2 3 4 5 6 7 8 9 10");

        // what is the main difference between for loop and while loop?

        // syntax difference :-
        // for loop :- initialization , condition , increment / decrement
        //              statement
        // while loop :- condition , statement , increment / decrement

        // major similarity :- entry controlled loops

        // major difference :-
        // for loop is used when => fixed number of iterations
        // while loop is used when => when fixed number of iterations are
        // unknown.

        // the java break statement in for loop :-
        for(int j=0; j<=100; j++){
            System.out.println(j);
            if(j==50){ // jump-statement
                break;
            }
        }

        // the java break statement in nested for loop :-
        for(int a=0; a<=3 ; a++){ //outer loop
           for(int b=0; b<=3; b++){ // inner loop
               if(b==2){
                   break;
               }
               System.out.println(a +" "+b);
           }
        }

        // the java continue statement in for loop :-
        for(int j=0; j<=100; j++){
            if(j==50){ // jump-statement
                continue;
            }
            System.out.println(j);
        }

        // the java continue statement in nested for loop :-
        for(int a=0; a<=3 ; a++){ //outer loop
            for(int b=0; b<=3; b++){ // inner loop
                if(b==2){
                    continue;
                }
                System.out.println(a +" "+b);
            }
        }

        // coding standards for constants :-
        final int STUDENT = 10;
        final int STUDENT_SEAT_NUMBER = 23345;
        System.out.println(STUDENT_SEAT_NUMBER);

    }
}
