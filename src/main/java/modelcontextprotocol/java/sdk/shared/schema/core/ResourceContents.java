
package modelcontextprotocol.java.sdk.shared.schema.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public record ResourceContents(
    
    @JsonProperty("mimeType") String mimeType,
    
    @JsonProperty("uri") String uri
    
) {}