package com;

public class ExceptionHandling2 {

    /* 11th rule :- if you have exception in called method then we also
    *  need to handle that exception in calling method.*/

    /*12th rule :- you must always use the throws keyword with the throw
    * keyword.*/

    //throw keyword :-
    public static void verifyAge(int age) throws Exception{
        if(age<18){
            throw new Exception("you are not eligible for voting and driving");
            //System.out.println("you are not an adult");
        }else {
            System.out.println("you are an adult");
        }
    }


    public static void main(String[] args)  {

        /* 10th rule :- we cannot define multiple finally blocks

        try{
            System.out.println("hi");
            System.out.println(10/0);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block");
        }
        finally {
            System.out.println("finally block");
        }
        finally {
            System.out.println("finally block");
        }*/

      /* try {
           verifyAge(16);
       }catch (Exception e){
           e.printStackTrace();
       }*/

      //run-time exceptions :-
        //null pointer exception
       /* String s = null;
        System.out.println(s.length());*/

       //array index out of bound exception :-
       /* int[] a = new int[] {10};
        System.out.println(a[1]);*/
    }

    }

