package com.company;

public class Harry_26 {
    public static void main(String[] args) {
//        int arr[]={10,20,30,40,50};
//        // we can make float and string also:-
////        float arr2[]={10f,45.6f,5.78f};
////        String arr3[]={"rohan","rabi","kabir","amir","ajay"};
////        System.out.println(arr2[0]);
////        System.out.println(arr.length); //for getting length.
////        System.out.println(arr3[2]);
//
//        //System.out.println(arr.length); // length is 5
//
//        //displaying array:-
//        //1.printing using for loop
//        for(int i=0;i<arr.length;i++)
//            System.out.println(arr[i]);
//
//        System.out.println("\n");
//        //in reverse order:-
//        for(int i=arr.length-1;i>=0;i--)
//            System.out.println(arr[i]);
//
//        //2.printing using for each loop:-\
//        System.out.println("printing using for each loop:-");
//        for(int ele:arr)
//            System.out.println(ele);
//        // it retrive all the elements from array "arr" but u cant access "i" value so better
//        //use first method.


       int mark[]={45,67,89,43,78,87,89};
        System.out.println("printing reversely:-");
         for(int i=mark.length-1;i>=0;i--)
            System.out.println(mark[i]);
        System.out.println("\n"+"using for each loop:- ");
        for(int ele:mark)
            System.out.println(ele);


    }
}
