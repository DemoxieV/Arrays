package com.Shildt_1;
//Инициализация двумерного массива
public class Squares {
    public static void main(String[] args) {
//        int sqrt[][]={
//                {1,1},
//                {2,4},
//                {3,9},
//                {4,16},
//                {5,25},
//                {6,36},
//                {7,49},
//                {8,64},
//                {9,81},
//                {10,100}
//        };
//        int i, j;

//        for (i = 0; i < 10; i++) {
//            for (j = 0; j < 2; j++) {
//                System.out.print(sqrt[i][j]+" ");
//            }
//            System.out.println();
//        }

        int sqrt[][]=new int[10][2];
        int i,j;

        for (i = 0; i < 10; i++) {
//            for (j=0;j < 2; j++) {
                sqrt[i][0]=i+1;
                sqrt[i][1]=(i+1)*(i+1);
                System.out.print(sqrt[i][0]+" "+sqrt[i][1]);
//            }
            System.out.println();
        }


    }
}
