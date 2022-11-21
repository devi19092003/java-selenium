package com;

public class MethodOverloading {

    //method overloading :-

    public void addition(int a,int b){
        System.out.println(a+b);
    }

    //Interview question :-
    //will we get an error after just switching parameters ?
   /* public void addition(int a,int b){
        System.out.println(a+b);
    }

    public void addition(int b,int a){
        System.out.println(a+b);
    }*/

   /* public int addition(int a,int b){
        System.out.println(a+b);
        return (a+b);
    }*/

    //what happens if we wanted to add three or four numbers :-

    public void addition(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public void addition(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }

    public void addition(float a,float b){
        System.out.println(a+b);
    }


    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();
        mo.addition(10,20);
        mo.addition(10,20,30);
        mo.addition(10,20,30,40);
        mo.addition(10.20f,10.34f);
    }


    //main method can be overloaded :-

    public static void main(String args){
        System.out.println("main with one string parameter "+args);
    }

    public static void main(){
        System.out.println("no parameters for this main method");
    }
}
