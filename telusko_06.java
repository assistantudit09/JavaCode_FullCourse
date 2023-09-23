package com.company;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class telusko_06    {
    public static void main(String[] args) {
        LinkedList<Integer> link=new LinkedList<>();
        link.add(14);
        link.add(27);
        link.add(40);
        link.add(19);
        link.remove(3);
        link.addFirst(88);
        link.addLast(54);
        Collections.sort(link);

        Iterator it=link.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
