package ru.otus.java.basic.homeworks.homework3;

public class homework3 {
    static void main(String[] args) {
        int[][] arr = {{0, 3, 0, 3},
                {5, 0, 5, 0}};
        sumOfPositiveElements(arr);
        printSquare(3);
        int[][] num = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        diagonalZero(num);
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        findMax(array);
        int[][] line = {{1, 2, 3}, {4, 5, 6}};
        findSum2Line(line);
        System.out.println(findSum2Line(line));


    }

    public static void sumOfPositiveElements(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }


            }

        }

        System.out.println(sum);
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");

            }
            System.out.println();

        }


    }

    public static void diagonalZero(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (i == j) {
                    num[i][j] = 0;

                }
                if (i + j == 2) {
                    num[i][j] = 0;
                }
                System.out.print(num[i][j]);

            }
            System.out.println();
        }
    }

    public static void findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];

                }

            }

        }
        System.out.println(max);
    }

    public static int findSum2Line(int line[][]) {
            if (line.length < 2) {
                return -1;
            }
            int sumL2 = 0;
            for (int j = 0; j < line[1].length; j++) {
                sumL2 += line[1][j];
            }
            return sumL2;

        }


    }





    



