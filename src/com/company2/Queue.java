package com.company2;
//Создание класса очереди
public class Queue {
    char q[]; // массив для хранения элементов очереди
    int putloc, getloc; //индексы для вставки и извлечения элементов очереди

//Конструктор класса Queue создает очередь заданного размера
    public Queue(int size) {
        q = new char[size]; // выделение памяти для очереди
        putloc = getloc = 0; //исходное значение индексов равно нулю - сейчас в очереди нет элементов
    }

//Помещение символа в очередь
    void put(char ch){
        if(putloc==q.length){ //Проверка - не переполнена ли очередь
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++]=ch; //если очередь не заполнена, то индекс извлечения инкрементируется
    }

//Извлечение символа из очереди
    char get(){
        if (getloc==putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}
