package Homework1;

public class Homework1 {
    public static void main(String[] args) {
        greetings();
        checkSign();
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(2,4, false);
    }
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    public static void checkSign() {
        int a = 21;
        int b = 32;
        int c = 47;
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor() {
        int data = 48;
        if (data < 10) {
            System.out.println("Красный");
        }
        if (data >= 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 12;
        int b = 8;
        if (a>=b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {

        if (increment == true) {
            int result = initValue + delta;
            System.out.println(result);
        } else {
            int result = initValue - delta;
            System.out.println(result);
        }
    }

}

