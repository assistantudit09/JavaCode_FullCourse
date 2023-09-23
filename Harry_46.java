package com.company;

class student{
    int roll;
    int mark;
    public student(){
        System.out.println("i am a base constructor!!!" ); // this constructor can called at the time
        //of object-calling of "derived class". (and no parameters means defaultly it calls)
    }
    public student(int x){
        roll=x;
        System.out.println("iam a overloaded baseConstructor"+" parameter: "+roll);
    }
}
class student2 extends student{
    String name;
    void setname(String n){
        name=n;
    }

    public student2(){
        super(03); // it access the parameterized base constructor even presence of default constructor
        System.out.println("i am the derived constructor !!! ");// it calls after calling of base constructor
    }
    public student2(int x ,int y) {
        super(56);
        System.out.println("iam an overloaded derivedconstructor!!!");
    }

}
class student3 extends student2{
    public student3(){
        System.out.println("iam consturctor of derived-deived class!!!");
    }
    public student3(int p,float q){
        super(4,5);
        System.out.println("iam the overload Derived-derivedconstructor!!!");
    }
}
public class Harry_46 {
    public static void main(String[] args) {

       // student2 s2=new student2(); // constructor of base class autometically call even making of
                                     // derived class's object.
        // 'super' keyword gives access of  parameterized  overloaded constructor
        //student2 s2=new student2(56,78); // it calls both student1overload and student2overload

        student3 s3=new student3(45,56.0f); // it calls student1overload,student2overload and student3overload

    }
}
