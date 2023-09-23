package com.company;

import java.util.Scanner;

public class Harry_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter student name: ");
        String name = sc.nextLine();
        System.out.println("physics: ");
        int phy = sc.nextInt();
        System.out.println("chemistry: ");
        int che = sc.nextInt();
        System.out.println("math: ");
        int mth = sc.nextInt();
        System.out.println("computer: ");
        int comp = sc.nextInt();
        System.out.println("english: ");
        int eng = sc.nextInt();
        int total = phy + che + mth + comp + eng;
        float pers = total / 5;


        System.out.println("the total mark of " + name + "  :" + total);
        System.out.println("percentage: " + pers);
    }
}
