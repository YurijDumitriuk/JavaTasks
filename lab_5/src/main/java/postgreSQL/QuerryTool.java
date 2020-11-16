package postgreSQL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;

import model.*;
public class QuerryTool {
    private static final String create = "CREATE TABLE IF NOT EXISTS %s(id serial, %s, PRIMARY KEY(id));";
    private static final String drop = "DROP TABLE IF EXISTS %s";

    private static final String book = "book";
    private static final String author = "author";

    private static final String author_create_attribute = "name varchar(20), secondName varchar(20),surname varchar(20), dateOfBirth int4";
    private static final String book_create_attribute = author_create_attribute + ", bookName varchar(20),yearOfPublish int4, publishingHouse varchar(20)";

    private static void Execute(String query) throws SQLException {
        Connection connection = Connector.Connect();
        if (connection != null) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            Connector.Disconnect(connection);
        }
    }

    public static void createAuthor() throws SQLException {
        Execute(String.format(create , author, author_create_attribute));
    }
    public static void createBook() throws SQLException {
        Execute(String.format(create, book, book_create_attribute));
    }


    public static void dropAuthor() throws SQLException {
        Execute(String.format(drop, author));
    }
    public static void dropBook() throws SQLException {
        Execute(String.format(drop, book));
    }
}
