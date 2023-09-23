package com.company;

interface vehicle1{
    public void company();
    public void rate();

}
interface vehicle2 extends vehicle1{ // vehicle2 is child of vehicle1.
    public void company2();
    public void rate2();
}
class cartype implements vehicle2{  // here cartype implements the vehicle2 , here methods of both vehicle1 and
                                   // vehicle2 should use, because vehicle2 contains attributes of vehicle1.
    public void company(){
        System.out.println("mercedez benz");
    }
    public void rate(){
        System.out.println("rate: 80000000");
    }
    public void company2(){
        System.out.println("audi");
    }
    public void rate2(){
        System.out.println("rate: 56000000");
    }
}
public class Harry_58 {
    public static void main(String[] args) {
        cartype car=new cartype();
        car.company();
        car.rate();
        car.company2();
        car.rate2();
    }
}
