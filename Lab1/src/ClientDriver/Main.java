package ClientDriver;


import Book.Book;
import Builder.BookBuilder;
import Director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        BookBuilder builder = new BookBuilder();
        director.constructBook1(builder);
        Book book1 = builder.getResult();
        System.out.println("Book built:\n" + book1.getName());

        director.constructBook2(builder);
        Book book2 = builder.getResult();
        System.out.println("Book built:\n" + book2.getName());

        director.constructBook2(builder);
        Book book3 = builder.getResult();
        System.out.println("Book built:\n" + book3.getName());

        System.out.println(book2.equals(book3));
        System.out.println(book1.equals(book3));

        System.out.println(book2.toString());

    }
}
