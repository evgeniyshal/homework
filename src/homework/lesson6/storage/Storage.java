package homework.lesson6.storage;

import java.util.UUID;

public class Storage {
    private UUID uuidStorage;
    private Book[] books;

    public Storage(int size) {
        books = new Book[size];
        uuidStorage = UUID.randomUUID();
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Книга не может быть null");
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
        throw new IndexOutOfBoundsException("В хранилище нет места");
    }

    public Book[] getBooks() {
        return books;
    }

}