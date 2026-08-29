package ru.otus.java.basic.homeworks.homework2;

import java.util.Arrays;

public class homework2 {

    static void main(String[] args) {
        typeString(3, "Получилось");
        findGreaterThanFiveAndTypeSum(new int[]{1, 6, 6, 2, 3});
        int[] arr2 = new int[6];
        fillArrayWithNumber(arr2, 5);
        int[] arr3 = {14, 5, 5, 3};
        increase(7, arr3);
        int[] arr4 = {14, 5, 20, 3};
        findBiggerSumm(arr4);

    }


    public static void typeString(int count, String text) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void findGreaterThanFiveAndTypeSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArrayWithNumber(int[] arr2, int number) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = number;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void increase(int a, int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] += a;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void findBiggerSumm(int[] arr4) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr4.length / 2; i++) {
                leftSum += arr4[i];

        }
        for (int j = arr4.length / 2; j < arr4.length; j++) {
                rightSum += arr4[j];

        }
        if (leftSum > rightSum) {
            System.out.println(leftSum + " Левая половина больше");
        }
        if (rightSum > leftSum) {
            System.out.println(rightSum + " Правая половина больше");
        }
    }
}




