package com;

public class TransGender extends Human {

    //adding a new method in transgender class :-
      public void blessings(){
          System.out.println("They give blessings to everyone!");
      }

    public static void main(String[] args) {

        TransGender t = new TransGender();
        t.Eating();
        t.Sleeping();
        t.Speaking();
        t.Walking();
        t.blessings();
        t.Education();

    }
}
