
package modelcontextprotocol.java.sdk.controllers;

// Auto-generated class
import java.util.Map;

public record ServerCapabilities(
        ServerCapabilitiesExperimental experimental,
        ServerCapabilitiesLogging logging,
        ServerCapabilitiesPrompts prompts,
        ServerCapabilitiesResources resources,
        ServerCapabilitiesTools tools
) {}

