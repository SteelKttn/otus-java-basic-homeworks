package ru.otus.java.basic.homeworks;

public class Homework6 {
    static void main() {
        Plate tarelka = new Plate(10);
        Cat[] cats = {
                new Cat("Barsik", 2),
                new Cat("Denchik", 3),
                new Cat("Bobby", 4)


        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(tarelka);
        }
        tarelka.info();
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " " + cats[i].getFullness());

        }

    }
}
