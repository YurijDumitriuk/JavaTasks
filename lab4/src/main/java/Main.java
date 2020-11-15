import builder.BookBuilder;
import director.Director;
import model.Author;
import model.Book;
import org.jboss.logging.Logger;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.time.LocalDate;
import java.util.Set;

public class Main {

        public static void main(String[] args) {
            Director director = new Director();

            BookBuilder builder = new BookBuilder();
            director.constructBook1(builder);
            Book book1 = builder.getResult();
            System.out.println("Book built:\n" + book1.getName());

            director.constructBook2(builder);
            Book book2 = builder.getResult();
            System.out.println("Book built:\n" + book2.getName());

            director.constructBook2(builder);
            Book book3 = builder.getResult();
            System.out.println("Book built:\n" + book3.getName());

            System.out.println(book2.equals(book3));
            System.out.println(book1.equals(book3));

            System.out.println(book2.toString());

            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            Validator validator = factory.getValidator();
            Book book4 = new Book();
            book4.setYearOfPublish(2019);
            book4.setPublishingHouse("kap");
            book4.setAuthor(new Author("Andrij","Petrenko","Oleksandrovych", LocalDate.of(1990,05,12)));
            Set<ConstraintViolation<Book>> violations = validator.validate(book4);
            Logger log = Logger.getLogger(Book.class);
            for (ConstraintViolation<Book> violation : violations) {
                log.error(violation.getMessage());
            }


        }
    }
