package model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;
import validator.*;

public class Book {
    @Size(min=5,max=100, message = "Book name must be between 5 and 100 characters")
    private String name;
    @BookYearOfPublishExisting
    private Integer yearOfPublish;
    @Pattern(regexp="^[a-zA-Z]{4,50}$",message = "The name of publishing house must be between 4 and 50 characters")
    private String publishingHouse;
    private Author author;


    public Book(String name, int yearOfPublish,String publishingHouse,Author author){
        this.name=name;
        this.yearOfPublish=yearOfPublish;
        this.publishingHouse=publishingHouse;
        this.author=author;
    }
    public Book()
    {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }


    public int getYearOfPublish() {
        return yearOfPublish;
    }


    public String getPublishingHouse() {
        return publishingHouse;
    }


    public Author getAuthor() {
        return author;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublish == book.yearOfPublish &&
                Objects.equals(name, book.name) &&
                Objects.equals(publishingHouse, book.publishingHouse) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfPublish, publishingHouse, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", author=" + author +
                '}';
    }
}
