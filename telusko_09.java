package com.company;

import java.util.*;
import java.lang.*;
class bikes implements Comparable<bikes> {
    int price;
    String model;
    public bikes(int price,String model){
        this.price=price;
        this.model=model;
    }
    @Override
    public String toString(){
        return "price: "+price+" = model: "+model;
    }

    // method of Comaparable interface.
    public int compareTo(bikes b){
        if(this.price <   b.price){
            return 1;
        }
        return -1;
    }
}
public class telusko_09 {
    public static void main(String[] args) {
      ArrayList<bikes> arr=new ArrayList<>();
      arr.add(new bikes(75000,"glamour"));
      arr.add(new bikes(2500000,"ducati"));
      arr.add(new bikes(120000,"duke"));
      arr.add(new bikes(65000,"pept"));

//      Collections.sort(arr,(a,b)->{
//          if(a.price < b.price)
//              return 1;
//          return -1;
//      });

        Collections.sort(arr);
       Iterator it=arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
