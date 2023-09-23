package com.company;

import java.util.Scanner;

public class Harry_18 {
    public static void main(String[] args) {

        //-->> if else ladder:-

        System.out.println("enter your name:- ");
        Scanner input= new Scanner(System.in);
        String name= input.nextLine();
        /* if(age>1&&age<=10)
            System.out.println("you are a child");
        else if(age>10 && age<=18)
            System.out.println("you are not a child");
        else if(age>18&&age<=50)
            System.out.println("you are a teenager");
        else if(age>50 && age<=80)
            System.out.println("you are old");
        else
            System.out.println("you are in heaven");

         */


        // SWITCH CASE:-
//        switch(age){
//            case 18:
//                System.out.println("you are going to an adult");
//                break;
//            case 21:
//                System.out.println("you can marry");
//                break;
//            case 30:
//                System.out.println("your time has come for a baby");
//                break;
//            case 50:
//                System.out.println("you are getting old");
//                break;
//            default:
//                System.out.println("enjoy your life");
//
//                //we use "break"---> for break the loop and get out of curly braces.
//        }

         // in java there is a feature of enhanced java:-

        switch (name) {
            case "udit narayan samal" -> System.out.println("your roll is 67");
            case "virat kohli" -> System.out.println("your roll is 54");
            case "ajay kumar" -> System.out.println("your roll is 23");
            default -> System.out.println("you are not register");

            // it ignores the "break".
        }



    }
}
