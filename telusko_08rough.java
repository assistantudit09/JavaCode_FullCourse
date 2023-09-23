package com.company;

import java.util.*;
class cricket{
    int wickets;
    String bowler;
    public cricket(int wickets,String bowler){
        this.bowler=bowler;
        this.wickets=wickets;
    }
    public String toString(){
        return bowler+" got "+wickets+" wickets.";
    }
}
public class telusko_08rough {
    public static void main(String[] args) {
        ArrayList<cricket> arr=new ArrayList<>();
        arr.add(new cricket(10,"bhubaneswar kumar"));
        arr.add(new cricket(7,"michlle johnson"));
        arr.add(new cricket(13,"dj bravo"));

        Collections.sort(arr,(a,b)->{
            if(a.wickets < b.wickets)
                return 1;
            return -1;
        });

        Iterator it=arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
