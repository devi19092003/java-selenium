package com;

import java.util.*;

public class Collection2 {

    public static void main(String[] args) {

        //declaring set interface :-
        Set set = new HashSet();

        set.add("Diwali");
        set.add("Padwa");
        set.add(12);
        set.add("Diwali");
        set.add(13);
        set.add(12);
        set.add(12.43f);
        set.add(34.90f);
        set.add(12.43f);
        set.add('*');
        set.add('$');
        set.add('*');
        set.add(null);
        set.add(null);

        System.out.println(set.add(" "));

        for(Object s : set){
            System.out.println(s);
        }
        System.out.println();

        Set set1 = new LinkedHashSet();

        set1.add("Diwali");
        set1.add("Padwa");
        set1.add(12);
        set1.add("Diwali");
        set1.add(13);
        set1.add(12);
        set1.add(12.43f);
        set1.add(34.90f);

        for(Object s : set1){
            System.out.println(s);
        }
        System.out.println();

        SortedSet set2 = new TreeSet();

        //1-not allowing for heterogeneous data
        //2-no duplicate values are allowed
        //3-no null object is allowed

        set2.add("Diwali");
        set2.add("Padwa");
       // set2.add(12);
        set2.add("Diwali");
        set2.add("Onam");
        set2.add("dusshera");
       // set2.add(13);
      //  set2.add(12);
      //  set2.add(12.43f);
      //  set2.add(34.90f);
      //  set2.add(null);

        for(Object s : set2){
            System.out.println(s);
        }
        System.out.println();

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Priya");
        map.put(1,"Priya");
        map.put(1,"Tim");
        map.put(2,"Mangala");
        map.put(5,"Mangala");
        map.put(3,"Bharat");
        map.put(4,"Jagruti");

        System.out.println(map.get(2));
        System.out.println(map.get(1));
        System.out.println(map.get(5));
        System.out.println();

        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println();

        Hashtable<Integer,String> hashtable = new Hashtable<>();



    }


}
