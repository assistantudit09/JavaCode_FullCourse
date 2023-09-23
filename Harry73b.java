package com.company;

// constructor using "runnable interface"
class mythr2 extends  Thread{
    public mythr2(Runnable r){
        System.out.println("constructor of runnable..."+r);
    }

    public mythr2() {

    }

    public void run(){
        int p=67;
        System.out.println("thank u..");
    }
//    public void run(){
//        int i=0;
//        while(i<=100) {
//            System.out.println("i am thread 2 >>>>>>>");
//            i++;
//        }
//    }
}
public class Harry73b {
    public static void main(String[] args) {
         mythr2 obj=new mythr2();
         Thread t1=new Thread(obj);
         t1.start();
        System.out.println("id: "+t1.getId());
        //System.out.println(t1.getName());

    }
}
