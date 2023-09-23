package com.company;

import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args) {

        // rock,paper,scissor game:-
        System.out.println("enter 0 for rock,1 for paper and 2 for scissor:- ");
        Scanner input=new Scanner(System.in);
        int user=input.nextInt();

        //using random class computer can pass random values according to bound.
        Random ran=new Random();
        int comp=ran.nextInt(3);  // bound is 3

            if(comp==0 && user== 1 || comp==1 && user==2 || comp==2 && user==0 )
            System.out.println("you win!!!");
        else if(comp==0&&user==0 || comp==1&&user==1 || comp==2&&user==2)
            System.out.println("drawn!!!");
        else
            System.out.println("you lose!!!");

        System.out.println("computer entered:");
        if(comp==0)
            System.out.println("rock");
        else if(comp==1)
            System.out.println("paper");
        else
            System.out.println("scissors");

        System.out.println("you entered: ");

        if(user==0)
            System.out.println("rock");
        else if(user==1)
            System.out.println("paper");
        else
            System.out.println("scissors");






    }
}
