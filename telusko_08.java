package com.company;

import java.util.*;

import static java.util.Collections.sort;

class cse{

    int fac;
    int stu;
    public cse(int x,int y){
        stu=x;
        fac=y;

    }
    //"tostring()" is an built-in method in java that returns the value of the given method
    //  in a sting format.

    public String toString(){
        return "student: "+stu +" faculty: "+fac;
    }

}
public class telusko_08 {
    public static void main(String[] args) {
        ArrayList<cse> al=new ArrayList<>();
        al.add(new cse(50,5));
        al.add(new cse(70,4));
        al.add(new cse(45,3));
        al.add(new cse(68,7));

        Comparator <cse> mycomp=(o1,o2)-> {
            if(o1.stu<o2.stu)
                return 1;
            return -1;
        };
        Collections.sort(al,mycomp);

        Iterator it=al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }



    }
}
