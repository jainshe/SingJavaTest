package com.pojo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.Response;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Configuration;

import java.util.concurrent.Future;

@JsonIgnoreProperties(ignoreUnknown = true)
public class test {
    private static final String JSONFILE = "./src/main/resources/testapi5.properties";
    private static final String CONFIG_FILE = "./src/main/resources/Parameters.yml";
    private static final String URL_CONFIG_FILE = "./src/main/resources/URLs.yml";
        @Test
        public void testGetProduct() throws Exception {
            AsyncHttpClientConfig.Builder builder = new AsyncHttpClientConfig.Builder();
            AsyncHttpClient asyncHttpClient = new AsyncHttpClient(builder.build());
            Future<Response> f = asyncHttpClient.prepareGet(Configuration.getconfigEndpoint(URL_CONFIG_FILE,"Endpoint")).addQueryParam("pickupLat", Configuration.getParamEndpoint(CONFIG_FILE,"pickupLat"))
                .addQueryParam("pickupLng", Configuration.getParamEndpoint(CONFIG_FILE,"pickupLng")).addQueryParam("serviceType",Configuration.getParamEndpoint(CONFIG_FILE,"serviceType"))
                .addHeader("Content-Type","application/json").execute();
            Response response = f.get();

            //jackson parser

//          System.out.println(response.getResponseBody());
            String json = response.getResponseBody();
            ObjectMapper objectMapper = new ObjectMapper();
            RootObject rootObject = objectMapper.readValue(json, RootObject.class);
            System.out.println(rootObject.getData().getAssetsBasePath());
            Assert.assertEquals(null,rootObject.getData().getCurrencyUnit(),"");

            // in gson

            System.out.println("This is gson response");
            Gson gson = new GsonBuilder().create();
            RootObject p = gson.fromJson(json, RootObject.class);
            System.out.println(p.getData().getAssetsBasePath());
            Assert.assertEquals(null,rootObject.getData().getAssetsBasePath(),"");
            System.out.println("This is comparison");
            System.out.println(Configuration.getjson(JSONFILE,"abc"));
           JSONAssert.assertEquals(Configuration.getjson(JSONFILE,"abc"),json,true);


        }

}
