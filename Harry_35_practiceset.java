package com.company;

import java.util.Scanner;

public class Harry_35_practiceset {
    //q.1)multiplication table:-
    /*static void multable(int n){
        for(int i=1;i<=10;i++)
           System.out.println(n+" * "+i+" = "+n*i);
       } */
    //q.2)print following pattern:-
//          *
//          * *
//          * * *
//          * * * *
//    static void pattern1(int n) {
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//
//        }
//    }
    //q.3)
//    static int natural(int n){
//        if(n==1)
//            return 1;
//        else
//            return n+natural(n-1);
//    }
    //q.4) nn
    //q.5) 0 1 1 2 3 5 8 13 21
//    static int fab(int n){
//       if(n==1)
//           return 0; // first value is 0
//       else if(n==2)
//           return 1;  // second value is 1
//       else
//            return fab(n-1)+fab(n-2);
//
//
//    }

    //q.6)
//    static float average(int ...arr){
//        int sum=0;
//        for(int ele: arr) {
//            sum = sum + ele;
//        }
//        float avg=sum/5; // we are going to get of 5 int values.
//        return avg;
//
//    }
    //q.7,8,10 :- nn
    //q.9)
    static float farn(float n){

            return (n*9)/5+32; // formula for converting celsius to farenhiet.
    }


    public static void main(String[] args) {
        //q.1)
       /* System.out.println("which table do u want: ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        multable(a);
       */
        //q.2)
//        int pat=5;
//        pattern1(pat);

        //q.3)
//        int n=5;
//        System.out.println(natural(n));

        //q.4)
        //nn
        //q.5)
//        int a=5;
//        System.out.println("fabonacci: "+fab(a));

//       q.6)
//       System.out.println("average is: "+average(34,56,32,56,78));

        //q.10)
        System.out.println("celsius: ");
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        System.out.println("farenhiet: "+farn(t));
    }
}
