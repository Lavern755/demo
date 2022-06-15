package com.example.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author liwen
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties props= new Properties();
        props.setProperty("username", "yeeku");
        props.setProperty("pwd", "123456");
        props.store(new FileOutputStream("a.txt"), "comment line");

        Properties props2 = new Properties();
        props2.setProperty("gender", "male");
        props2.load(new FileInputStream("a.txt"));
    }
}
