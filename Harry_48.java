package com.company;

class baseclass{
    public void meth1(){
        System.out.println("i am the method 1 of base!!!");
    }
    public void meth2(){
        System.out.println("iam the method 2 of base!!!");
    }
}
class derivedclass extends baseclass{
    @Override    // <<<----this shows that the overriding happen here.
    public void meth2(){
        System.out.println("i am method 2 of derived!!!");
    }
    public void meth3(){
        System.out.println("i am method 3 of derived!!! ");
    }

}
public class Harry_48 {
    public static void main(String[] args) {
      derivedclass der=new derivedclass();
     der.meth2();
      /*
      when we makes a method in derived-class as same in base class , and call the object of derived-class
      then the base-class's method will overrides and method of derived class calls.
       */
    }
}
