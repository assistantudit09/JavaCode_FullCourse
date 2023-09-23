package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Sauravsukla_02 {
    public static void main(String[] args) {
        // dynamic array list:-
        ArrayList arr1=new ArrayList(10);
        ArrayList arr3=new ArrayList(10);
        // addition of element to array:-
        arr3.add(56);
        arr3.add("45");
        arr3.add("xuv");

        arr1.add("udit");
        arr1.add("rahul");
        arr1.add("polard");
        arr1.add("kiron");
        arr1.add("prakash");
        arr1.add(1,"virat"); // adding on specific index a specific value.
        arr1.remove("rahul"); // removing a object by its name.
        arr1.remove(3); // removing object by index value.
        arr1.addAll( arr3);  // adding a collection.
       // arr1.removeAll(arr3); // removing a collection.
       // arr1.retainAll(arr3);  // retaining a collection.
//        System.out.println(arr1.size()); // size of array
//        System.out.println(arr1.contains("dhoni")); // contains or not

        // display :-( using itrator)
//         Iterator it= arr1.iterator();
//         for(int i=0;i<=arr1.size()-1;i++){
//             System.out.println(it.next());
//         }
//        System.out.println("at 0 index: "+arr1.get(0)); // getting the value of a perticular index.
//        System.out.println(arr1.indexOf("xuv")); // index of object.
       // System.out.println(arr1.subList(0,4)); // index 0 to 3

        // new array making & adding one collection to it:-
        ArrayList arr4=new ArrayList(arr3);
        Iterator it=arr4.iterator();
        //here "Iterator" is a class. "it" is an object. "arr4.iterator()" is a function call.
        for(int i=0;i<=arr4.size()-1;i++){
            System.out.println(it.next());
        }




    }
}
