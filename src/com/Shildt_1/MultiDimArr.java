package com.Shildt_1;
//Вывод многомерных (зд.трехмерных) массивов
public class MultiDimArr {
    public static void main(String[] args) {
        int multidim[][][]=new int[4][10][3];
        int i, j, k;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 10; j++) {
                for (k = 0; k < 3; k++) {
                    multidim[i][j][k]=(i*2)+(j*3)+k;
                    System.out.print(multidim[i][j][k]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
