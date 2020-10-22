package author;

import java.time.LocalDate;

public class Author {
    private String name;
    private String secondName;
    private String surname;
    private LocalDate dateOfBirth;

    public Author(String name, String secondName, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
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
}
