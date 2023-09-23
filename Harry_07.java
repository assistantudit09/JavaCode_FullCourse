//  EXERCISE ch-1:-

package com.company;

import java.util.Scanner;

public class Harry_07 {
    public static void main(String[] args) {
        //q.1) sum of three numbers:-

//        System.out.println("enter three numbers= ");
//        Scanner input=new Scanner(System.in);
//        int a=input.nextInt();
//        int b=input.nextInt();
//        int c=input.nextInt();
//        int sum=a+b+c;
//        System.out.println("sum of these numbers= "+sum);

        //q.2) program for students total marks and cgpa.
                // already done on previous file.

        //q.3) greetings user by their name:-

//        System.out.println("enter your name");
//        Scanner input=new Scanner(System.in);
//        String str=input.nextLine();
//        System.out.println("hello "+str+" !!"+" fuck you...");

        //q.4) to convert kilometer to miles

//        System.out.println("how much kilometers you covered: ");
//        Scanner input= new Scanner(System.in);
//        float f=input.nextFloat();
//        float m=f/1.609f;
//        System.out.println("you covered "+m+" "+"miles");

        //q.4)find out the  number is integer or not.

        System.out.println("you motherfuc*er!!! enter any number: ");
        Scanner input= new Scanner(System.in);
        boolean num=input.hasNextInt();  // this function always takes as boolean (true/false)
        if(num==true)
            System.out.println("it's an integer");
        else
            System.out.println("not an integer");





    }

}
