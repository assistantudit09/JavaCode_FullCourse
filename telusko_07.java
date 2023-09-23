package com.company;


import java.util.*;

class comp implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        // if(a > b) //  compare for sorting
        //if(a % 10 >b % 10)   //sorting according to last digit.
        if(a%100 > b%100)  // sorting according to last two digit.
            return 1; //here it makes them swap.

        return -1;  // dont swap.
    }
}

public class telusko_07 {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(10);
        ar.add(305);
        ar.add(432);
        ar.add(338);

        Collections.sort(ar);
       // Collections.reverse(ar);  // reversing all the element.

      // sorting using comparator.
        Comparator<Integer> obj=new comp();
        Collections.sort(ar,obj);



        Iterator it=ar.iterator();
        while (it.hasNext()) {

            System.out.println(it.next());
        }
    }

}
