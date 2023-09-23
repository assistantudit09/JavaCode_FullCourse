package com.company;

//class base{
//    int i;
//    float f;
//    public void setint (int a){
//        this.i=a;  // "this" keyword takes the reference of that object being created.
//        System.out.println("integer a: "+i);
//    }
//    public void setfloat(){
//        System.out.println("float :"+this.f); // another way.
//    }
//
//}

// example of "super" keyword:-
class base{
    int a,b;
    public base(){
        System.out.println(" base non parameterized constructor!!!");
    }
    public base(int x,int y){
        System.out.println(" base parameterized constructor!!!");

    }
}
class derived extends base{
    public  derived(){
        System.out.println("derived nonparameterized constructor!!!");
    }
        public derived( int p,float f){
        super(5,7);
        System.out.println("derived parameterized constructor!!!");
    }

}

public class Harry_47 {
    public static void main(String[] args) {

//        base b=new base();
//        b.setint(5);
//        b.f=45.7f;  // it will access by method through "this " keyword
//        b.setfloat();


        derived d=new derived(56,7.8f);

    }
}
