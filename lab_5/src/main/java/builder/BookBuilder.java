package builder;

import model.Author;
import model.Book;

public class BookBuilder implements Builder {
    private int id;
    private String name;
    private int yearOfPublish;
    private String publishingHouse;

    private Author author;
    private int author_id;
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

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setAuthorId(int author_id) {
        this.author_id = author_id;
    }

    public Book getResult(){
        return new Book(id,name,yearOfPublish,publishingHouse,author,author_id);
    }
}
