package modelcontextprotocol.java.sdk.shared.schema.core;

import java.util.List;

public record Prompt(
    List<Object> arguments,
    String description,
    String name
) {}