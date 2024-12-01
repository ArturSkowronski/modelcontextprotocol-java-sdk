
package modelcontextprotocol.java.sdk.shared.schema.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public record ServerCapabilities(
    
    @JsonProperty("experimental") Map<String, Object> experimental,
    
    @JsonProperty("logging") Map<String, Object> logging,
    
    @JsonProperty("prompts") Map<String, Object> prompts,
    
    @JsonProperty("resources") Map<String, Object> resources,
    
    @JsonProperty("tools") Map<String, Object> tools
    
) {}