package com.Shildt_1;

// Использование цикла for-each для суммирования и отображение значений массива
public class ForEach {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0; //переменная для записи результата сложения всех значений элементов массива

        for (int x: nums) {
            System.out.println("Значение: "+x);
            sum+=x;
        }
        System.out.println("Сумма: "+sum);
        System.out.println();

        sum=0;
        for(int x: nums){
            System.out.println("Значение: "+x);
            sum+=x;
            if(x==5) { //прерывание цикла по достижении значения 5
            System.out.println("Сумма первых пяти элементов: "+sum);
            break;
            }
        }

    }
}
