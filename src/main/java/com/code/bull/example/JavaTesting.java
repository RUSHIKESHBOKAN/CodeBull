package com.code.bull.example;

public class JavaTesting {

    public static void main(String[]args){

       Test();


    }


    public static void Test(){

        String name = "Rushi";

        if (name.equalsIgnoreCase("Ajay")){

            System.out.println("Chal gaya ajay");
        }
        else if (name.equalsIgnoreCase("Sachin")){

            System.out.println("Chal gaya Sachin");
        }
        else if (name.equalsIgnoreCase("Jonson")){

            System.out.println("Chal gaya jonson");
        }
        else{

            System.out.println("Chal gaya Rushi");
        }
    }
}
