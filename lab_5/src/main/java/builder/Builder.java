package builder;

import model.Author;

public interface Builder {
    void setName(String name);
    void setYearOfPublishing(int yearOfPublishing);
    void setPublishingHouse(String publishingHouse);
    void setAuthor(Author author);
}