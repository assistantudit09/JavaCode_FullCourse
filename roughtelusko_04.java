package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class roughtelusko_04 {
    public static void main(String[] args) {
     List<Integer> li=new ArrayList<>();
     li.add(11);
     li.add(22);
     li.add(33);
     li.add(44);
     li.add(3,99);
     li.set(0,88); //replace the index element.
         System.out.println("fourth index element is: "+li.get(2)); // getting value of index.

      Collections.sort(li);   // for sorting the element

       // iterative method to print output.
//     Iterator it=li.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
       li.forEach(System.out::println);  //stream ... API method of getting output.


    }
}
