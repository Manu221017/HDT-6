package com.example;

import java.util.Map;
import java.util.TreeMap;

/**
 * Implementación de la interfaz MapFactory para crear instancias de TreeMap.
 */

public class TreeMapFactory implements MapFactory<String, String> {
    @Override
    public Map<String, String> createMap() {
        return new TreeMap<>();
    }
}


