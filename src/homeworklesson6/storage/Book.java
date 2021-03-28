package homeworklesson6.storage;

public class Book {
    private String title;
    private Author author;
    private int page;
    private int publishingYear;


    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        if (author == null) {
            throw new IllegalArgumentException("Это не имя автора");
        }
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("Это не название Книги");
        }
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if(page <= 0 ) {
            throw new IllegalArgumentException("Неверный номер страницы");
        }
        this.page = page;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear <= 0){
            throw new IllegalArgumentException("Неверный год публикации");
        }
        this.publishingYear = publishingYear;
    }





}

