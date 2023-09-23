package com.company;



class Parentclass{
    public int a=6;
    private int b=5;
    protected int c=7;
    int d=43;
    public void show(){  // all are accessable inside the same class.
        System.out.println(a+b+c+d);
    }

}
class Baseclass extends Parentclass{
    public void accessparent(){
        System.out.println(a);
       // System.out.println(b);  // private can't accessable to baseclass or subclass.
        System.out.println(c);
        System.out.println(d);
    }
}
public class Harry_66 {
    public static void main(String[] args) {
        //Parentclass par=new Parentclass();
        //  par.show(); all can accessable inside class through method.

        //System.out.println(par.a);
        //System.out.println(par.b); //private memeber can't accessable outside class.
        //System.out.println(par.c);
        //System.out.println(par.d);

        Baseclass obj=new Baseclass();
        obj.accessparent();
    }
}
