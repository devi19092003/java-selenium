package com;

public class FloatingPointLiterals {
    public static void main(String[] args) {

        // float values are :-
        // for ex :- 23.686708 , 10.209865 , 0.098
        // 23 , 10 , 0 -> decimal part
        // .686708 , .209865 , .098 -> fractional part

        // how to declare a floating point variable :-
        // 1- use float data type
        // 2- suffix the number with f or F

        float number1 = 10.25f;
        System.out.println(number1);

        // not recommended / not a good practice
        Float number3 = 545869.58569f;
        System.out.println(number3);

        float number2 = 10.5678F;
        System.out.println(number2);

        float number4 = 2.357474764865865877679696988708708707098905345747478658587666766545546464646464646646464646465777668686868686868686886868686814313131342543436366653365365363635635356356353535353563636536536536535636535635635636536535636365365365356356356353653653653536535635635656365653563653653563563653653653563563563563563563563653563653653653653563563563535635356365356365365365353363537774686587769698787078798667885656774565346345232342342432342325436654757588768768768766878768687678687678686676786786766777878787878787878777787878878787876769798798798787087070778979879878868776868876887678f;
        System.out.println(number4);

        // how to declare a double variable :-
        // 1-use double data type
        // 2- suffix the number with d or D

        double number5 = 2.1234567890987654321d;
        System.out.println(number5);

        double number6 = 3.356467587698789785764563543342342342544567D;
        System.out.println(number6);

        // how to define a character literal :-
        // 1- use char data type
        // 2- enclose the single character within a single quotes ' '

        char character1 = 'g';
        System.out.println(character1);

        char character2 = 'A';
        System.out.println(character2);

        char character3 = '$';
        System.out.println(character3);

        char character4 = 65;
        System.out.println(character4);

        char character5 = 97;
        System.out.println(character5);

        char character6 = 128;
        System.out.println(character6);

        // out of the range for defining a character
        // char character7 = 65536;

        // how to define a string literal :-
        // 1- use String class
        // 2- enclose the string in double quotes " "

        String string1 = "software testing";
        System.out.println(string1);

        String string2 = "Digital Partners";
        System.out.println(string2);

        // how to define a boolean literal :-
        // 1- use boolean data type
        // 2- assign only true or false

        boolean bool1 = true;
        System.out.println(bool1);

        boolean bool2 = false;
        System.out.println(bool2);

        // only true or false values are accepted
       // boolean bool3 = truth;
       //  System.out.println(bool3);


    }
}
