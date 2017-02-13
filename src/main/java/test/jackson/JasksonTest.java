package test.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.Quote;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by sjchen on 2/13/17.
 */
public class JasksonTest {
    public static void main(String[] args) throws IOException {
        //get JSON formate data from file and map it into POJO
        byte[] jsonData = Files.readAllBytes(Paths.get("src/QuoteJsonDate.txt"));
        ObjectMapper objectMapper = new ObjectMapper();
        Quote quote = objectMapper.readValue(jsonData, Quote.class);
        System.out.println(quote);
    }
}
