package postgreSQL;

import java.sql.*;
import exceptions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.*;
public class AuthorDatabase {
    private Connector connection;

    public AuthorDatabase() throws SQLException {
        connection = new Connector();
        //DataBasePoolConnection dbc = new DataBasePoolConnection();
        //connection = dbc.setUp();
    }

    private static final String CREATE_TABLE = "create table if not exists authors " +
            "(id serial, " +
            "name varchar(100) , " + "secondName varchar(100), " +
            "surname varchar(20), " + "dateOfBirth DATE)";
    private static final String DROP = "DROP TABLE IF EXISTS %s";

    private static final String CREATE_AUTHOR = "insert into authors (name,secondName , surname, dateOfBirth) values (?, ?, ?, ?)";
    private static final String ALL_AUTHORS = "select * from authors";

    private static final String EDIT_AUTHOR = "update authors set name = ?, secondName = ?, surname = ?, dateOfBirth = ? where id = ?;";
    private static final String GET_AUTHOR_BY_ID = "select * from authors where id = ?";

    private static final String GET_AUTHOR_BY_NAME_SURNAME = "select * from authors where name = ?, surname = ?";


    public boolean createTableAuthor() throws SQLException {
        try (Connection conn = connection.Connect()) {
            Statement statement = conn.createStatement();
            return statement.execute(CREATE_TABLE);
        }
    }

    public int addUser(Author user) throws SQLException {
        try (Connection conn = connection.Connect()){
            PreparedStatement preparedStatement = conn.prepareStatement(CREATE_AUTHOR);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSecondName());
            preparedStatement.setString(3, user.getSurname());
            preparedStatement.setDate(4, Date.valueOf(user.getDateOfBirth()));
            return preparedStatement.executeUpdate();
        }
    }

    public int editUser(Author user, int id) throws SQLException {
        try (Connection conn = connection.Connect()) {
            PreparedStatement preparedStatement = conn.prepareStatement(EDIT_AUTHOR);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSecondName());
            preparedStatement.setString(3, user.getSurname());
            preparedStatement.setDate(4, Date.valueOf(user.getDateOfBirth()));
            return preparedStatement.executeUpdate();
        }
    }


    public Author getById(int id) throws SQLException, AuthorNotFoundException {
        try (Connection conn = connection.Connect()) {
            PreparedStatement statement = conn.prepareStatement(GET_AUTHOR_BY_ID);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            Author u = null;
            while (rs.next()) {
                u = new Author(rs.getString("name"), rs.getString("secondName"));
                u.setSurname(rs.getString("address"));
                u.setDateOfBirth(rs.getDate("dateOfBirth").toLocalDate());
                u.setId(rs.getInt("id"));
                return u;
            }
            throw new AuthorNotFoundException();
        }
    }

    public Author getByNameSurname(String name, String surname) throws SQLException, AuthorNotFoundException {
        try (Connection conn = connection.Connect()) {
            PreparedStatement statement = conn.prepareStatement(GET_AUTHOR_BY_NAME_SURNAME);
            statement.setString(1, name);
            statement.setString(2, surname);
            ResultSet rs = statement.executeQuery();
            Author u = null;
            while (rs.next()) {
                u = new Author(rs.getString("name"), rs.getString("secondName"));
                u.setSurname(rs.getString("address"));
                u.setDateOfBirth(rs.getDate("dateOfBirth").toLocalDate());
                u.setId(rs.getInt("id"));
                return u;
            }
            throw new AuthorNotFoundException();
        }
    }






}
