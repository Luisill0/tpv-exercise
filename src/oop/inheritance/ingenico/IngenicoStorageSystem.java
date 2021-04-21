package oop.inheritance.ingenico;

import java.util.Properties;

public class IngenicoStorageSystem {

    private IngenicoStorageSystem(){}

    private static class StorageSystemHolder{
        private static final IngenicoStorageSystem INSTANCE = new IngenicoStorageSystem();
    }

    public static IngenicoStorageSystem getInstance(){
        return StorageSystemHolder.INSTANCE;
    }

    private Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
