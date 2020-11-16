package builder;

import model.Author;
import model.Book;

public class BookBuilder implements Builder {

    private String name;
    private int yearOfPublish;
    private String publishingHouse;

    private Author author;

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublish=yearOfPublishing;
    }

    @Override
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse=publishingHouse;
    }

    @Override
    public void setAuthor(Author author) {
        this.author=author;
    }

    public Book getResult(){
        return new Book(name,yearOfPublish,publishingHouse,author);
    }
}
