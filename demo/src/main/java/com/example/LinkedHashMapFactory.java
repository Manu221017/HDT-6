package com.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapFactory implements MapFactory<String, String> {
    @Override
    public Map<String, String> createMap() {
        return new LinkedHashMap<>();
    }
}
