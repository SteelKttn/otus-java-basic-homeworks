package ru.otus.java.basic.homeworks;

public class HomeworksApplication {


    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik", 1, 10),
                new Dog("Muhtar", 2, 2, 10),
                new Horse("B", 5, 2, 10)
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(9);
            animals[i].swim(10);
            animals[i].info();


        }
    }
}







