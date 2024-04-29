package com.example.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    
    Properties pro;
    public ReadConfig() {
        try {
            File src = new File("C:\\Users\\91701\\Desktop\\it sckcet\\softwareTesting-1\\hybridframework\\configuration\\Config.properties");
            FileInputStream fs = new FileInputStream(src);
            pro = new Properties();
            pro.load(fs);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public String getUrl() {
        return pro.getProperty("url");
    }

    public String getUsername() {
        return pro.getProperty("username");
    }

    public String getPassword() {
        return pro.getProperty("password");
    }
}
