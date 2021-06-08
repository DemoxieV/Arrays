package com.Shildt_labs;

public class BubbleTest {
    public static void main(String[] args) {
//        int array[] = {820,515,640,-238,476,300};
        int array[]={3,12,-7,0,21};
        int i, temp;

        System.out.print("Исходный массив: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println();

        boolean isSorted=true;
        while(isSorted) { //Проверка, выполнилась ли сортировка
            isSorted=false;
            for (i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted=true;
                }
            }
        }

        System.out.print("Отсортированный массив: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
