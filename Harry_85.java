package com.company;

import java.util.Scanner;

public class Harry_85 {
    public static int  divi(int a, int b){
        System.out.println(a/b);
        return a/b;
    }
    public static void main(String[] args) {
     //q.1)
       // char =56; -->syntax error.
       /*
      System.out.println("1 to 15: ");
        for(int i=0;i<=15;i++){   --> logical error.

            System.out.println(i);
        }
        */
       /*  runtime exception by user:-
        System.out.println("enter a integer: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("you entered: "+a);

        */
        //q.2)
        int a=50;
        int b=0;
        try{
            System.out.println(a/b);

        }
        catch(ArithmeticException ae){
            System.out.println("haha..");
        }
        catch(IllegalArgumentException i){
            System.out.println("hehe..");
        }




    }
}
