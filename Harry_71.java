package com.company;

class thread1 implements Runnable{
    public void run(){
        for(int i=0;i<=500;i++) {
            System.out.println("method of thread 1 ...");
        }
    }
}
class thread2 implements Runnable{
    public void run(){
        for(int i=0;i<=500;i++)
        System.out.println("method of thread 2 >>>>");
    }
}
public class Harry_71 {
    public static void main(String[] args) {
       thread1 t1=new thread1();
       Thread th=new Thread(t1);

       thread2 t2=new thread2();
       Thread th2=new Thread(t2);

       th.start();
       th2.start();

    }
}
