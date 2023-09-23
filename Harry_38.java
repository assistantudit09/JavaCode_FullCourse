package com.company;
    class employee // creating a class or template of object
{
    // attributes:-
    int id;
    String name;
    int salary;

    //method:-
    public void empdetails(){
        System.out.println("my name is: "+this.name+" , id is: "+this.id);
    }
    public int getsalary(){
        System.out.println(this.salary);
        return salary;
    }

}
public class Harry_38 {
    public static void main(String[] args) {
        employee emp=new employee(); //instatiation of a new employee object
        employee emp1=new employee(); // another obj created.
        // setting attributes:-
        emp1.name="virat kohli";
        emp1.id=6;
        emp1.salary=45000;

       // setting the attributes:-
        emp.name="udit narayan";
        emp.id=45;
        emp.salary=67000;

        //printing the attributes:-
//        System.out.println("id is: "+emp.id+"\n"+"name: "+emp.name);


        // method call:-
        emp.empdetails();
        emp1.empdetails();
        System.out.println("\nsalary emp and emp1: " );
        emp1.getsalary();
        emp.getsalary();
    }
}
