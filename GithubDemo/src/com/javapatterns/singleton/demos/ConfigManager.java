package com.javapatterns.singleton.demos;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigManager {

    private static final String FILE_PATH = System.getProperty("user.dir")
            + File.separator + "singleton.properties";
    private static final ConfigManager instance = new ConfigManager();

    private File file;
    private long lastModifiedTime;
    private Properties props;

    private ConfigManager() {
        file = new File(FILE_PATH);
        lastModifiedTime = file.lastModified();
        if (lastModifiedTime == 0) {
            System.err.println("File " + FILE_PATH + " not found!");
        }
        props = new Properties();
        try {
            props.load(new FileInputStream(FILE_PATH));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized static ConfigManager getInstance() {
        return instance;
    }

    public final Object getConfigItem(String name, Object defaultValue) {
        // if the file has been modified, reload it
        long newTime = file.lastModified();
        if (newTime == 0) {
            if (lastModifiedTime == 0) {
                // file doesn't exist
                System.err.println("File " + FILE_PATH + " not found.");
            } else {
                System.err.println("File " + FILE_PATH + " was deleted.");
            }
            return defaultValue;
        } else if (newTime > lastModifiedTime) {
            // get rid of the old properties
            props.clear();
            try {
                props.load(new FileInputStream(FILE_PATH));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        lastModifiedTime = newTime;
        Object value = props.getProperty(name);
        if (value == null) {
            return defaultValue;
        } else {
            return value;
        }
    }
}
