package serialize;

import model.Book;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TxtSerializer implements Serializer<Book> {
    private static final String PATTERN_FOR_BOOK = "(Name )([^|]*)(\\|\\| YearOfPublish )([^.]*)(\\.)";
    private Class<Book> clazz;

    public TxtSerializer(Class<Book> type) {
        this.clazz = type;
    }

    public Class<Book> getClazz() {
        return clazz;
    }

    public void setClazz(Class<Book> clazz) {
        this.clazz = Book.class;
    }

    @Override
    public void toFile(Book book, File file) {
    }

    @Override
    public Book fromFile(File file) throws IOException {
        return null;
    }

    @Override
    public String toString(Book book) {
        return String.format("Name %s || YearOfPublish %s.", book.getName(), book.getYearOfPublish());
    }

    @Override
    public Book fromString(String string) {
        Pattern pattern = Pattern.compile(PATTERN_FOR_BOOK);
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            Book result = new Book(matcher.group(2).substring(0, matcher.group(2).length() - 1));
            result.setYearOfPublish(Integer.valueOf(matcher.group(4)));
            return result;
        }

        throw new RuntimeException(string + "is not applicable for create Book");
    }
}
