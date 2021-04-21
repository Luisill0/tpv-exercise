package oop.inheritance.verifone.v240m;

import java.util.Properties;

public class VerifoneV240mStorageSystem {

    private VerifoneV240mStorageSystem(){}

    private static class StorageSystemHolder{
        private static final VerifoneV240mStorageSystem INSTANCE = new VerifoneV240mStorageSystem();
    }

    public static VerifoneV240mStorageSystem getInstance(){
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
