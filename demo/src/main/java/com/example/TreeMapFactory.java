package com.example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapFactory implements MapFactory<String, String> {
    @Override
    public Map<String, String> createMap() {
        return new TreeMap<>();
    }
}


