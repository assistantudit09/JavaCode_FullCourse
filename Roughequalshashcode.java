package com.company;

import java.util.*;
class Studentbtech{
    int roll;
    String name;
    public Studentbtech(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
    public String toString(){
        return "roll: "+roll+"  name: "+name;
    }
   //
    // that is the equals() & hashcode() overriding for comparing two coustum classes in SET.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Studentbtech)) return false;
        Studentbtech that = (Studentbtech) o;
        return roll == that.roll && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}
public class Roughequalshashcode {
    public static void main(String[] args) {
        Set<Studentbtech> stu=new HashSet<>();
        stu.add(new Studentbtech(1," rohit sharma"));
        stu.add(new Studentbtech(2," sikhar dhawan") );
        stu.add(new Studentbtech(3," virat kohli"));
        stu.add(new Studentbtech(1," rohit sharma"));

        // another example: -
        Studentbtech stu1=new Studentbtech(10,"kiron pollard");
        Studentbtech stu2=new Studentbtech(10,"kiron pollard");
        System.out.println(stu1.equals(stu2)); // it will give true because roll & name  are same in both the object.

       Iterator it=stu.iterator();
        while (it.hasNext()) {

            System.out.println(it.next());
        }
    }
}
