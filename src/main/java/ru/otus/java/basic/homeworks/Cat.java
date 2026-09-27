package ru.otus.java.basic.homeworks;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness = false;

    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }

    public boolean getFullness() {
        return fullness;
    }
    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat (Plate plate) {
        if (plate.decreaseFood(appetite)) {
            fullness = true;
            System.out.println(name + " сыт");

        }
    }
}

