
package modelcontextprotocol.java.sdk.shared.schema.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public record ClientCapabilities(
    
    @JsonProperty("experimental") Map<String, Object> experimental,
    
    @JsonProperty("roots") Map<String, Object> roots,
    
    @JsonProperty("sampling") Map<String, Object> sampling
    
) {}