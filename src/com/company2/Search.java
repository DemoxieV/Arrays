package com.company2;
// алгоритм поиска значения в неотсортированном массиве с помощью for-each
// цикл прерывается, если искомый элемент найден
public class Search {
    public static void main(String[] args) {
        int nums[]={6,8,3,7,5,6,1,4};
        int val=5; //искомое значение
        boolean found=false;

        for (int x: nums) {
            if(x==val){
                found=true;
                break;
            }
        }
        if(found)
            System.out.println("Значение 5 найдено в массиве!");
    }
}
