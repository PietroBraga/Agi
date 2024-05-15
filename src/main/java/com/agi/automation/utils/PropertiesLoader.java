package com.agi.automation.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    private FileReader fileReader;
    private Properties properties;

    public PropertiesLoader(Properties properties) throws IOException {
        this.properties = properties;
    }

    public void loadProperties() throws IOException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        fileReader = new FileReader(loader.getResource("local.properties").getFile());
        System.getProperties().load(fileReader);
    }
}
