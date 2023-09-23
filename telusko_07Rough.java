package com.company;

import java.util.*;


//class mycomp implements Comparator<Integer>{
//    public int compare(Integer o1,Integer o2){
//        if (o1>o2)
//             return 1;
//        return -1;
//
//    }
//}
public class telusko_07Rough {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(45);
        ll.add(39);
        ll.add(89);
        ll.add(92);

        // sorting using anonymous class:-
//        Comparator<Integer> obj = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1 > o2)
//                    return 1;
//                return -1;
//            }
//        };

        //soring using Lambda expression:-
        Comparator<Integer> obj=(o1,o2) ->{
            if(o1>o2)
                return 1;
            return -1;
        };
        Collections.sort(ll, obj);

        Iterator it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
