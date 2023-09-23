package com.company;

import java.util.Scanner;

public class Harry_79 {
    public static void main(String[] args) {
        // demo of syntax error:-
        //  int a=98  --> no semicolon error.
        // b= 7; --> no declaration error.

        // demo of logical error:- (mistake at the time of writing code)
       /* System.out.println("printing of 1 to 10:- ");
        for(int i=1;i<10;i++){
            System.out.println(i);
        } */
        // here 10 is not printed at output because "i<10" .. mistake by programmer.

        // demo of runtime error:-
        System.out.println("enter a number: ");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        System.out.println("You entered: "+n);

    }
}
