package oop.inheritance.verifone.vx520;

import java.util.Properties;

public class VerifoneVx520StorageSystem {

    private VerifoneVx520StorageSystem(){}

    private static class StorageSystemHolder{
        private static final VerifoneVx520StorageSystem INSTANCE = new VerifoneVx520StorageSystem();
    }

    public static VerifoneVx520StorageSystem getInstance(){
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
