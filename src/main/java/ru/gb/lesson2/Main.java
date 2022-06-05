package ru.gb.lesson2;

public class Main {
    public static void main(String[] args) {
        within10and20(17,8);
        sum(15, 35);
        isPositiveOrNegative(7);
        isNegative(-6);
        printWordNTimes(1);
    }
    // 1 задание
    public static boolean within10and20(int x, int y) {
        int sum = x + y;
        if (sum >=10 && sum <=20) {
            return true;
        } else {
            return false;
        }
    }

    //2 задание
    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    // 3 задание
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    // 4 задание
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }
    // 5 задание
    public static void printWordNTimes(int times) {
        for (times = 0; times < 3; times ++) {
            System.out.println("Да");
        }
    }
}
