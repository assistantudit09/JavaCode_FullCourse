package com.company;

//q.1)
/*abstract class pen{
    abstract public void write();
    abstract public void refil();
}
class elkos extends pen{
    public void write(){
        System.out.println("Elkos pen can write!!!");
    }
    public void refil(){
        System.out.println("blue coloured refil!!!");
    }
}*/
 // q.2)
//abstract class pen{
//    abstract public void write();
//    abstract public void refil();
//}
//class fountainpen extends pen{
//    public void write(){
//        System.out.println("write!!!!");
//    }
//    public void refil(){
//        System.out.println("red rilfil!!!");
//    }
//    public void changenib(){
//        System.out.println("nib changed!!!");
//    }
//}
// q.3)
//interface BasicAnimal{
//    public void eat();
//    public void sleep();
//}
//class Human implements BasicAnimal{
//    public void jump(){
//        System.out.println("i can jump!!!");
//    }
//    public void run(){
//        System.out.println("i can run!!!");
//    }
//    public void eat(){
//            System.out.println("i can eat!!!");
//    }
//        public void sleep(){
//            System.out.println("i can sleep!!!");
//    }
//
//}
//class Monkey extends Human {
//    public void Jump(){
//        System.out.println("monkey can jump!!!");
//    }
//}
//q.4)
//abstract class telephone{
//    abstract public void ring();
//    abstract public void lift();
//    void disconnect(){
//        System.out.println("phone disconnected!!!");
//    }
//}
//class smartTelephone extends telephone{
//    public void ring(){
//        System.out.println("smartphone is ringing!!!");
//    }
//    public void lift(){
//        System.out.println("smartphone is lifting!!!");
//    }
//    @Override
//    public void disconnect(){  // at this method polymerphism worked..,{ simmilar method having different body.}
//        System.out.println("smartphone disconnected!!!");
//    }
//}
// q.5) nn
//q.6)
//interface TVremote{
//    public void changechannel();
//    public void volume();
//}
//interface smartTVremote extends TVremote{   // it extends by another interface
//    public void iam();
//
//}
//class remote implements smartTVremote{  // it implements by another class
//    public void changechannel(){
//        System.out.println("channel changing..");
//    }
//    public void volume(){
//        System.out.println("volume incresing...");
//    }
//    public void iam(){
//        System.out.println("i am smart tv remote...");
//    }
//}
//q.7) nn --> create a new class and implements from Tvremote.
public class Harry_60practiceset {
    public static void main(String[] args) {
        //q.1)
       /* elkos obj=new elkos();
        obj.refil();
        obj.write();
        */
        // q.2)
//        fountainpen f =new fountainpen();
//        f.write();
//        f.refil();
//        f.changenib();
        //q.3)
//        Monkey mon=new Monkey();
//        mon.jump();
//        mon.eat();
//        mon.sleep();
//        mon.run();
        // here we can access all the method because--> of BasicAnimal is implements on Animal and Monkey is extened
        // from Animal.
// q.4)

//     smartTelephone smt=new smartTelephone();
//     smt.ring();
//     smt.lift();
//     smt.disconnect();
// q.5) nn

        //q.6)
//        remote rem=new remote();
//        rem.iam();
//        rem.changechannel();
//        rem.volume();
//
        //q.7) nn ---> make a new class and implements from Tvremote

   }
}
