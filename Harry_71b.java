package com.company;

class mercedez implements Runnable{
    public void run(){
        for(int i=0;i<=500;i++) {
            System.out.println("method of mercedez MMMMMMMMM");
        }
    }
}
class audi implements Runnable{
    public void run(){
        for(int i=0;i<=500;i++){
            System.out.println("method of audi AAAAAAAA");
        }
    }
}
class porche implements Runnable{
    public void run(){
        for(int i=0;i<= 500;i++){
            System.out.println("method of porche PPPPPPP");
        }
    }
}
public class Harry_71b {
    public static void main(String[] args) {
        mercedez m=new mercedez();
        Thread th1=new Thread(m);

        audi a=new audi();
        Thread th2=new Thread(a);

        porche p=new porche();
        Thread th3=new Thread(p);

        th1.start();
        th2.start();
        th3.start();
    }
}
