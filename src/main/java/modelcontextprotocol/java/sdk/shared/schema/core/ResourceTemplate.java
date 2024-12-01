
package modelcontextprotocol.java.sdk.shared.schema.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public record ResourceTemplate(
    
    @JsonProperty("annotations") Map<String, Object> annotations,
    
    @JsonProperty("description") String description,
    
    @JsonProperty("mimeType") String mimeType,
    
    @JsonProperty("name") String name,
    
    @JsonProperty("uriTemplate") String uriTemplate
    
) {}