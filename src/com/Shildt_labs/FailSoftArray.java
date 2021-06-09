package com.Shildt_labs;
//Предотвращение ошибок выхода за пределы массива - "отказоустойчивый массив"
public class FailSoftArray {
    private int a[]; //ссылка на массив
    private int errval; //значение, возвращаемое в случае ошибки при выполнении метода get()
    public int length; //открытая переменная length

    //Конструктору класса передаются размер массива и значение при возникновении ошибки
    public FailSoftArray(int size, int errv){
        a=new int[size];
        errval=errv;
        length=size;
    }

    //Возврат значения элемента массива с заданным индексом
    //Отслеживание попытки выхода за пределы массива
    public int get(int index){
        if(indexOK(index)) return a[index];
        return errval;
    }

    //Установка значения элемента с заданным индексом. Если ошибка - вернуть false
    //Отслеживание попытки выхода за пределы массива
    public boolean put(int index, int val){
        if(indexOK(index)){
            a[index]=val;
            return true;
        }
        return false;
    }

    //Возврат логического значения true, если индекс не выходит за пределы массива
    private boolean indexOK(int index){
        if(index >= 0 & index < length) return true;
        return false;
    }
}
