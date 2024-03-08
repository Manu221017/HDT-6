package com.example;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implementación de la interfaz MapFactory para crear instancias de LinkedHashMap.
 */

public class LinkedHashMapFactory implements MapFactory<String, String> {
    @Override
    public Map<String, String> createMap() {
        return new LinkedHashMap<>();
    }
}
