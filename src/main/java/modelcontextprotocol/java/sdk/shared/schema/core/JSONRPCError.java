
package modelcontextprotocol.java.sdk.shared.schema.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public record JSONRPCError(
    Map<String, Object> error,
    Map<String, Object> id,
    String jsonrpc
) {}