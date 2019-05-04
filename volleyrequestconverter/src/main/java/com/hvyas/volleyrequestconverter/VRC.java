package com.hvyas.volleyrequestconverter;

import java.util.HashMap;
import java.util.Map;

public class VRC {
    private String url = "";
    private Map<String, String> payload = new HashMap<>();

    public VRC(String url, Map<String, String> payload) {
        this.url = url;
        this.payload.putAll(payload);
    }

    public String getRequestedUrl() {
        String new_url = url + "?";
        for (int i = 0; i < payload.size(); i++) {
            String key = (payload.keySet().toArray())[i].toString();
            new_url = new_url + key + "=" + payload.get(key) + "&";
        }
        new_url = new_url.substring(0, new_url.length() - 1);
        return new_url;
    }


    public String getParams(String key) {
        String value = payload.get(key);
        if (value == null) {
            return "Key not exist";
        } else {
            return value;
        }
    }
}
