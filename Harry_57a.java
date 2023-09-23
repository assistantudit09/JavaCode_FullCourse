package com.company;

import org.w3c.dom.ls.LSOutput;

interface thePhone{
    public void company();
    public void rate();
    private void colour(){
        System.out.println("white coloured phone..");
    }
    default void processor(){
        colour();
        System.out.println("32GB");
    }
}
interface camera{
    public void cam();
}
class sim{
    public void simcomp(){
        System.out.println("Airtel");
    }
    public void recharge(){
        System.out.println("299 per month, 1.5GB data");
    }
}
class iphone extends sim implements thePhone,camera{
    public void company(){
        System.out.println("my phone is iphone");
    }
    public void rate(){
        System.out.println("rate: 150000");
    }
//    @Override
//    public void processor() {
//        System.out.println("64 Gb");
//    }
    public void cam(){
        System.out.println("30 megapixel camera...");
    }
}
public class Harry_57a {
    public static void main(String[] args) {
           iphone apple=new iphone();
           apple.cam();
           apple.company();
           apple.rate();
           apple.simcomp();
           apple.recharge();
           apple.processor();
    }
}
