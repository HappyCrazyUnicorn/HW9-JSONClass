package ru.netology.domain;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "1111 № 111111";
        post.patronymic = "Иванович";
        post.phone = "+7 999 1234567";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 11;
        post.birthday.month = 11;
        post.birthday.year = 2000;

        // заполните другие поля
    }

}
