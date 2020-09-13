package Builder;

import Author.Author;

/**
 * Builder interface
 * Интерфейс Строителя declares all possible stages and configuration steps of product
 */
public interface Builder {
    void setName(String name);
    void setYearOfPublishing(int yearOfPublishing);
    void setPublishingHouse(String publishingHouse);
    void setAuthor(Author author);
}
