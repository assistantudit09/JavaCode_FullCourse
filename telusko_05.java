package com.company;


import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import static java.util.Collections.sort;

public class telusko_05 {
    public static void main(String[] args) {
       Vector <Integer> l= new Vector<Integer>();
       l.add(1);
       l.add(11);
       l.add(560);
       l.add(78);
       l.add(45);
       l.add(678);
       l.remove(3);

       System.out.println("successfully deleted item of index 3");
        System.out.println("capacity of vector is: "+ l.capacity());

        ListIterator li= l.listIterator();
        while (li.hasNext()) {

            System.out.println(li.next());
        }


    }
}
