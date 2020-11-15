package director;

import builder.Builder;
import model.Author;

import java.time.LocalDate;

public class Director {
    public void constructBook1(Builder builder){
        builder.setName("Syntagmatic cult");
        builder.setYearOfPublishing(2020);
        builder.setPublishingHouse("21th Century");
        builder.setAuthor(new Author("Andrij","Petrenko","Oleksandrovych", LocalDate.of(1990,05,12)));
    }

    public void constructBook2(Builder builder){
        builder.setName("Transparent judge");
        builder.setYearOfPublishing(2000);
        builder.setPublishingHouse("21th Century");
        builder.setAuthor(new Author("Oleksandr","Nagorov","Petrovych", LocalDate.of(1975,10,28)));
    }

}
