package model;

import java.time.LocalDate;
import java.util.Objects;
public class Author {

    private String name;

    private String secondName;

    private String surname;

    private LocalDate dateOfBirth;


    public Author(String name,String secondName,String surname,LocalDate dateOfBirth){
        this.name=name;
        this.secondName=secondName;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
    }


    public String getName() {
        return name;
    }


    public String getSecondName() {
        return secondName;
    }


    public String getSurname() {
        return surname;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(secondName, author.secondName) &&
                Objects.equals(surname, author.surname) &&
                Objects.equals(dateOfBirth, author.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName, surname, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
