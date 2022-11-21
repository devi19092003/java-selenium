package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Collection1 {

    public static void main(String[] args) {

        int[] arr = new int[] {10,20,30,40};

        //how to create an ArrayList object ?
        ArrayList list = new ArrayList();

        list.add("Jagruti");
        list.add("Mangala");
        list.add("Neelam");
        list.add("Bharat");
        list.add("Devendra");
        list.add("Vishal");
        list.add("Ashish");
        list.add(null);
        list.add("Avinash");
        list.add("Priya");
        list.add("Gaurav");
        list.add("Ganesh");
        list.add("Jagruti");
        list.add(12);
        list.add(13);
        list.add(20.45f);
        list.add(45.89f);
        list.add('#');
        list.add('&');
        list.add(null);

        for(Object b : list){
            System.out.println(b);
        }

        System.out.println();
        System.out.println(list.size());
        System.out.println(list.get(10));
        System.out.println(list.remove(13));
        System.out.println();

        //clearing the list :-
        list.clear();
        System.out.println("After clearing the list :- ");
        for(Object b : list){
            System.out.println(b);
        }
        System.out.println();

        System.out.println(list.isEmpty());
        System.out.println();

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Avinash");
        list1.add("Priya");
        list1.add("Gaurav");
        list1.add("Ganesh");
        list1.add("Jagruti");

        for(Object b : list1){
            System.out.println(b);
        }
        System.out.println();

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(12);
        list2.add(13);
        list2.add(34);
        list2.add(56);

        for(Object b : list2){
            System.out.println(b);
        }
        System.out.println();

        //creating linkedlist object :-
        LinkedList list3 = new LinkedList();

        list3.add("Jagruti");
        list3.add("Mangala");
        list3.add("Neelam");
        list3.add("Bharat");
        list3.add(null);
        list3.addFirst("Digital");
        list3.addLast("Partners");

        for(Object b : list3){
            System.out.println(b);
        }

        System.out.println();
        System.out.println(list3.getFirst());
        System.out.println(list3.getLast());
        System.out.println();

        System.out.println(list3.removeFirst());
        System.out.println(list3.removeLast());
        System.out.println();

        for(Object b : list3){
            System.out.println(b);
        }

        //creating vector object :-
        Vector list4 = new Vector();

        list4.add("Digital");
        list4.add("Partners");
        list4.add(null);

        //creating a stack object :-
        Stack stack = new Stack();

        stack.push("diwali");
        stack.push("dusshera");

        System.out.println();
        for(Object b : stack){
            System.out.println(b);
        }

        System.out.println();
        System.out.println("after removing items");
        stack.pop();

        System.out.println();
        for(Object b : stack){
            System.out.println(b);
        }
    }
}
