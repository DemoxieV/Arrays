package com.company;
//Реализация алгоритма пузырьковой сортировки одномерного массива
public class Bubble {
    public static void main(String[] args) {
        int nums[]={99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size = 10; //Кол-во сортируемых элементов
        //Отображение исходного массива:
        System.out.print("Исходный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" "+nums[i]);
        }
        System.out.println();

        //Алгоритм пузырьковой сортировки:
        for (a = 1; a < size; a++)
            for (b = size-1; b >= a; b--) {
                if(nums[b-1]>nums[b]){ //Если требуемый порядок следования не соблюдается, меняем местами элементы
                    t=nums[b-1];
                    nums[b-1]=nums[b];
                    nums[b]=t;
                }
            }


        //Отображение отсортированного массива:
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" "+nums[i]);
        }
    }
}
