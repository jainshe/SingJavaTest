package utils;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;
import java.util.Properties;

public class Configuration {

    private static Map configMap = null;
    private static Map paramMap = null;
    private static String jsonmap = null;


    public static String getconfigEndpoint(String filename,String propertyname) throws FileNotFoundException {
        Yaml yaml = new Yaml();
        InputStream paramStream = new FileInputStream(new File(filename));
        paramMap = (Map) yaml.load(paramStream);
        return String.valueOf(paramMap.get(propertyname));
    }


    public static String getParamEndpoint(String filename,String propertyname) throws FileNotFoundException {
        Yaml yaml = new Yaml();
        InputStream configStream = new FileInputStream(new File(filename));
        configMap = (Map) yaml.load(configStream);
        return String.valueOf(configMap.get(propertyname));
    }


    public static String getjson(String filename,String propertyname) throws IOException {
        Properties prop = new Properties();
        InputStream jsonfile = new FileInputStream(new File(filename));
        prop.load(jsonfile);
        return String.valueOf(prop.getProperty(propertyname));
    }



}