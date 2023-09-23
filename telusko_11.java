package com.company;

import java.util.*;
public class telusko_11 {
    public static void main(String[] args) {
        Map<String,Integer> m=new Hashtable<>();
        m.put("physics",89);
        m.put("chemistry",98);
        m.put("math",100);
        m.put("science",78);

       //  System.out.println(m.get("chemistry"));  // we can get the value of only passing the key value.

        // for printing all the values:-
        // for printing the values we have to use this process.
        Set<String> key =m.keySet();

        for(String s: key){
            System.out.println(s+" "+m.get(s));
        }

    }
}
