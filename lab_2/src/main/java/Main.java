import com.fasterxml.jackson.core.JsonProcessingException;
import model.Book;
import serialize.JsonSerializer;
import serialize.Serializer;
import serialize.TxtSerializer;
import serialize.XmlSerializer;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Programming Theory");
        book.setYearOfPublish(2011);
        Serializer<Book> ser = new JsonSerializer<>(Book.class);
        System.out.println(ser.toString(book));

        ser = new XmlSerializer<>(Book.class);
        System.out.println(ser.toString(book));

        ser = new TxtSerializer(Book.class);
        System.out.println(ser.fromString("Name Programming Theory || YearOfPublish 2011."));
    }
}