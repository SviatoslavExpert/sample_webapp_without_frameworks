package com.akhambir.util;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private final String method;
    private final String url;
    private final Map<String, String> parameters = new HashMap<String, String>();

    public Request(String method, String url) {
        this.method = method;
        this.url = url;
    }

    public static Request of(String method, String url) {
        return new Request(method, url);
    }
}
