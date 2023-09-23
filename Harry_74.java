package com.company;

class mythr1 extends Thread{
    public mythr1(String name){
        super (name);
    }
    public void run(){
        for(int i=0;i<=100;i++) {
            System.out.println("thread run>>> " + this.getName());  // this.getname() gives name which contains by above constructor.
        }
    }
}
public class Harry_74 {
    public static void main(String[] args) {
        mythr1 t1=new mythr1("kiron");
        mythr1 t2=new mythr1("robin");
        mythr1 t3=new mythr1("udit");
        mythr1 t4=new mythr1("polard");

        // now we 're giving priority to each thread.
        t1.setPriority(Thread.MIN_PRIORITY);  //--> it shows in output less times.
        t3.setPriority(Thread.NORM_PRIORITY); //--> it shows in output normal times.
        t4.setPriority(Thread.MAX_PRIORITY);  // --> it shows in output more times.

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
