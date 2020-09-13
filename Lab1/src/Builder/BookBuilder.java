package Builder;

import Author.Author;
import Book.Book;

/**
 * Concrete builder which realize methods declared in interface
 */
public class BookBuilder implements Builder {
    //required
    private String name;
    private int yearOfPublish;
    private String publishingHouse;
    //optional
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
