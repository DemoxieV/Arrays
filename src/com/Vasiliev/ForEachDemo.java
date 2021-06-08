package com.Vasiliev;
import javax.swing.JOptionPane;
import java.util.Random;

public class ForEachDemo {
    public static void main(String[] args) {
        //Размер массива
        int size=10;
        //Объект для генерирования случайных чисел
        Random rnd=new Random();
        //Создание массива
        int[] nums=new int[size];
        //Текст для отображения в диалоговом окне
        String txt="Массив случайных чисел: \n";
        //Заполнение массива случайными числами
        for (int k = 0; k < nums.length; k++) {
            //nextInt(10) целое число в диапазоне от 0 до 9, смещение диапазона +1 - случайное число от 1 до 10
            nums[k]=rnd.nextInt(10)+1;
            txt+=nums[k]+" | ";
        }
        //Дополнение текстового значения
        txt+="\n Проверка: \n";
        //Отображение элементов с помощью оператора цикла по коллекции
        for (int s: nums) {
            txt+=s+" | ";
        }
        //Отображение диалогового окна
        JOptionPane.showMessageDialog(null, txt, "Случайные числа", JOptionPane.PLAIN_MESSAGE);
    }
}
