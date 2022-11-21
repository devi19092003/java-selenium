package com;

public class PConstructor {

    //Creating instance variable =>
    static int custID = 10;
    static String custName = "Akash";
    static int landLineNo = 684952;
    static String custLocation = "Hinjewadi";
    static int surveyNo = 223;
    static String videogameType = "PubG";
    static float charges = 700.201f;

    public static void display()
//Creating static method to print customer record
    {
        System.out.println("\nI am static method \n");
        System.out.println("Customer ID = "+custID);
        System.out.println("\nCustomer Name = "+custName);
        System.out.println("\nCustomer LandLine Number = "+landLineNo);
        System.out.println("\nCustomer Location = "+custLocation);
        System.out.println("\nCustomer Survey Number = "+surveyNo);
        System.out.println("\nVideo Game Type = "+videogameType);
        System.out.println("\nCharges for Video game = "+charges);
    }

    private PConstructor(){
       //display();
    }

    public static void main(String[] args) {
        //Calling static method to display customer record
        //display();
    }
}
