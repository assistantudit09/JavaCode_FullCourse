package com.company;

import java.util.*;
public class Teluskorough2_11 {
    public static void main(String[] args) {
      Map<String,String> mymap=new HashMap<>();
      mymap.put("Driems","cuttack");
      mymap.put("jagganath","puri");
      mymap.put("ABIT","cuttack");
      mymap.put("Tetrahedron","tangi");

//      Set<String> myset= mymap.keySet();
//      for(String str: myset)
//          System.out.println("college: "+str+" address: "+mymap.get(str));


        Set<Map.Entry<String,String>> obj=mymap.entrySet();
        for(Map.Entry<String,String> st: obj){
            System.out.println(st.getKey()+" "+st.getValue());
        }
    }
}
