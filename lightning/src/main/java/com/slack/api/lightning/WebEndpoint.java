package com.slack.api.lightning;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Additional Web Endpoint Definition.
 */
@Data
@Builder
@AllArgsConstructor
public class WebEndpoint {
    private Method method;
    private String path;

    public enum Method {
        GET, POST
    }
}
