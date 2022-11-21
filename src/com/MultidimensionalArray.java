package com;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int[] intArray = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println(intArray.length);

        for(int a : intArray){
            System.out.println(a);
        }

        //How to find class names for different types of arrays?
        //primitive types:-
        int[] intArrays = new int[3];
        byte[] byteArray = new byte[3];
        short[] shortArray = new short[3];
        String[] strArray = new String[3];

        System.out.println(intArrays.getClass());
        System.out.println(intArrays.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortArray.getClass());
        System.out.println(strArray.getClass());

        // ways of defining two dimensional array :-

        int[][] x; //1
        int [][]y; //2
        int z[][]; //3
        int []b[]; //4
        int[] []c; //5
        int[] d[]; //6
        int[][]e; //7
        // int[]a[]b; => invalid

        // how to initialize an array :-
        int[][] arr = new int[2][2];

        //storing values :-
        arr[0][0]=10;
        arr[0][1]=20;
        arr[1][0]=30;
        arr[1][1]=40;

        int[][] arr1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        //how to fetch 2d array values ?

        //you will not get expected result
        /*for(int i=0; i<=arr.length-1;i++){
            System.out.println(arr[i][i]);
        }*/

        //using nested for loops :-
        for(int i =0; i<=arr.length-1; i++){
            for(int j=0; j<=arr.length-1; j++){
                System.out.println(arr[i][j]);
            }
        }



    }
}
