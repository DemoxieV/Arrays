package com.Vasiliev;
import javax.swing.*;
public class ListDemo {
    public static void main(String[] args) {
        //Текстовый массив с названиями животных
        String txt[]={"Волк", "Лиса", "Медведь", "Енот"};
        //Текстовый массив с названиями файлов с изображениями животных
        String[] files={"wolf.png", "fox.png", "bear.png", "racoon.png"};
        //Текстовая переменная с указанием пути к файлам с изображениями
        String folder="H:/ProjectPics/";
        //Текст сообщения
        String msg="Кого показать?";
        //Название диалогового окна
        String title="В мире животных";
        //Объект иконки для диалогового окна
        ImageIcon img=new ImageIcon(folder+"animal.png");
        //Переменная для записи выбора пользователем животного
        String animal;

        //Отображение диалогового окна с выпадающим списком для выбора животного
        // txt - массив элементов выпадающего списка, txt[0] - элемент, выбранный по умолчанию
        animal= (String) JOptionPane.showInputDialog(null, msg,title,JOptionPane.PLAIN_MESSAGE,img,txt,txt[0]);
        //Проверка ввода/выбора
        if (animal==null){
            System.exit(0);
        }

        //Определение иконки для отображения в диалоговом окне
        for (int k = 0; k < txt.length; k++) {
            if(animal.equals(txt[k])){
                img=new ImageIcon(folder+files[k]);
                break;
            }
        }
        //Отображение диалогового окна с изображением выбранного животного
        JOptionPane.showMessageDialog(null,img,animal,JOptionPane.PLAIN_MESSAGE);
    }
}
