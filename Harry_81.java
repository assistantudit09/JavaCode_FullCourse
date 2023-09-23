package com.company;

public class Harry_81 {

    public static void main(String[] args){
//        int arr[]={10,20,30,40,50};
////        try{
////            System.out.println(arr[2]/0);// this error will catch by "arithmetic exception"
////        }
//        try{
//            System.out.println(arr[8]); // this error will catch by "array out of bound exception"
//        }
//        catch(ArithmeticException e){
//            System.out.println("arithmetic exception... program failed"+"\n"+ e);
//        }catch(ArrayIndexOutOfBoundsException ar){
//            System.out.println("Arrayoutofbound exception.. program failed "+"\n"+ar);
//        }
//        catch(Exception a){  // it is for catching other errors except above two.
//            System.out.println("sorry program failed for other exception.. "+"\n"+a);
//        }

          // ex 2))
        int arr[]={89,43,34,57,32};
//        try{
//            System.out.println(arr[8]);
//        }
        try{
            System.out.println(arr[3]/0);
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("array out of bound Exception>> ");
            System.out.println(ar);
        }
        catch(ArithmeticException a){
            System.out.println("Arithmetic exception>>> ");
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println("exception occured>>>");
            System.out.println(e);
        }
    }
}
