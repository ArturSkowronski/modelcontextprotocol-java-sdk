
package modelcontextprotocol.java.sdk.shared.schema.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ModelPreferences(
    @JsonProperty("costPriority") Double costPriority,
    @JsonProperty("hints") List<Object> hints,
    @JsonProperty("intelligencePriority") Double intelligencePriority,
    @JsonProperty("speedPriority") Double speedPriority
) {}