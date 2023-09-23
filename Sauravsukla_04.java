package com.company;
import java.util.*;
public class Sauravsukla_04 {
    public static void main(String[] args) {
//        Vector v=new Vector();
//        v.addElement("rahul");
//        v.addElement("rabi");
//        v.addElement("udit");
//        v.addElement("kiron");
        // System.out.println(v);
        // enumeration:-
//        Enumeration e= v.elements();
//       for(int i=0;i<=v.size()-1;i++){
//           System.out.println(e.nextElement());


        // Iterator:-
//        ArrayList a = new ArrayList();
//        for (int i = 10; i <= 15; i++) {
//            a.add(i);
//        }
//        System.out.println("elements in array: "+a);
//        Iterator it = a.iterator();
//        while (it.hasNext()) {
//            // System.out.print(it.next()+" ");
//            Integer in = (Integer) it.next();  // type casting integer.
//            if (in > 13 )
//                it.remove();  // remove function.
//        }
//
//
//            System.out.println(a);

          //Listiterator:-
        LinkedList l=new LinkedList();
        l.add("rohit");
        l.add("sikhar");
        l.add("virat");
        l.add("dhoni");
        System.out.println(l);
        ListIterator lit=l.listIterator();
        while (lit.hasNext()) {
            String st=(String)lit.next();
            if(st.equals("rohit"))
                lit.set("mumbai");
            else if(st.equals("dhoni"))
                lit.add("csk");
            else if(st.equals("virat"))
                lit.remove();

        }
        System.out.println(l);

    }
}

