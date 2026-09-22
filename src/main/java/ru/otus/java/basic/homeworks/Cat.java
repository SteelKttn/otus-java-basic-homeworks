package ru.otus.java.basic.homeworks;

public class Cat extends Animal {
    @Override
    public double swim(int distance) {
        System.out.println("Кот не умеет плавать");
        return -1;
    }

    public Cat(String name, int runSpeed, int endurance) {
        super(name, runSpeed, 0, endurance, 0);
    }
}
