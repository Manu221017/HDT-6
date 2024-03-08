package com.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapFactory implements MapFactory<String, String> {
    @Override
    public Map<String, String> createMap() {
        return new HashMap<>();
    }
}

