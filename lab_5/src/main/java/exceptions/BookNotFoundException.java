package exceptions;
public class BookNotFoundException extends Exception {
    public BookNotFoundException(){
        super("Such car doesn't exists");
    }

    public BookNotFoundException(String book){
        super("Book " + book + "doesn't exists");
    }
}
