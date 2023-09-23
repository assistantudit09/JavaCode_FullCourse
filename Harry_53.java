package com.company;

abstract class parent{
    public void school(){
        System.out.println("jagganath institute");//you can make non-abstract method inside an abstract class.
    }
    abstract public void rollno(int x);
}
/* abstract class says to its child class that-either  make another abstract class or use my abstract method
     else compiler will throws error.
 */
 class child extends parent{
    public void rollno(int  x){
        System.out.println("roll of child1: "+x);
    }
}
class child2 extends parent{
    public void rollno(int x){
        System.out.println("roll of child2: "+x);
    }
}
public class Harry_53 {
    public static void main(String[] args) {
        child ch=new child();
        ch.school();
        ch.rollno(45);

        child2 ch2=new child2();
        ch2.school();
        ch2.rollno(67);
    }
}
