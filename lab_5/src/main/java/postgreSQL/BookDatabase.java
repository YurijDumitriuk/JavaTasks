package postgreSQL;
import java.sql.*;
import exceptions.*;
import java.util.ArrayList;
import java.util.List;
import model.*;



public class BookDatabase {
    private Connector connection;

    public BookDatabase() throws SQLException {
        connection = new Connector();
        //DataBasePoolConnection dbc = new DataBasePoolConnection();
        //connection = dbc.setUp();
    }
    private static final String CREATE_TABLE = "create table if not exists book " +
            "(id serial, " +
            "name varchar(100), " +
            "yearOfPublish int4," +
            "publishingHouse varchar(100), " +
            "author_id int4)";

    private static final String DROP = "DROP TABLE IF EXISTS %s";

    private static final String CREATE_BOOK = "insert into book (name, yearOfPublish, publishingHouse, author_id) values (?, ?, ?, ?)";
    private static final String ALL_BOOKS = "select * from book";

    private static final String EDIT_BOOK = "update book set name = ?, yearOfPublish = ?, publishingHouse = ?, author_id = ? where id = ?;";
    private static final String GET_BOOK_BY_ID = "select * from book where id = ?";

    private static final String GET_BOOK_BY_NAME = "select * from book where name = ?";
    private static final String GET_BOOK_BY_AUTHOR_ID = "select * from book where author_id = ?";

    public boolean createTableBook() throws SQLException {
        try (Connection conn = connection.Connect()) {
            Statement statement = conn.createStatement();
            return statement.execute(CREATE_TABLE);
        }
    }

    public int addBook(Book book) throws SQLException {
        try (Connection conn = connection.Connect()){
            PreparedStatement preparedStatement = conn.prepareStatement(CREATE_BOOK);
            preparedStatement.setString(1, book.getName());
            preparedStatement.setInt(2, book.getYearOfPublish());
            preparedStatement.setString(3, book.getPublishingHouse());
            preparedStatement.setInt(4, book.getAuthor_id());
            return preparedStatement.executeUpdate();
        }
    }

    public int editBook(Book book, int id) throws SQLException {
        try (Connection conn = connection.Connect()) {
            PreparedStatement preparedStatement = conn.prepareStatement(EDIT_BOOK);
            preparedStatement.setString(1, book.getName());
            preparedStatement.setInt(2, book.getYearOfPublish());
            preparedStatement.setString(3, book.getPublishingHouse());
            preparedStatement.setInt(4, book.getAuthor_id());
            preparedStatement.setInt(5, id);
            return preparedStatement.executeUpdate();
        }
    }


    public Book getById(int id) throws SQLException, BookNotFoundException {
        try (Connection conn = connection.Connect()) {
            PreparedStatement statement = conn.prepareStatement(GET_BOOK_BY_ID);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            Book c = null;
            while (rs.next()) {
                c = new Book(rs.getString("name"));
                c.setYearOfPublish(rs.getInt("yearOfPublish"));
                c.setPublishingHouse(rs.getString("publishingHouse"));
                c.setId(rs.getInt("id"));
                c.setAuthor_id(rs.getInt("author_id"));
                return c;
            }
            throw new BookNotFoundException();
        }
    }

    public Book getByName(String number) throws SQLException, BookNotFoundException {
        try (Connection conn = connection.Connect()) {
            PreparedStatement statement = conn.prepareStatement(GET_BOOK_BY_NAME);
            statement.setString(1, number);
            ResultSet rs = statement.executeQuery();
            Book c = null;
            while (rs.next()) {
                c = new Book(rs.getString("name"));
                c.setYearOfPublish(rs.getInt("yearOfPublish"));
                c.setPublishingHouse(rs.getString("publishingHouse"));
                c.setId(rs.getInt("id"));
                c.setAuthor_id(rs.getInt("author_id"));
                return c;
            }
            throw new BookNotFoundException();
        }
    }

    public List<Book> getByAuthorId(int author_id) throws SQLException {
        try (Connection conn = connection.Connect()) {
            PreparedStatement statement = conn.prepareStatement(GET_BOOK_BY_AUTHOR_ID);
            statement.setInt(1, author_id);
            ResultSet rs = statement.executeQuery();
            List<Book> books = new ArrayList<>();
            while (rs.next()) {
                Book book = new Book(rs.getString("name"));
                book.setYearOfPublish(rs.getInt("yearOfPublish"));
                book.setPublishingHouse(rs.getString("publishingHouse"));
                book.setId(rs.getInt("id"));
                book.setAuthor_id(rs.getInt("author_id"));
                books.add(book);
            }
            return books;
        }
    }

    public List<Book> getAll() throws SQLException {
        try (Connection conn = connection.Connect()) {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(ALL_BOOKS);
            List<Book> books = new ArrayList<>();
            while (rs.next()) {
                Book book = new Book(rs.getString("name"));
                book.setYearOfPublish(rs.getInt("yearOfPublish"));
                book.setPublishingHouse(rs.getString("publishingHouse"));
                book.setId(rs.getInt("id"));
                book.setAuthor_id(rs.getInt("author_id"));
                books.add(book);
            }
            return books;
        }
    }



}
