package exceptions;

public class AuthorNotFoundException extends Exception {
    public AuthorNotFoundException(){
        super("Such user doesn't exists");
    }

    public AuthorNotFoundException(String author){
        super("Author " + author + "doesn't exists");
    }
}
