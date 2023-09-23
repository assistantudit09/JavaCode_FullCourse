package com.company;


    // private variable can't access,it only access through methods :-
//  private int id;
//  private String name;
    class circle{
        private int rad;
        public int setrad(int n){
            rad=n;
            return rad;
        }
        public double perimeter(){
            double p=rad*rad*3.414;
            System.out.println("perimeter is: "+p);
            return p;
        }

    }
    public class Harry_40 {
    public static void main(String[] args) {
    //myemployee emp=new myemployee();
    // emp.id=89; -->>it gives error because of id is privately declared.
    // emp.name="udit narayan"; -->>  private

        circle c=new circle();
        c.setrad(4);
        c.perimeter();

    }
}
