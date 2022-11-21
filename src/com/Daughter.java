package com;

public class Daughter extends FatherMother {

    public void Marriage(int a,int b){
        System.out.println("I want to marry with my own choice "+(a+b));
    }

    public static void main(String[] args) {

        Daughter d = new Daughter();
        d.Marriage(10,20);
        d.Marriage(30,50);

    }

}
