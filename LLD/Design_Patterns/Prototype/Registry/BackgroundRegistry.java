package org.sahil.LLD.Design_Patterns.Prototype.Registry;

import org.sahil.LLD.Design_Patterns.Prototype.BackgroundObject;
import org.sahil.LLD.Design_Patterns.Prototype.BackgroundObjectType;

import java.util.HashMap;
import java.util.Map;

public class BackgroundRegistry {
    private Map<BackgroundObjectType, BackgroundObject> registry = new HashMap<>();

    public void store(BackgroundObjectType type, BackgroundObject backgroundObject){
        registry.putIfAbsent(type,backgroundObject);
    }

    public BackgroundObject get(BackgroundObjectType type){
        return registry.getOrDefault(type,null);
    }

}
