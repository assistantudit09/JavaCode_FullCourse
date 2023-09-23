package com.company;

class myThread0 extends Thread{
    public myThread0(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<=100;i++) {
            System.out.println("Thread is run>>>> " + this.getName());
            //following is the style of  "sleep" method call and "interruptedException handling".
            try{
                Thread.sleep(450);
            }catch(InterruptedException e)
            {
               e.printStackTrace();
            }
        }
    }
}
class myThread1 extends Thread{
    public myThread1(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<=100;i++) {
            System.out.println("Thread1 is run $$$$$ " + this.getName());
        }
    }
}

public class Harry_75 {
    public static void main(String[] args)  {
        myThread0 obj = new myThread0("udit narayan>>>>");
        myThread1 obj1 = new myThread1("virat kohli>>>>");

        obj.start();
//        try {
//           // obj.join();  // it joins one after one "run" method.  // here we are bound to use try_catch method.(for error handling)
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }


        obj1.start();
    }
}
