package com.company;

import javax.swing.*;

public class harry_29practiceset {
    public static void main(String[] args) {
        //q.1) print sum of 5 float numbers:-
//        float sum=0;
//        float arr[]={1.2f,4.3f,4.2f,3.7f,1.2f};
////        for(int i=0;i<arr.length;i++){
////            sum=sum+arr[i];
////        }
////        System.out.println("sum is="+sum);
//        for(float ele:arr){
//            sum=sum+ele;
//        }
//        System.out.println("sum is: "+sum);

        //q.2)cheak in array integer is present or not:-

//        float arr[]={2.1f,3.4f,4.2f,5.6f};
//        float n=3.7f;
//        for(float ele:arr){
//
//            if(n==ele) {
//                System.out.println("yes ,n is present inside array");
//                break;
//            }
//            else
//                System.out.println("no ,n is not present");
//                break;
//
//        }

        //q.3) finding average mark from array:-
//        float phy[]={45.4f,56.7f,78.6f,89.5f};
//        float total=0;
//        for(float ele:phy){
//            total=total+ele;
//        }
//        System.out.println("total mark is= "+total);
//        System.out.println("average is: "+(total/4));

        //q.4) adding two matrices of (2*3):-

//        int arr1[][] = {{3, 4, 5}, {7, 2, 9}};
//        int arr2[][] = {{1, 2, 6}, {4, 7, 8}};
//        int sum[][] = {{0, 0, 0}, {0, 0, 0}};
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.println("setting value for i=" + i + " j=" + j);
//                sum[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.print(sum[i][j]+" ");
//            }
//            System.out.println(" ");
//        }

        //q.5) to reverse an array:-
//        int arr[]={45,67,43,56,33};
//        for(int i=arr.length-1;i>=0;i--)
//        {
//            System.out.println(arr[i]);
//        }
//

        //q.5) by harry's logic:- (imp)
//        int arr[]={56,47,53,78,43};
//        int mid=Math.floorDiv(arr.length,2); // it helps to dived two numbers
//
//        for( int i=0;i<mid;i++)
//        {
//            // swapping method:-
//            int temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//
//        }
//        for(int ele:arr)
//            System.out.print(ele+" ");
//

        //q.6)program to find maximum number in array:-
//        int arr[]={3,6,1,6,8,35};
//        int max= 0;
//        for(int ele:arr)
//        {
//            if(max<ele)
//                max=ele;
//        }
//        System.out.println("larger number is "+max);

        //q.7)program for find minimum number in array:-
           // ......invalid......

        //q.8)to find whether the array is sorted or not (should be in ascending):-
        int arr[]={1,3,6,8,20,40,50};
        int tf=0;
        for(int i=0;i<arr.length-1;i++) // because at last value has no pair
        {
            if(arr[i]>arr[i+1]) {
                System.out.println("array is not sorted");
                 tf=1;

            }
        }
        if(tf!=1)
            System.out.println("array is sorted");
    }
}

