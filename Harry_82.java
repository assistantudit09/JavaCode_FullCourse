package com.company;

public class Harry_82 {
    public static void main(String[] args) {
        int array[]={2,5,7,8,4};
        try{
            System.out.println(array[2]/2);  // if it is right it goes to second try block nor it jumps to direct level 1 catch.
            try{
                System.out.println(array[8]); // it will catch because of error level 2.
            }
            catch(ArrayIndexOutOfBoundsException a){
                System.out.println("error level 2....error occured");
                System.out.println(a);
            }
        }

        catch(Exception e){
            System.out.println("error level 1...error occured"+"\n"+e);
        }

    }
}
