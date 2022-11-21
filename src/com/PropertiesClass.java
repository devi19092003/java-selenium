package com;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("C:\\Users\\LENOVO\\Desktop\\st\\EveningBatch.properties");
        Properties prop = new Properties();
        prop.load(file);

        FileReader file1 = new FileReader("C:\\Users\\LENOVO\\Desktop\\st\\Another.properties");
        prop.load(file1);

        System.out.println(prop.getProperty("DigitalPartners"));
        System.out.println(prop.getProperty("SoftwareTesting"));
    }

}
