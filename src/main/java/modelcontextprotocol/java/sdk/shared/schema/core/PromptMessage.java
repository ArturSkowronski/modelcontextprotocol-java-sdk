package modelcontextprotocol.java.sdk.shared.schema.core;
import java.util.Map;
public record PromptMessage(
    
    Map<String, Object> content,
    Map<String, Object> role
) {}