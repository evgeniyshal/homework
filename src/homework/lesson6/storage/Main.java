package homework.lesson6.storage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Илья", "Ильф");
        Author author2 = new Author("Евгений","Петров");
        Author author3 = new Author("Якоб", "Гримм");
        Author author4 = new Author("Вильгельм", "Гримм");
        Author author5 = new Author("Аркадий", "Стругацкий");
        Author author6 = new Author("Борис", "Стругайцкий");

        Book picnic = new Book("Пикник на обочине", 600, 1990, author5, author6);
        Book chairs12 = new Book("Двенадцать стульев", 353,1910, author1, author2);
        Book tales = new Book("Сказки братьев Гримм", 700, 1800, author3, author4);

        Storage storage = new Storage(20);

        storage.addBook(picnic);
        storage.addBook(chairs12);
        storage.addBook(tales);

        System.out.println(Arrays.toString(storage.getBooks()));

        /*Хранилище: книги, номер хранилища;

        Книга: название, авторы, количество страниц, год издания (int);
        Автор: имя, фамилия.
        Книга может быть написана несколькоми авторами.

        Каждое хранилище расчитано на 20 книг (максимум). массив
        Необходимо реализовать возможность добавления книг в хранилище по одной.
        В одно хранилище не может быть добавлено несколько книг с одинаковым названием.*/
    }
}
