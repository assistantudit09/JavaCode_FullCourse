package com.company;

//q.1))
class Aus extends Thread{
    public void run(){
        for(int i=0;i<=500;i++){
            System.out.println("Good morning >>>>");
        }
    }

}
class Ind extends Aus{
    public void run(){
        for(int i=0;i<=500;i++) {
            // q.2)
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("welcome>>>>");
        }
    }
}

public class Harry_76 {
    public static void main(String[] args) {
        //q.1)
       Ind in=new Ind();
       Aus au=new Aus();
        System.out.println(in.getPriority()); // it gives 5
        System.out.println(au.getPriority()); // it gives 5
        System.out.println(in.getState()); // "new" because it doesn't run till now
       //q.3)
       in.setPriority(6);
       au.setPriority(9);
        System.out.println(in.getPriority()); // 6
        System.out.println(au.getPriority());  //9

        //q.4)
        // taking reference of "current Thread" and print "getstate".
        System.out.println(Thread.currentThread().getState());  //"runnable" because it now runnable.

//       au.start();
//       in.start();
    }
}
