package ru.gb.lesson3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1.
        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(chenging01(array01)));

        //2.
        int[] arr2 = new int[100];
        System.out.println("before:" + Arrays.toString(arr2));
        createArr(arr2, 1, 1);
        System.out.println("after: " + Arrays.toString(arr2));

        //3.
        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifierForArrayes(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));

        //4.
        printArrayInConsole(retLenArr(5, 2));

    }

    //1.
    public static int[] chenging01(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    //2.
    public static void createArr(int[] array, int step, int shift){
        for(int i = 0; i < 100; i ++){
            array[i] = shift + i + step;
        }
    }

    //3.
    public static void modifierForArrayes(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] *= 2;
            }
        }
    }

    //4.
    public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

}
