package com;

public class Female extends Human {

    //adding a new method to female class :-
      public void birth(){
          System.out.println("Woman can give birth!");
      }

    public static void main(String[] args) {

        Female f = new Female();
        f.Eating();
        f.Sleeping();
        f.Speaking();
        f.Walking();
        f.birth();

    }
}
