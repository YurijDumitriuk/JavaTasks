package bookComparator;

import book.Book;

import java.util.Comparator;

public class BookYearOfPublishComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getYearOfPublish()> o2.getYearOfPublish())
            return 1;
        else if(o1.getYearOfPublish()< o2.getYearOfPublish())
            return -1;
        else
            return 0;
    }
}
