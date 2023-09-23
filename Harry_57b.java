package com.company;
interface Animals{  // interface.
    public void eat();
    public void fly();
    private void age(){   // private method uses for default method.
        System.out.println("i lives about 15 years");
    }
    default void run(){  // default method uses in interface for making modifying.
        age();   // accessing private method.
        System.out.println("this animal can run!!!");
    }
}
class Eagle{
    public void bird(){
        System.out.println("iam an Eagle!!!");
    }
}
class jungle  extends Eagle implements Animals{   // extends from Eagle and implements from Animals.
    public void eat(){
        System.out.println("animal can eat");
    }
    public void fly(){
        System.out.println("animal can fly");
    }
    public void bird(){
        System.out.println("eagle is a bird");
    }
//    @Override
//    public void run(){      // we can also override the default method and modify it.
//        System.out.println("birds can run!!!");
//    }

}
public class Harry_57b {
    public static void main(String[] args) {
        jungle jun=new jungle();
        jun.bird();
        jun.eat();
        jun.fly();
        jun.run();

    }
}
