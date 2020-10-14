package serialize;

import java.io.File;
import java.io.IOException;

    public interface Serializer<T> {

        void toFile(T book, File file) throws IOException;

        T fromFile(File file) throws IOException;

        String toString(T book);

        T fromString(String book);

    }

