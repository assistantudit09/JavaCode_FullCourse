package com.company;

import java.io.File; // for file creation.
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Harry_filehandling {
    public static void main(String[] args) {
        // creation of file:-
//        File obj=new File("uditfile.txt");
//        try{
//            obj.createNewFile(); // method of creating new file.
//        }
//        catch(IOException e){
//            e.getStackTrace();
//            System.out.println("unsucessfully created file...");
//        }
       // writing to file:-

//        try {
//              FileWriter obj = new FileWriter("uditfile.txt");
//             obj.write("i am udit narayan samal>>>> /n i am a software engineer...");
//             obj.close();   // you should have to close after write inside file.
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        // reading from file:-
//        File obj=new File("uditfile.txt");
//        try{
//            Scanner sc= new Scanner(obj);
//            String str=sc.nextLine();
//            System.out.println(str);
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }

        // deleting a file:-
        File obj=new File("uditfile.txt");
        // here we doesnt create try_catch block...
        obj.delete();

    }
}
