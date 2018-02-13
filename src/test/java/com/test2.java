//package com;
//
//import com.ning.http.client.AsyncHttpClient;
//import com.ning.http.client.AsyncHttpClientConfig;
//import com.ning.http.client.Response;
//import com.pojo.RootObject;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.testng.annotations.Test;
//import practice.DataProviderClass;
//import utils.Configuration;
//
//import java.util.concurrent.Future;
//
///**
// * @author shefali.jain
// */
//public class test2 {
//
//
//    public void initTest(String body) throws Exception {
//        AsyncHttpClientConfig.Builder builder = new AsyncHttpClientConfig.Builder();
//        AsyncHttpClient asyncHttpClient = new AsyncHttpClient(builder.build());
//        Future<Response> f = asyncHttpClient.prepareGet(Configuration.getEndpoint()).addQueryParam("pickupLat",Configuration.getPickupLat())
//                .addQueryParam("pickupLng",Configuration.getPickUplng()).addQueryParam("serviceType",Configuration.serviceType())
//                .addHeader("Content-Type","application/json").setBody(body).execute();
//        Response response = f.get();
//        System.out.println(response.getUri());
//        System.out.println(response.getStatusCode());
//        System.out.println(response.getHeaders());
//        System.out.println(response.hasResponseStatus() );
//        System.out.println("Hi");
//        System.out.println(response.getResponseBody());
//        String json = response.getResponseBody();
//        ObjectMapper objectMapper = new ObjectMapper();
//        RootObject rootObject = objectMapper.readValue(json, RootObject.class);
//        System.out.println(rootObject.getData().getCurrencyUnit());
//    }
//    @Test(dataProviderClass= DataProviderClass.class,dataProvider ="couponDatafail")
//    public void postdata(String body) throws Exception {
//        initTest(body);
//    }
//
//}
