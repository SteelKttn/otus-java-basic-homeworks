package ru.otus.java.basic.homeworks;

public class Box {
    private int size;
    private String color;
    private boolean isOpen = false;
    private String item = null;

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public Box(int size, String color) {
        this.color = color;
        this.size = size;
    }

    public void open() {
        isOpen = true;
        System.out.println("коробка открыта");
    }


    public void close() {
        isOpen = false;
        System.out.println("коробка закрыта");
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void infoBox() {
        System.out.println("Размер: " + size + " " + "Цвет: " + color);
    }

    public void put(String newItem) {
        if (!isOpen) {
            System.out.println("Коробка закрыта, откройте её");
            return;
        }
        if (item != null) {
            System.out.println("В коробке уже есть предмет");
            return;
        }

        item = newItem;
        System.out.println("Предмет был помещен");


    }

    public void takeOut() {
        if (!isOpen) {
            System.out.println("Коробка закрыта, откройте её");
            return;
        }
        if (item == null) {
            System.out.println("Предмета нет в коробке");
            return;
        }

        System.out.println("Вы выложили предмет");
        item = null;


    }
}