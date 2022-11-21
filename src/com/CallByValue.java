package com;

public class CallByValue {

    int data = 50;

    public void m1(int data){
        data = data + 100;
        System.out.println(data);
    }

    public static void main(String[] args) {
        CallByValue cv = new CallByValue();

        System.out.println("Before change : "+cv.data);

        //call by value :-
        cv.m1(500);

        System.out.println("After change : "+cv.data);
    }

}
