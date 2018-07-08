package com.Jvnsun;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceLoader {
    public Properties getProperties(String fileName) {
        Properties properties = new Properties();
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(fileName)){
            properties.load(is);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
