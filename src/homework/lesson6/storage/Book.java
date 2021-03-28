package homework.lesson6.storage;

import java.util.Arrays;

public class Book {
    private String title;
    private Author[] authors;
    private int pages;
    private int publishingYear;

    public Book(String title, int pages, int publishingYear, Author... authors) {
        setTitle(title);
        setPages(pages);
        setPublishingYear(publishingYear);
        setAuthors(authors);
    }

    private void setAuthors(Author[] authors) {
        if (title == null) {
            throw new IllegalArgumentException("Это не автор");
        }
        this.authors = authors;
    }

    private void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("Это не название Книги");
        }
        this.title = title;
    }

    private void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Неверный номер страницы книги");
        }
        this.pages = pages;
    }

    private void setPublishingYear(int publishingYear) {
        if (publishingYear <= 0){
            throw new IllegalArgumentException("Неверный год публикации книги");
        }
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", pages=" + pages +
                ", publishingYear=" + publishingYear +
                '}';
    }
}