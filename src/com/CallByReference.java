package com;

public class CallByReference {

    int data = 50;

    public void m1(CallByReference cr){
        data = data + 100;
        System.out.println(data);
    }

    public static void main(String[] args) {
        CallByReference cr = new CallByReference();

        System.out.println("Before change : "+cr.data);

        //call by reference :-
        cr.m1(cr);

        System.out.println("After change : "+cr.data);
    }

}
