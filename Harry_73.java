package com.company;

class mythr extends Thread{


    public  mythr(String name){
        super(name);   // "super()" is used for call instance of this perticular class.
    }
    public void run(){

        System.out.println("thread is runnn>>>>>");
    }
}
public class Harry_73 {
        public static void main(String[] args) {
            mythr obj=new mythr("udit narayan samal...");
            mythr obj2=new mythr("sahil khan....");

            obj.start();
            obj2.start();



            System.out.println(obj.getName()+obj.getId());   // getId() gives a Id of the thread autometically.
            System.out.println(obj2.getName()+obj2.getId());





        }
    }


