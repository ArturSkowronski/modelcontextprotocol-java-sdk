
package modelcontextprotocol.java.sdk.shared.schema.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public record TextResourceContents(
    
    @JsonProperty("mimeType") String mimeType,
    
    @JsonProperty("text") String text,
    
    @JsonProperty("uri") String uri
    
) {}