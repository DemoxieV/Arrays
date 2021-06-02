package com.company;

import org.w3c.dom.ls.LSOutput;

public class BubbleTest2 {
    public static void main(String[] args) {
        int a,b,t;
        int nums[]={3,12,-7,0,21};
        System.out.print("Исходный массив: ");
        for (a = 0; a < nums.length; a++) {
            System.out.print(" "+nums[a]);
        }

        for (a = 1; a < nums.length; a++) {
            for (b = nums.length-1; b >=a; b--) {
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1]=nums[b];
                    nums[b]=t;
                }
            }
        }
        System.out.println();
        System.out.print("Отсортированный массив: ");
        for (a = 0; a < nums.length; a++) {
            System.out.print(" "+nums[a]);
        }
    }

}
