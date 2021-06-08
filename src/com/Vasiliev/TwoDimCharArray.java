package com.Vasiliev;
import javax.swing.*;
public class TwoDimCharArray {
    public static void main(String[] args) {
        //Массив содержит значения, определяющие длину строк символьного массива
        int[] size={3,12,4,7};
        //Создаем массив, в котором определено кол-во строк, но не задано кол-во столбцов
        char[][] symbs=new char[size.length][];
        //Символьная переменная с начальным символом для заполнения массива
        char s='A';
        //Текстовая переменная для формирования текста в диалоговом окне
        String txt="";
        //Создание строк массива и присваивание значений элементам массива
        for (int i = 0; i < symbs.length; i++) {
            //Создание строки массива
            symbs[i]=new char[size[i]];
            //Заполнение строки значениями
            for (int j = 0; j < symbs[i].length; j++) {
                //Элементу массива присваивается значение
                symbs[i][j]=s;
                //Следующий символ
                s++;
                //К текстовому значению дописывается значение элемента массива
                txt+="| "+symbs[i][j]+" ";
            }
            //Последняя черта и переход к новой строке
            txt+="|\n";
        }
        //Отображение сообщения
        JOptionPane.showMessageDialog(null,txt,"Массив со строками разной длины", JOptionPane.PLAIN_MESSAGE,new ImageIcon("H:/ProjectPics/abc.png"));
    }
}
