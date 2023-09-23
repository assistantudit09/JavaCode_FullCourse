package com.company;

interface Student{
    public void mark(float x);
    public void roll(int a);
    /* interface has only methods having no body
    means "declaration without an implementation".
    it doesnt contains method having body with in it.
     */
}
class stu1 implements Student{
    public void mark(float x){
        System.out.println("mark is: "+x);
    }
    public void roll(int a){
        System.out.println("roll no: "+a);
    }
}
public class Harry_54 {
    public static void main(String[] args) {
        stu1 obj=new stu1();
        obj.mark(56.7f);
        obj.roll(78);

    }
}
