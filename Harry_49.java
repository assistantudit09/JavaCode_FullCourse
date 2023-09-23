package com.company;

class phone {
    public void showtime(){
        System.out.println("time is 9am");
    }
    public void music(){
        System.out.println("music of phone!!!");
    }
}
class smartphone extends phone{
    public void ring(){
        System.out.println("ringing the smartphone!!!");
    }
    public void music(){ // overriding method...
        System.out.println("music of smartphone!!!");
    }
}
public class Harry_49 {
    public static void main(String[] args) {
//        smartphone smt=new smartphone();
//        smt.music();
        phone obj=new smartphone();// it is allowed to make derivedclass object of baseclass reference.
        //smartphone obj1=new phone(); // but it doesn't allowed.
        obj.showtime();// it is allowed as it known to baseclass.
        obj.music();  // it will call the simmilar method of derived class , cause it is object of derived class.
       // obj.ring(); // it is not allowed because it is not known base class ,but music() was
                      // known so that allowed to call through derivedclass.



    }
}
