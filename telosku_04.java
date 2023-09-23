package com.company;

import java.util.*;
public class telosku_04 {
    public static void main(String[] args) {
        List<Integer>l=new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(2,70);
        Collections.sort(l);  // using list interface we can sort.

        // here is the iterative method of printing values.
//        Iterator it=l.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        // stream API ...lamda expression --> for printing element:
        l.forEach(System.out::println);


    }
}
