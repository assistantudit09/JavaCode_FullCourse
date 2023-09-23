package com.company;

class parentClass{
    public int a=78;
    private int b=89;
    protected int c=90;
    int d=32;
}
class baseClass extends parentClass{
    public void access(){
        System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
public class java_rough {
    public static void main(String[] args) {
        baseClass b=new baseClass();
        b.access();
    }
}
