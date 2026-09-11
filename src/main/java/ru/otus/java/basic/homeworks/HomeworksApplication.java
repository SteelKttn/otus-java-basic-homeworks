package ru.otus.java.basic.homeworks;

public class HomeworksApplication {


    public static void main(String[] args) {
    Animal[] animals = {
            new Horse("Мустанг", 10, 100),
            new Dog("Шарик", 6, 60),
            new Cat("Барсик", 5, 50)
    };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(10);
            animals[i].swim(10);
            animals[1].info();


        }
    }
    }







