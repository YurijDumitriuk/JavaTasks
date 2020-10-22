import author.Author;
import book.Book;
import bookComparator.BookNameComparator;
import bookComparator.BookYearOfPublishComparator;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Comparator<Book> pcomp = new BookNameComparator().thenComparing(new BookYearOfPublishComparator());
        TreeSet<Book> book = new TreeSet(pcomp);
        book.add(new Book("Tom's book", 2013, "ChipHouse",new Author("Tom","Harrison","Cukkemane", LocalDate.parse("1959-03-02"))));
        book.add(new Book("Ted's book",2012,"MediumHouse",new Author("Ted","Green","Chatterjee", LocalDate.parse("1959-09-09"))));
        book.add(new Book("Kevin's book",2012,"ExpensiveHouse",new Author("Kevin","Lachlan","Preece", LocalDate.parse("1965-11-06"))));
        book.add(new Book("Bill's book",2011, "RichHouse",new Author("Bill","Vern","Mackenzie", LocalDate.parse("1981-03-08"))));

        for(Book  p : book){

            System.out.println(p.getName() + " " + p.getYearOfPublish() + " " + p.getPublishingHouse() + " " + p.getAuthor());
        }
        System.out.println();
        TreeSet<Book> book2 = new TreeSet<Book>();
        book2.add(new Book("Tom's book", 2013, "ChipHouse",new Author("Tom","Harrison","Cukkemane", LocalDate.parse("1959-03-02"))));
        book2.add(new Book("Kevin's book",2012,"ExpensiveHouse",new Author("Kevin","Lachlan","Preece", LocalDate.parse("1965-11-06"))));
        book2.add(new Book("Bill's book",2011, "RichHouse",new Author("Bill","Vern","Mackenzie", LocalDate.parse("1981-03-08"))));

        for(Book  p : book2){

            System.out.println(p.getName() + " " + p.getYearOfPublish() + " " + p.getPublishingHouse() + " " + p.getAuthor());
        }

        System.out.println();
        for(Book  p : Book.findAllBooksByPublishingHouse(book)){

            System.out.println(p.getName() + " " + p.getYearOfPublish() + " " + p.getPublishingHouse() + " " + p.getAuthor());
        }
    }
}
