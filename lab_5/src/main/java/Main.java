import builder.BookBuilder;
import director.Director;
import model.Author;
import model.Book;
import java.sql.SQLException;
import postgreSQL.*;
import model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String pause() {
        System.out.println("Press Any Key To Continue...");
        return new java.util.Scanner(System.in).nextLine();
    }



    public static void main(String[] args) throws SQLException {
        BookDatabase c = new BookDatabase();
        AuthorDatabase u = new AuthorDatabase();
        List<Book> Database_book = new ArrayList<>();
        try {
            c.createTableBook();



            Database_book = c.getAll();


        }
        catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        for (Book book: Database_book) {
            System.out.println(book);
        }



    }
}
