package modelcontextprotocol.java.sdk.shared.schema.core;

import java.util.Map;

public record SamplingMessage(
    Map<String, Object> content,
    Map<String, Object> role
) {}