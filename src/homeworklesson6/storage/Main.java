package homeworklesson6.storage;

import com.sun.source.doctree.AuthorTree;

public class Main {
    public static void main(String[] args) {
        Book tales = new Book();
        Book chairs12 = new Book();
        Book picnic = new Book();


        Author author1 = new Author("Илья", "Ильф");
        Author author2 = new Author("Евгений","Петров");
        Author author3 = new Author("Якоб", "Гримм");
        Author author4 = new Author("Вильгельм", "Гримм");
        Author author5 = new Author("Аркадий", "Стругацкий");
        Author author6 = new Author("Борис", "Стругайцкий");


        /*Хранилище: книги, номер хранилища;

        Книга: название, авторы, количество страниц, год издания (int);
        Автор: имя, фамилия.
        Книга может быть написана несколькоми авторами.

        Каждое хранилище расчитано на 20 книг (максимум).
        Необходимо реализовать возможность добавления книг в хранилище по одной.
        В одно хранилище не может быть добавлено несколько книг с одинаковым названием.*/
    }
}
