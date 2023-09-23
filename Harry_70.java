package com.company;

class UditThread extends Thread{   // here "Thread" is a keyword ( extending Thread-class).
    public void run(){     // here "run()" is keyword which executes when "start()" use in main class.
        int i=0;
        while(i<=1000) {
            System.out.println("java thread is run ******");
            i++;
        }
    }
}
class UditThread2 extends UditThread   {
    public void run(){
        int i=0;
        while(i<=1000){
            System.out.println("java thread 2 is run $$$$$$$");
            i++;
        }
    }
}

public class Harry_70 {
    public static void main(String[] args) {
         UditThread2 ps=new UditThread2();
         UditThread ut=new UditThread();
         ps.start();   // "start()" is a keyword which calls the "run()" method.
         ut.start();

    }
}
