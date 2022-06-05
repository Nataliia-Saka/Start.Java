package ru.gb.lesson3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
        // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(chenging01(array01)));

        
    }

    public static int[] chenging01(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

}
