package oop.inheritance.verifone.vx690;

import java.util.Properties;

public class VerifoneVx690StorageSystem {

    private VerifoneVx690StorageSystem(){}

    private static class StorageSystemHolder{
        private static final VerifoneVx690StorageSystem INSTANCE = new VerifoneVx690StorageSystem();
    }

    public static VerifoneVx690StorageSystem getInstance(){
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
