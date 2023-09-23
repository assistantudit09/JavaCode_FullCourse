package com.company;

import java.util.*;

public class Telusko_10 {
    public static void main(String[] args) {
      // Set<Integer> s=new HashSet<>();  // printing values in scattered format.
        Set<Integer> s=new TreeSet<>();   //printing values in sequential manner/ ascending sorted.
       s.add(45);
       s.add(43);
       s.add(90);
       s.add(27);

       //s.add(43);  // its a duplicate value so it doesnt print at output. , if we sout it it will give "false".

        for (int val: s) {
            System.out.println(val);
        }

    }
}
