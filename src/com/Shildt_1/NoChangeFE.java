package com.Shildt_1;
//Цикл по коллекции for-each предназначен только для чтения, а не записи значения в элемент массива!
//Всегда нужна дополнительная результирующая переменная для записи результата, см. класс ForEach
public class NoChangeFE {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};

        for (int x: nums) {
            System.out.print(x+" ");
            x=x*10; //Эта операция не изменяет содержимое массива nums
        }
        System.out.println();
        for (int x: nums) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
