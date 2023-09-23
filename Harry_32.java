package com.company;

public class Harry_32 {
//   static void telljoke() // non return type. (void)
//   {
//       System.out.println("fuck u ...");
//   }
//    static void number(int p){
//        p=90; // p will not change .
//        System.out.println(p);

//    static void change(int [] arr){
//        arr[3]=90;
//        System.out.println(arr[3]);
//
//    }
    static void number(int x,int y)
    {
        System.out.println("sum is: "+(x+y));
    }
    static void number(int p)
    {
        System.out.println("p is: "+p);
    }
    static void number(float a,float b)
    {
        System.out.println("floating value is: "+(a*b));
    }
    public static void main(String[] args) {
       //telljoke(); //don't need to make object ,we can call dirctly static methods.
//        int a=98;

         // case:-1 (integer)
//        number(a); // this can't change the p value because ,here only a is copied to the arguments.

        //case:-2(in array)
//        int marks[]={45,67,33,45};
//        change(marks); // but in case of array ,"marks[3]" will change because of passing reference to the arguments.

        //method overloading:-
        number(34);
        number(56,43);
        number(3.4f,5.7f);


    }
}
