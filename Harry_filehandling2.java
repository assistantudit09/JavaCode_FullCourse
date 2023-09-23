package com.company;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Harry_filehandling2 {
    public static void main(String[] args) {
//        // file creationn :-
//        File obj=new File("uditfile2.txt");
//        try{
//            obj.createNewFile();
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        // file writing:-

//        try{
//           FileWriter obj=new FileWriter("uditfile2.txt");
//           obj.write("i am udit narayan samal mmmmmmmjbukyftyvkulb");
//           obj.close();
//
//        }catch(IOException e) {
//            e.printStackTrace();
//        }
        File obj=new File("uditfile2.txt");
       try{
           Scanner sc=new Scanner(obj);
           String str=sc.nextLine();
           System.out.println(str);
       }catch(IOException e){
           e.printStackTrace();
       }

//       File obj=new File("uditfile2.txt");
//        obj.delete();
        }
    }

