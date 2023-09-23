package com.company;

/*class car{
    int rate;
    String colour;
    String comp;
    public car(){
        rate=45000000;
        System.out.println("rate of car= "+rate);
    }
    public  car(String n,String c){
        colour=n;
        comp=c;
        System.out.println("colour= "+colour);
        System.out.println("company is= "+comp);
    }

} */
//constructor overloading :-
class area {
    int a;
    float  b;
    int len;
    int bre;
    public area(int side){
         a=side;
        System.out.println("area of square= "+(a*a));
    }
    public area(float rad)
    {
         b=rad;
        System.out.println("area of circle= "+(3.141*b*b));
    }
    public area(int l,int b){
        len=l;
        bre=b;
        System.out.println("area of rectangle= "+(len*bre));
    }

}
public class Harry_42 {
    public static void main(String[] args) {
       /* car c1=new car("black","audi "); // parameterized constructor is called while making object
        car c2=new car(); // default constructor is called.
        // we don't need to call using by "." operator. */
        area ar=new area(4);
        area ar2=new area(4.5f);
        area ar3=new area(7,2);

    }
}
