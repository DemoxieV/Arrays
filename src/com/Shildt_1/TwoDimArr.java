package com.Shildt_1;
//Демонстрация двумерного целочисленного табличного массива
public class TwoDimArr {
    public static void main(String[] args) {
        int t, i;
        int table[][]=new int[3][4];
        for (t = 0; t < 3; t++) {
            for (i = 0; i < 4; i++) {
                table[t][i]=(t*4)+i+1;
                System.out.print(table[t][i]+"\t");
            }
            System.out.println();
        }
    }
}
