 package com.company;

interface school{
    int founded=1985; // u can make also attribute.
    public void Schoolname(String s);
    public void Schoolno(int n);
}
interface school2{
    public void student(int x);
    public void place(String p);
}
class education implements school,school2 { // here u can apply multiple inheritance but in abstrct class u can't.
    public void Schoolname(String s){
        System.out.println("name of school= "+s);
    }
    public void Schoolno(int n){
        System.out.println("school no: "+n);
    }
    public void student(int x){
        System.out.println("students: "+x);
    }
    public void place(String p){
        System.out.println("place: "+p);
    }
}
public class Harry_55 {
    public static void main(String[] args) {
         education edu=new education();
        System.out.println("founded on: "+edu.founded);
         edu.place(" bhubaneswar ");
         edu.Schoolname(" jagannath institute ");
         edu.student(670);
         edu.Schoolno(05);
    }
}
