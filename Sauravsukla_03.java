package com.company;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Sauravsukla_03 {
    public static void main(String[] args) {
//               LinkedList l=new LinkedList();
//               l.add(10);
//               l.add(20);
//               l.add(30);
//               l.add(40);
//               l.add(50);
//
//               l.remove(3);
//               l.addFirst(78);
//               l.addLast(90);
//               l.add(2,"udit narayan");
//                l.removeFirst();
//                l.removeLast();
//        System.out.println(l.isEmpty());
//        System.out.println(l.indexOf("udit narayan"));
//        System.out.println(l.size());
//        System.out.println(l.get(4));
//
//               Iterator it=l.iterator();
//
//               for(int i=0;i<=l.size()-1;i++){
//                   System.out.println(it.next());
//               }
//        System.out.println("first element: "+l.getFirst());
//        System.out.println("last element: "+l.getLast());

//        Vector l=new Vector(50);
//        l.add(10);
//        l.add(20);
//        l.add(30);
//        l.add(40);
//        l.add(50);
//
//        l.remove(3);
//
//
//        l.add(2,"udit narayan");
//
//
//        System.out.println(l.isEmpty());
//        System.out.println(l.indexOf("udit narayan"));
//        System.out.println(l.size());
//        System.out.println(l.get(4));
//
//        Iterator it=l.iterator();
//
//        for(int i=0;i<=l.size()-1;i++){
//            System.out.println(it.next());
//        }
//        System.out.println("first element: "+l.get(0));
//        System.out.println("last element: "+l.get(l.size()-1));

        Stack st=new Stack();
        st.add("audi");
        st.add("mercedez");
        st.add("xuv");
        st.add("indigo");
        st.add("scrpio");
        st.add(0,"xuv 700");
        st.push("lamborgini");
        st.pop();
         st.pop();
        System.out.println(st.isEmpty());
        System.out.println("the Top value is: "+st.peek());
        System.out.println(st.set(2,"rolls royce"));
        Iterator it=st.iterator();
        for(int i=st.size()-1;i>=0;i--){
            System.out.println(it.next());
        }
    }
}
