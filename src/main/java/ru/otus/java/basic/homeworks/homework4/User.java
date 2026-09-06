package ru.otus.java.basic.homeworks.homework4;

public class User {
    public String name;
    public String patronymic;
    public String surname;
    public int yearOfBirth;
    public String email;

    public User(String surname, String name, String patronymic, int yearOfBirth, String email) {
        this.patronymic = patronymic;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }


        public void info() {
            System.out.println("ФИО: " + surname + " " + name + " " + patronymic + "\n" + "Год рождения: " + yearOfBirth + "\n" + "e-mail: " + email);



        }

    }

