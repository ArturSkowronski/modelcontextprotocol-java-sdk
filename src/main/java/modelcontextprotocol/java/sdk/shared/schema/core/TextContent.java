
package modelcontextprotocol.java.sdk.shared.schema.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public record TextContent(
    
    @JsonProperty("annotations") Map<String, Object> annotations,
    
    @JsonProperty("text") String text,
    
    @JsonProperty("type") String type
    
) {}