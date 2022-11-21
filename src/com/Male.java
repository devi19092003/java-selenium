package com;

public class Male extends Human {

    //creating a new method in male class :-
      public  void Shaving(){
          System.out.println("Males can shave!");
      }

      public  void Education(){
          System.out.println("Males take education");
      }

    public static void main(String[] args) {

        Male m = new Male();
        m.Eating();
        m.Sleeping();
        m.Walking();
        m.Speaking();
        m.Shaving();

    }
}
