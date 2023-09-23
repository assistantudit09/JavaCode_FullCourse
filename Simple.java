package com.company;
import java.util.Scanner;
 class Simple
{
    public static void main(String[] args)
    {
       int a,b,c;
       Scanner myobj=new Scanner(System.in);
        System.out.println("enter two number: ");
        a=myobj.nextInt();
        b=myobj.nextInt();
        c=a+b;
        System.out.println("sum of two number is: "+c);
    }
}
