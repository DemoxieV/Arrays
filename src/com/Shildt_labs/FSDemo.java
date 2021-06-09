package com.Shildt_labs;
//Демонстрация работы с "отказоустойчивым" массивом
public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        //Демонстрация корректной обработки ошибок
        System.out.println("Обработка ошибок без вывода отчета.");
        for (int i = 0; i < (fs.length * 2); i++) {
            //Для обращения к элементам массива используем его методы доступа put() и get()
            fs.put(i, i * 10);
        }
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println();

        //Обработка ошибок
        System.out.println("Обработка ошибок с выводом отчета.");
        for (int i = 0; i < (fs.length * 2); i++) {
            //Для обращения к элементам массива используем его методы доступа put() и get()
            if (!fs.put(i, i * 10))
                System.out.println("Индекс " + i + " вне допустимого диапазона");
        }
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1)
                System.out.print(x + " ");
            else System.out.println("Индекс " + i + " вне допустимого диапазона");
        }
    }
}
