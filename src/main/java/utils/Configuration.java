//package utils;
//
//import org.slf4j.Logger;
//import org.yaml.snakeyaml.Yaml;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.util.Map;
//
//public class Configuration {
//    private static final String CONFIG_FILE = "./src/main/resources/Parameters.yml";
//    private static final String URL_CONFIG_FILE = "./src/main/resources/URLs.yml";
//    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(Configuration.class);
//    private static Map configMap = null;
//    private static Map paramMap = null;
//
//    static {
//        try {
//            Yaml yaml = new Yaml();
//            InputStream configStream = new FileInputStream(new File(URL_CONFIG_FILE));
//            InputStream pacramStream = new FileInputStream(new File(CONFIG_FILE));
//            //paramMap = (Map) yaml.load(paramStream);
//            configMap = (Map) yaml.load(configStream);
//        } catch (FileNotFoundException e) {
//            logger.error(e.getMessage(), e);
//        }
//    }
//
//
//    public static String getEndpoint() {
//        return String.valueOf(configMap.get("Endpoint"));
//    }
//    public static String getPickupLat() {
//        return String.valueOf(paramMap.get("pickupLat"));
//    }
//    public static String getPickUplng() {
//        return String.valueOf(paramMap.get("pickupLng"));
//    }
//    public static String serviceType() {
//        return String.valueOf(paramMap.get("serviceType"));
//    }
//
//}