package modelcontextprotocol.java.sdk.shared.schema.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public record Resource(
    
    @JsonProperty("annotations") Map<String, Object> annotations,
    @JsonProperty("description") String description,
    @JsonProperty("mimeType") String mimeType,
    @JsonProperty("name") String name,
    @JsonProperty("uri") String uri
) {}