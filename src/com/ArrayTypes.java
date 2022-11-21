package com;

public class ArrayTypes {
    public static void main(String[] args) {

        // Array Literal Declaration:-
        int[] intArray = new int[] {1,2,3,4,5,6,7,8,9,10};

        // In order to find out about any array's size we use the length
        // property.
        System.out.println(intArray.length);

        // integer is a primitive/primary data type
        int[] Array = new int[5];
        Array[0] = 3;
        Array[1] = 'v';

        System.out.println(Array[0]);
        System.out.println(Array[1]);

        byte b1 = 89;
        Array[2] = b1;

        System.out.println(Array[2]);

        short s1 = 20;
        Array[3] = s1;

        float f1 = 10.92f;
       // Array[4] = f1; => invalid

        int[] Array2 = new int[4];
        //element assignment :-
        Array2[0] = 10;
        Array2[1] = 20;
        Array2[2] = 30;
        Array2[3] = 40;

        System.out.println("Length of integer array = "+Array2.length);
        for(int b =0; b<=Array2.length-1; b++){
            System.out.println("Integer value at index "+b+" = "
                    +Array2[b]);
        }

        System.out.println(" ");

        char[] charArray = new char[5];
        //element assignment :-
        charArray[0] = 'I';
        charArray[1] = 'N';
        charArray[2] = 'D';
        charArray[3] = 'I';
        charArray[4] = 'A';

        System.out.println("Length of character array = "+charArray.length);
        for(int c =0; c<=charArray.length-1; c++){
            System.out.println("Character value at index "+c+" = "
                    +charArray[c]);
        }

        System.out.println(" ");

        float[] floatArray = new float[4];
        //element assignment :-
        floatArray[0] = 10.98f;
        floatArray[1] = 45.09f;
        floatArray[2] = 65.00f;
        floatArray[3] = 23.980f;

        System.out.println("Length of float array = "+floatArray.length);
        for(int d =0; d<=floatArray.length-1; d++){
            System.out.println("Float value at index "+d+" = "
                    +floatArray[d]);
        }

        System.out.println(" ");

        String[] strArray = new String[3];
        //element assignment :-
        strArray[0] = "Mangoes";
        strArray[1] = "are";
        strArray[2] = "Delicious";

        System.out.println("Length of string array = "+strArray.length);
        for(int e =0; e<=strArray.length-1; e++){
            System.out.println("String value at index "+e+" = "
                    +strArray[e]);
        }

        System.out.println(" ");

        boolean[] boolArray = new boolean[] {true,false};

        //for each loop :-
        for(boolean b2 : boolArray){
            System.out.println(b2);
        }

        // without using length-1 logic in for loop:-

        //1st way which is wrong
       /* for(int a=0; a<=intArray.length; a++){
            System.out.println(intArray[a]);
        }
        you will get an exception in this case.*/

       //2nd way which is right
        for (int a=0; a<intArray.length ; a++){
            System.out.println("Array at index "+a+" = "+intArray[a]);
        }


    }
}
