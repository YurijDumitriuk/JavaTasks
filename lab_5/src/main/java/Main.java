import builder.BookBuilder;
import director.Director;
import model.Author;
import model.Book;
import java.sql.SQLException;
import postgreSQL.*;
import model.*;
import java.time.LocalDate;

public class Main {

    public static String pause() {
        System.out.println("Press Any Key To Continue...");
        return new java.util.Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
        try {
            QuerryTool.dropAuthor();
            QuerryTool.dropBook();

            pause();

            QuerryTool.createAuthor();
            QuerryTool.createBook();

        }
        catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }


    }
}
