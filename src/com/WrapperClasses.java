package com;

public class WrapperClasses {

    public static void main(String[] args) {

        //autoboxing :-
        int a = 20;
        Integer i = a;
       // Short s = a;
      //  Float f = a;

        //unboxing :-
        int c = i;

        System.out.println(a);
        System.out.println(i);
        System.out.println(c);

        float f = 20.23f;
        Float afloat = f;
        System.out.println(f);
        System.out.println(afloat.intValue());

        Integer hundred = Integer.valueOf("100");
        System.out.println(hundred);



    }



}
