package com.company;

public class practiceset_3Harry {
    public static void main(String[] args) {
        
        //q.1)
      // String str=new String("UDIT NARAYAN SAMAL");
       // System.out.println(str.toLowerCase());


        //q.2)
        //System.out.println(str.replace(" ","_"));

        //q.3)
       // String letter=new String("dear<|name|>,thanks a lot");
        //System.out.println(letter.replace("<|name|>"," kabir"));

        //q.4)
//        String str="udit  narayan   samal sahil";
//        System.out.println(str.indexOf("  ")); // double spaces after t. -->4
//        System.out.println((str.indexOf("   "))); // triple space after n. -->13

        //q.5) formatting using escape sequence.
        System.out.println("dear harry,\n\t\tThis java course is nice.\n\t\tThanks");

           String str="      dear harry,this java course is nice.Thanks";
         System.out.println(str.trim());


    }
}
