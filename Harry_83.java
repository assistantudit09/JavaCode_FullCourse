package com.company;

class Myexception extends Exception{
    public String toString(){
        return "iam toString() >>>>";
    }
    public String getMessage(){
        return "iam getMessage >>>";
    }
}
public class Harry_83 {
    public static void main(String[] args) {
      int a=7;
      int b=0;
     if(b==0)
         try{
             throw new  Myexception();
         }
         catch(Exception e){
             System.out.println(e.toString());
             System.out.println(e.getMessage());
         }
    }
}
