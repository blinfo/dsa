package dsa.domain.schema;

import com.fasterxml.jackson.databind.JsonNode;
import dsa.domain.*;

/**
 *
 * @author hakan
 */
public class Main {

    public static void main(String[] args) {
        JsonNode jsonSchema = DsaSchema.generateSchema(Organisation.class);
        System.out.println(jsonSchema.toPrettyString());
    }
}
