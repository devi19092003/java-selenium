package com;

public class JavaLoops {
    public static void main(String[] args) {

        //  simple-if,if-else,else-if => conditional statements

        //1-simple if statement :- syntax
        //condition is true
        if(7==7){
            System.out.println("7 is equal to 7.");
        }

        //condition is false
        if(7==9){
            System.out.println("7 is not equal to 9");
        }

        //2-if else statement :- syntax
        //condition is true
        if(7==7){
            System.out.println("7 is always equal to 7.");
        }else{
            System.out.println("7 is not equal to 7.");
        }

        //condition is false
        if(7==9){
            System.out.println("condition is true");
        }else{
            System.out.println("7 is not equal to 9.");
        }

        //3-else if statement :- syntax
        // if condition is true
        if('@'=='@'){
            System.out.println("Both the @ symbols are same");
        }
        else if('$'=='$'){
            System.out.println("Both the symbols are same");
        }else{
            System.out.println("all the symbols are different.");
        }

        // else if condition is true
        if(7==0){
            System.out.println("condition is not true");
        }
        else if(7==7){
            System.out.println("Identical numbers are always equal!");
        }else{
            System.out.println("both the conditions are false.");
        }

        //when all the conditions are false
        if('a'=='o'){
            System.out.println("a is not equal to o");
        }
        else if ('A'=='P'){
            System.out.println("A is not equal to P");
        }else{
            System.out.println(" both the conditions are false");
        }

        // for loop :-
        for(int i=0; i<=10; i++){
            System.out.println("i= "+i);
        }

        for(int a=0; a<=10; ++a){
            System.out.println("a= "+a);
        }

        // nested for loop :-
        for(int j = 0; j<=2; j++){

            for(int k=0; k<=2; k++){

                System.out.println("j= "+j+" "+"k= "+k);
            }
        }

        // while loop :-
        int m = 0;
        int n = 10;

        while (m<=10){
            System.out.println("m = "+m);
            m++;
        }

        while (n>=0){
            System.out.println("n = "+n);
            n--;
        }

        // do while loop :-

        int p = 0;
        int q = 6;

        // when condition is true :-
        do{
            System.out.println("p = "+p);
            p++;
        }while(p<=5);

        // when condition is false :-
        do{
            System.out.println("q= "+q);
            q++;
        }while(q<=5);


    }
}
