package com.company;
//Демонстрация одномерного массива
public class ArrayDemo {

    public static void main(String[] args) {
	int sample[]=new int[10];
	int i;
//  Индексация массивов начинается с 0
        //Инициализировали массив, обращение к значению массива -> sample[i]
        for (i = 0; i < 10; i++) {
            sample[i]=i;
        }
        //Последовательный вывод индексов и элементов массива
        for (i = 0; i < 10; i++) {
            System.out.println("Элемент ["+i+"]: "+sample[i]);
        }
        //Имитация выхода за пределы массива
//        for (i = 0; i < 100; i++) {
//            System.out.println("Элемент ["+i+"]: "+sample[i]);
//        }

        System.out.println();
        int n=5, j;
        int[] a=new int[n];
        for (j = 0; j < n; j++) {
            a[j]=j*(j+1);
            System.out.println("Элемент ["+j+"]: "+a[j]);
        }

    }
}
