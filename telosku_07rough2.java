package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class telosku_07rough2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(353);
        list.add(321);
        list.add(32);
        list.add(21093);

//        Comparator<Integer> mycomp = new Comparator<>() {
//            public int compare(Integer o1, Integer o2) {
//                if (o1 < o2)
//                    return 1;
//                return -1;
//
//            }
//        };

        Comparator<Integer> mycomp=(o1,o2)->{
            if(o1%10  > o2%10)
                return 1;
            return -1;
        };
        Collections.sort(list,mycomp);
        System.out.println(list);
        }
    }
