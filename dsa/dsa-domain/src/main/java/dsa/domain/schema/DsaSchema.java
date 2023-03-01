package dsa.domain.schema;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.victools.jsonschema.generator.*;
import java.lang.reflect.Type;
import java.util.*;

/**
 *
 * @author hakan
 */
public class DsaSchema {

    private static final List IGNORE = List.of("customers", "suppliers");

    public static JsonNode generateSchema(Type type) {
        return new SchemaGenerator(config()).generateSchema(type);
    }

    private static SchemaGeneratorConfig config() {
        SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_2020_12, OptionPreset.PLAIN_JSON);
        configBuilder.forFields()
                .withRequiredCheck(field -> Optional.ofNullable(field.getAnnotationConsideringFieldAndGetter(JsonProperty.class)).map(JsonProperty::required).orElse(false));
        configBuilder.forFields()
                .withStringPatternResolver(field -> Optional.ofNullable(field.getAnnotationConsideringFieldAndGetter(JsonFormat.class))
                .map(JsonFormat::pattern).orElse(null));
        configBuilder.forFields().withIgnoreCheck(field -> IGNORE.contains(field.getName()));
        configBuilder.with(Option.ADDITIONAL_FIXED_TYPES, Option.EXTRA_OPEN_API_FORMAT_VALUES);
        return configBuilder.build();
    }
}
