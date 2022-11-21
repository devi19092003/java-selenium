package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

    public static void main(String[] args) {

        //compile time or checked exception :-
       // int a = 10.25;

      //  System.out.println("hi");

        //run time or unchecked exception :-
       // System.out.println(10/0);
      //  System.out.println("hello");

        //example of checked exception :- (FileNotFound Exception)
       /* File file = new File("E://file.txt");
        try {
            FileReader fr = new FileReader(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }*/

        //example of unchecked exception :- (Arithmetic Exception)
         /* System.out.println("hi");
          try{
              System.out.println(10/0);
          }catch (ArithmeticException a){
              a.printStackTrace();
          }*/

         //case1 :- is it possible to have multiple line of code in try block:-
         /* try{
              System.out.println("hi");
              System.out.println(10/0);
          }catch (ArithmeticException a){
              a.printStackTrace();
          }
        System.out.println("hello");*/

       /*1st rule :- If we are having multiple statements in the try block
       * and for ex 3rd statement but we got error on 2nd line then try block
       * gets terminated there itself , and 3rd statement can't be
       * executed. */

       /* 2nd rule :- you cannot use catch block alone.

        catch (ArithmeticException a){
            a.printStackTrace();
        }*/

       /* 3rd rule :- There can be single try block and multiple catch
          blocks.

        try{
            System.out.println("hi");
            System.out.println(10/0);
        }catch (ArithmeticException a){
            a.printStackTrace();
        }
        catch (NullPointerException n){
            n.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }*/

       /* 4th rule :- Exception is the parent class of all the different
           kinds of exceptions so when you don't know which exception you
           will be getting at that time you can simply define the exception
           class.

           try{
            System.out.println("hi");
            System.out.println(10/0);
        }catch (Exception e) {
            e.printStackTrace();
        }
        */

       /* 5th rule :- You can never define parent class at the top of other
       *  exceptions because once defined there is no need to define other
       * exception.
       *
       * * wrong way :-

          try{
            System.out.println("hi");
            System.out.println(10/0);
        }catch (Exception e) {
            e.printStackTrace();
         }catch (ArithmeticException a){
            a.printStackTrace();
        }
        catch (NullPointerException n){
            n.printStackTrace();
       *
       * correct syntax or way :-
       *
       * 6th rule :- we can define child class exception first then we can
       * define parent class exception below.
       *
       *  try{
            System.out.println("hi");
            System.out.println(10/0);
        }catch (ArithmeticException a){
            a.printStackTrace();
        }
        catch (NullPointerException n){
            n.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        } */

       /* 7th rule :- we can define try block without catch block but only
       *   with the help of finally block.
       *
       * wrong way to define catch block alone :-
       *
       * try{
           System.out.println("hi");
           System.out.println("10/0");
       } */

       /* 8th rule :- java finally block always executes whether an
       *   exception is handled or not.
       *
       * try{
            System.out.println("hi");
            System.out.println(10/0);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("hello");*/

       /*9th rule :- finally block always follows try block or try-catch
        block.
        wrong way :-
         finally {
            System.out.println("finally block");
        }*/














    }
}
