package ru.otus.java.basic.homeworks;

public class Homework4 {
    static void main() {
        User user1 = new User("Rep", "Tilia", "Mortalcombatov", 1984, "ReptileRules@bonanza.com");
        user1.info();
        User[] users = {
                new User("A", "A", "A", 1980, "AAA"),
                new User("B", "B", "B", 1980, "BBB"),
                new User("C", "C", "C", 2000, "CCC"),
                new User("D", "D", "D", 2010, "DDD"),
                new User("E", "E", "E", 2020, "EEE"),
                new User("F", "F", "F", 2015, "FFF"),
                new User("J", "J", "J", 2016, "JJJ"),
                new User("H", "H", "H", 2017, "HHH"),
                new User("R", "R", "R", 2018, "RRR"),
                new User("G", "G", "G", 2019, "GGG"),
        };
        for (int i = 0; i < users.length; i++) {
            if (2026 - users[i].getYearOfBirth() > 40) {
                users[i].info();
            }

        }
        Box box1 = new Box(2, "Красный");
        box1.open();
        box1.put("Lalilulelo");
        box1.takeOut();
        box1.close();
        box1.put("MetalGear PeaceWalker");
    }
}
