package com.company;

class mythread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=1000;i++){
            System.out.println("method of mythread @@@@@@");
        }
    }
}
class mythread2 extends mythread{
    @Override
    public void run(){
        for(int i=0;i<=1000;i++) {
            System.out.println("method of mythread2 $$$$$$");
        }
    }

}
class mythread3 extends mythread2{
    @Override
    public void run(){
        for(int i=0;i<=1000;i++){
            System.out.println("method of mythread3 #####");
        }
    }
}
public class Harry_70b {
    public static void main(String[] args) {
          mythread mt=new mythread();
          mythread2 mt2=new mythread2();
          mythread3 mt3=new mythread3();
          mt.start();
          mt2.start();
          mt3.start();
    }

}
