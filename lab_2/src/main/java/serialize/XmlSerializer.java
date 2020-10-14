package serialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


import java.io.File;
import java.io.IOException;

public class XmlSerializer<T> implements Serializer<T> {

    private static XmlMapper mapper;
    private Class<T> clazz;

    public XmlSerializer(Class<T> type) {
        this.clazz = type;
        mapper = new XmlMapper();

    }

    public Class<T> getClazz() {
        return clazz;
    }

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void toFile(T book, File file) {
    }

    @Override
    public T fromFile(File file) throws IOException {
        return null;
    }

    @Override
    public String toString(T book) {
        try {
            return mapper.writeValueAsString(book);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public T fromString(String string) {
        try {
            return mapper.readValue(string, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}

