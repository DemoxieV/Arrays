package com.company;
/*Написать программу, в процессе выполнения которой будет сохраняться число пассажиров,
перевезенных автобусом-экспрессом в аэропорт. Если автобус делает по десять рейсов в будние дни
и по два рейса в субботу и воскресенье, то массив r id e r s можно объявить так, как показано
в приведенном ниже фрагменте кода. */
public class Ragged {
    public static void main(String[] args) {
        int riders[][]=new int[7][];
        //длина массива по второму индексу для первых пяти элементов равна 10
        riders[0]=new int[10];
        riders[1]=new int[10];
        riders[2]=new int[10];
        riders[3]=new int[10];
        riders[4]=new int[10];
        //длина массива по второму индексу для двух последних — 2
        riders[5]=new int[2];
        riders[6]=new int[2];

        int i, j;

        //Фомирование произвольных данных
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                riders[i][j]=i+j+10;
            }
        }
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 2; j++) {
                riders[i][j]=i+j+10;
            }
        }

        System.out.println("Количество пассажиров, перевезенных каждым рейсом, в будние дни: ");

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(riders[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Количество пассажиров, перевезенных каждым рейсом, в выходные дни: ");
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(riders[i][j]+" ");
            }
            System.out.println();
        }
    }
}
