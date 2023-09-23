package com.company;

public class Harry_80 {
    public static void main(String[] args) {

        int a=1000;
        int b=0;
        //try_catch block:-
        try{
            int c=a/b;
            System.out.println("division is: "+c);
        }
        catch(Exception e){
            System.out.println("program failed...");
            System.out.println(e);
        }
        System.out.println("<< end of program >>");
    }
}
