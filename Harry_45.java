package com.company;

//class base{
//    int roll,mark;
//    public int res;
//    public void setres(int q){
//        res=q;
//    }
//    public void getres(){
//        System.out.println("result is : "+res);
//    }
//}
//class derived extends base{
//    float  perc;
//    public void getdetails(float p,int r,int m){
//        perc=p;
//        roll=r;
//        mark=m;
//
//        System.out.println("roll: "+roll);
//        System.out.println("perc: "+perc);
//        System.out.println("marks: "+mark);
//
//    }
//
//}

//quiz:- animal- base and dog- derived.
    class animal{
        String type;
        int agelimit;
        char colour;
        String work;
        public void working(){
            work="the dog is barking";
            System.out.println(work);

        }

    public void runn() {
    }
}
    class dog extends animal{
        public void detailsdog(String t,int a,char c){
            type=t;
            agelimit=a;
            colour=c;

            System.out.println("type= "+type);
            System.out.println("age limit= "+agelimit);
            System.out.println("colour= "+colour);
            working();
        }


    }

public class Harry_45 {
    public static void main(String[] args) {
//        base b=new base();
//        b.setres(345);
//        b.getres();
//
//        derived d=new derived();
//        d.getdetails(90.8f,10,90);
//
    // quiz:-
        dog d=new dog();
        d.detailsdog("husky",15, 'b');


    }
}
