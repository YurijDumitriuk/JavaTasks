package Book;

import Author.Author;

import java.util.Objects;


/**
 * Class Book represent object book with paremeters: name,yearOfPublish, publishingHouse, and author
 * In class realized methods: constructor,get to all fields,equals,hashCode,toString
 */
public class Book {

    private String name;
    private int yearOfPublish;
    private String publishingHouse;
    private Author author;


    public Book(String name, int yearOfPublish,String publishingHouse,Author author){
        this.name=name;
        this.yearOfPublish=yearOfPublish;
        this.publishingHouse=publishingHouse;
        this.author=author;
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
