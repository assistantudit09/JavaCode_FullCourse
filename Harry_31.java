package com.company;

public class Harry_31 {

    static int sum(int x,int y)  // its a static method means it directly indicating its object in main.
    {
        int z=x+y;
        System.out.println("sum is: "+z);
        return z;
    }
    int mul(int a,int b) // its a non static method where we makes its object in main.
    {
        System.out.println("multiplication is: "+a*b);
        return a*b;
    }
    public static void main(String[] args) {
        // for static:-

        int j=8,k=9;
        int l=sum(j,k);

        //for non static we make object
        int p=3,q=9;
       Harry_31 num=new Harry_31();
       num.mul(p,q);

    }
}
