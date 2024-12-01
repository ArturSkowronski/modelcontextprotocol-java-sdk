package modelcontextprotocol.java.sdk.shared.schema.core;

import java.util.Map;

public record Tool(
    String description,
    Map<String, Object> inputSchema,
    String name
) {}