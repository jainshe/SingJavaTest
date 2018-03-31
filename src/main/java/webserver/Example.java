package webserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.Configuration;

import java.io.IOException;

@RestController
@EnableAutoConfiguration
public class Example {

    private static final String JSONFILE = "./src/main/resources/testapi5.properties";
    @RequestMapping("/products12")
    String home() throws IOException {

         return Configuration.getjson(JSONFILE,"abc");


    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}