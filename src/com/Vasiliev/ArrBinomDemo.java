package com.Vasiliev;
import javax.swing.JOptionPane;
public class ArrBinomDemo {
    public static void main(String[] args) {
        //Отображение окна ввода
        String input, title="Биномиальные коэффициенты";
        input=JOptionPane.showInputDialog(null,"Укажите значение нижнего индекса", title, JOptionPane.QUESTION_MESSAGE);
        //Проверка ввода
        if(input==null){
            System.exit(0);
        }
        int n; //Переменная для записи нижнего индекса
        n=Integer.parseInt(input);
        //Проверка корректности значения. Важно: n(нижний индекс)>=m(верхний индекс)>=0
        if(n<0){
            JOptionPane.showMessageDialog(null,"Указан неверный параметр!",title,JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        //Создание массива
        int binoms[]=new int[n+1];
        //Значение первого элемента массива
        binoms[0]=1;
        //Текст для отображения в диалоговом окне
        String txt="Содержимое массива: \n| "+binoms[0]+" |";
        //Вычисление значений элементов массива
        for (int m = 1; m < binoms.length; m++) {
            //Значение элемента рассчитывается по рекуретной формуле: C n,m=C n,m-1 * (n-m+1)/m
            binoms[m]=binoms[m-1]*(n-m+1)/m;
            //В текст дописывается значение элемента
            txt+=" "+binoms[m]+" |";
        }

        //Отображение диалогового окна
        JOptionPane.showMessageDialog(null,txt,title,JOptionPane.INFORMATION_MESSAGE);
    }
}
