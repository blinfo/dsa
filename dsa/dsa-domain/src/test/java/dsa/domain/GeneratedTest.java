package dsa.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author hakan
 */
public class GeneratedTest {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Test
    public void test_deserialize() {
        try {
            Generated gen = MAPPER.readValue(getTestData(), Generated.class);
            assertEquals("Håkan Lidén", gen.getBy());
            assertEquals("2022-09-05T11:47:44.855221183+02:00", gen.getTimestamp().toString());
        } catch (JsonProcessingException ex) {
            fail("Could not deserialize", ex);
        }
        
    }

    private String getTestData() {
        return "{\"timestamp\": \"2022-09-05T11:47:44.855221183+02:00\",\"by\": \"Håkan Lidén\"}";
    }
}
