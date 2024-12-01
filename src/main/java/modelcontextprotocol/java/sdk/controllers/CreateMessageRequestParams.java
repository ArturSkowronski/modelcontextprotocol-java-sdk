
package modelcontextprotocol.java.sdk.controllers;

// Auto-generated class
import java.util.List;
import java.util.Map;

public record CreateMessageRequestParams(
        String includeContext,
        int maxTokens,
        List<Object> messages,
        CreateMessageRequestParamsMetadata metadata,
        Object modelPreferences,
        List<Object> stopSequences,
        String systemPrompt,
        Object temperature
) {}

