package model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
public class Author {

    private int id;
    private String name;

    private String secondName;

    private String surname;

    private LocalDate dateOfBirth;



    public Author(int id,String name,String secondName,String surname,LocalDate dateOfBirth){
        this.id=id;
        this.name=name;
        this.secondName=secondName;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;

    }

    public Author(String name,String secondName){
        this.name=name;
        this.secondName=secondName;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public int getId() {
        return id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
