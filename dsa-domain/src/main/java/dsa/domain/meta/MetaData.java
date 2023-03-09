package dsa.domain.meta;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 *
 * @author hl
 */
public class MetaData {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static String currentVersion() {
        try {
            return mapper.readValue(MetaData.class.getResourceAsStream("/metadata/meta.json"), Meta.class).version();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static record Meta(String version) {

    }
}
