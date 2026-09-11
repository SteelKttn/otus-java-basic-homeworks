package ru.otus.java.basic.homeworks;

public class User {
    private String name;
    private String patronymic;
    private String surname;
    private int yearOfBirth;
    private String email;

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
