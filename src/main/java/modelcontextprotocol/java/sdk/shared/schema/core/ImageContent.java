
package modelcontextprotocol.java.sdk.shared.schema.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public record ImageContent(
    
    @JsonProperty("annotations") Map<String, Object> annotations,
    
    @JsonProperty("data") String data,
    
    @JsonProperty("mimeType") String mimeType,
    
    @JsonProperty("type") String type
    
) {}