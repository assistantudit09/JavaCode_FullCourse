package com.company;

public class Harry_28 {
    public static void main(String[] args) {
        //multidimentional array are "array of array" 2D,3D
//        int arr[][]={{20,40,67},{89,54,43}};
//        System.out.println(arr.length); // length is 2.
//         int [][] flats = new int[2][3] ; // 2d array initialisation. + size allocation.
//         //int [][]flats={{101,102,103},{201,202,203}};
//        flats[0][0]=101;
//        flats[0][1]=102;
//        flats[0][2]=103;
//        flats[1][0]=201;
//        flats[1][1]=202;
//        flats[1][2]=203;
//         for(int i=0;i<flats.length;i++){
//             for(int j=0;j<flats[i].length;j++){
//                 System.out.print(flats[i][j]);
//                 System.out.print(" ");
//             }
//             System.out.println(" ");
//         }
        //again:-
        //multi dimentional array:-

        int arr[][]={{34,56,54},{78,76,43}};
        System.out.println("displaying output:- ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");

        }
    }
}
