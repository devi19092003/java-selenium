package com;

public interface Digital {

   // int a; wrong :- value must be provided at the time of declaration

   //field in interface :-
    int a = 10;

   /* a=20;
     wrong :- variables are static and final in nature hence u cannot
               change value.*/

   //methods are abstract by default in interface :-
      void m1();
      void print();

}
