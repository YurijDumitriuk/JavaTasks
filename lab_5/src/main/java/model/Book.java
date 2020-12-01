package model;


import java.util.Objects;


public class Book {

    private int id;
    private String name;
    private Integer yearOfPublish;
    private String publishingHouse;
    private Author author;
    private int author_id;


    public Book(int id,String name, int yearOfPublish,String publishingHouse,Author author,int author_id){
        this.id=id;
        this.name=name;
        this.yearOfPublish=yearOfPublish;
        this.publishingHouse=publishingHouse;
        this.author=author;
        this.author_id=author_id;
    }
    public Book()
    {

    }

    public Book(String name)
    {
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", author=" + author +
                ", author_id=" + author_id +
                '}';
    }
}
