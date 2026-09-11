package ru.otus.java.basic.homeworks;

public class Cat extends Animal{
    @Override
    public int swim(int distance) {
        System.out.println("Кот не умеет плавать");
        return -1;
    }
    public Cat(String name, int speed, int endurance) {
        super(name, speed, endurance, 0);
    }
}
