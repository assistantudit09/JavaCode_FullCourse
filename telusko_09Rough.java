package com.company;

import java.util.*;
import java.lang.*;
class ipl implements Comparable<ipl>{
    int trophies;
    String Team;
    public ipl(int trophies,String Team){
        this.trophies=trophies;
        this.Team=Team;
    }
    public String toString(){
        return Team+" wins "+trophies+ " trophies";
    }
    public int compareTo(ipl i){
        if(this.trophies < i.trophies)
            return 1;
        return -1;
    }
}
public class telusko_09Rough {
    public static void main(String[] args) {
        ArrayList <ipl>arr=new ArrayList<>();
        arr.add(new ipl(5,"mumbai indians"));
        arr.add(new ipl(4,"chennai super kings"));
        arr.add(new ipl(2,"kolkata knight riders"));
        arr.add(new ipl(1,"rajastan royals"));

        Collections.sort(arr);

        Iterator it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
