
package modelcontextprotocol.java.sdk.shared.schema.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public record BlobResourceContents(
    
    @JsonProperty("blob") String blob,
    
    @JsonProperty("mimeType") String mimeType,
    
    @JsonProperty("uri") String uri
    
) {}