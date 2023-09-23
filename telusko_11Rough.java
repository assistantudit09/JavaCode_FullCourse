package com.company;

import java.util.*;
public class telusko_11Rough {
    public static void main(String[] args) {


      Map<String,Integer> m=new HashMap<>();
      m.put("audi",4567);
      m.put("scrpio",9999);
      m.put("mercedez",2354);
      m.put("xuv",7832);


//      Set<Map.Entry<String,Integer>> values= m.entrySet();
//      for(Map.Entry<String,Integer> e: values){
//          System.out.println(e.getKey()+" : "+e.getValue());
//      }
      Set < Map.Entry <String,Integer>> s= m.entrySet();

      for(Map.Entry<String,Integer> obj : s){
          System.out.println(obj.getKey()+ " "+obj.getValue());
      }


    }
}
