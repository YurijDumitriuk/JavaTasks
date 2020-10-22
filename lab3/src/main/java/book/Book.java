package book;

import author.Author ;

import java.util.TreeSet;

public class Book implements Comparable<Book> {
    private String name;
    private int yearOfPublish;
    private String publishingHouse;
    private Author author;

    public Book(String name, int yearOfPublish, String publishingHouse, Author author) {
        this.name = name;
        this.yearOfPublish = yearOfPublish;
        this.publishingHouse = publishingHouse;
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

    public String getAuthor() {
        return author.getName() + " " + author.getSecondName() + " " + author.getSurname() + " " + author.getDateOfBirth();
    }


    @Override
    public int compareTo(Book o) {
        return name.length()-o.getName().length();
    }

    public static TreeSet<Book> findAllBooksByPublishingHouse(TreeSet<Book> books) {

        String customPublishHouse="ChipHouse";
        TreeSet<Book> books2 = new TreeSet<>();
        for(Book  p : books){
            if (p.getPublishingHouse()==customPublishHouse){
                books2.add(p);
            }
        }
        return books2;
    }
}
