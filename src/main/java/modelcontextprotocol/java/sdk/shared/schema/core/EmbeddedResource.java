
package modelcontextprotocol.java.sdk.shared.schema.core;

import java.util.Map;

public record EmbeddedResource(
    Map<String, Object> annotations,
    Map<String, Object> resource,
    String type
) {}