package director;
import builder.Builder;
import model.Author;
import model.Book;

import java.time.LocalDate;


public class Director {
    public void constructBook1(Builder builder){
        builder.setId(1);
        builder.setName("Syntagmatic cult");
        builder.setYearOfPublishing(2020);
        builder.setPublishingHouse("21th Century");
        builder.setAuthor(new Author(1,"Andrij","Petrenko","Oleksandrovych", LocalDate.of(1990,05,12)));
        builder.setAuthorId(1);
    }

    public void constructBook2(Builder builder){
        builder.setId(2);
        builder.setName("Transparent judge");
        builder.setYearOfPublishing(2000);
        builder.setPublishingHouse("21th Century");
        builder.setAuthor(new Author(2,"Oleksandr","Nagorov","Petrovych", LocalDate.of(1975,10,28)));
        builder.setAuthorId(2);
    }

}
