package com.company;
import java.util.Random;
import java.util.Scanner;

class game{
     int number;
     int inputNumber;
     int noofGuesses=0;
     public int getNoofGuesses(){
         return noofGuesses;
     }
     public void setNoofGuesses(){
         this.noofGuesses=noofGuesses;
     }
     game(){
         Random rand=new Random();
         this.number=rand.nextInt(100);
     }
     void takeuserinput() {
         System.out.println("guess the number: ");
         Scanner sc = new Scanner(System.in);
         inputNumber = sc.nextInt();
     }
     boolean iscorrectnumber(){
         noofGuesses++;
         if(inputNumber==number){
             System.out.println("yes u guessed it right!!!");
             return true;
         }
         else if(inputNumber<number){
             System.out.println("too low!!!");
         }
         else if(inputNumber>number){
             System.out.println("too high!!!");
         }
        return false;
     }
}
public class guessthenumber_vid50 {
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while(!b){
            g.takeuserinput();
            b=g.iscorrectnumber();
        }

    }
}
