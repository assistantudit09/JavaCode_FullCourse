package com.company;

//class pen
//{
//    String colour;
//    String type;
//    int price;
//    public void aboutpen()
//    {
//        System.out.println("colour:"+ this.colour);
//        System.out.println("type:"+this.type);
//        System.out.println("price:"+this.price);
//    }
//
//}

 //polymerphism(compile time):-


//   class Student {
//       int roll,address,result,mark;
//       String subject ;
//
//    public void Stuinfo(int r,int a){
//       int  roll= r;
//       int address=a;
//        System.out.println("roll "+roll+" "+"address "+address);
//
//    }
//    public void Stuinfo(String s,int m ){
//        String subject=s;
//        int mark=m;
//        System.out.println("subject: "+subject+" "+"mark: "+mark);
//
//    }
//    public void Stuinfo(int x){
//        int result=x;
//    }


//       Student() // default constructor
//       {
//           System.out.println("constructor called!!!"); // it prints at the time of object creation.
//       }


//       Student(int r,String n)  //parameterised constructor.
//       {
//           this.roll=r;
//           this.name=n;
//       }


    //copy constructor:-
//    Student(){}
//    Student(Student s2){
//           this.name=s2.name;
//           this.roll=s2.roll;
//
//    }

import org.w3c.dom.ls.LSOutput;


// runtime polymerphism:-


//class student {
//    public void info()
//    {
//        System.out.println("age"+ "18");
//    }
//}
//class s1 extends student{
//    public void info(int r)
//    {
//        int roll=r;
//        System.out.println("rollno:"+roll);
//    }
//}
//class s2 extends student{
//    public void info(String n)
//    {
//        String name=n;
//        System.out.println("name is:"+name);
//    }
//}
//

    //inheritance:-

//   class sch
//   {
//       String school="jagannath institition";
//       public void schoolname()
//       {
//           System.out.println("school name is:- "+school);
//       }
//
//   }
//   class stu1 extends sch{
//       String name="udit narayan";
//       public void infostu1()
//       {
//           System.out.println(name+" "+school);
//       }
//
//   }
//   class stu2 extends stu1{
//       int roll=35;
//       public void infostu2(){
//           System.out.println(roll+" : "+name);
//       }
//   }

//        abstract  class animal{
//         abstract  void walk();
//         void breathe()
//         {
//             System.out.println("this animal breathes air");
//
//         }
//         animal(){
//             System.out.println("you are about to create an animal");
//         }
//
//     }
//     class horse extends animal
//     {
//         horse()
//         {
//             System.out.println("you created a horse");
//         }
//         void walk()
//         {
//             System.out.println("horse walks on four legs");
//         }
//
//     }
//     class chicken extends animal{
//         chicken()
//         {
//             System.out.println("you created a chicken");
//         }
//         void walk(){
//             System.out.println("chicken walks on two legs");
//         }
//     }
//


public class Main {

    public static void main(String[] args) {
//       pen elkos=new pen();
//       elkos.colour="green";
//       elkos.type="gel";
//       elkos.price=10;
//
//       pen sifco=new pen();
//       sifco.colour="red";
//       sifco.type="ballpoint";
//       sifco.price=15;
//
//        System.out.println("about elkos:");
//       elkos.aboutpen();
//        System.out.println("\n");
//        System.out.println("about sifco:");
//       sifco.aboutpen();


//        Student s1=new Student();
//        s1.name="udit narayan ";
//        s1.roll=56;
//        Student s2=new Student(s1); // copied
//        s2.Stuinfo();

//        Student s1=new Student();
//        s1.Stuinfo("physics",98);

//      s2 obj1= new s2();
//      obj1.info("udit narayan");
//      s1 obj2=new s1();
//      obj2.info(45);
//
//     stu1 obj1=new stu1();
//     obj1.infostu1();
//
//    stu2 obj2=new stu2();
//    obj2.infostu2();

//        horse hor=new horse();
//        horse.walk();
//        horse.breathe();


    }
}


