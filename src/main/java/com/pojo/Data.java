package com.pojo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//package com.pojo;
//
//
//
///**
// * @author shefali.jain
// */
@JsonIgnoreProperties(ignoreUnknown = true)

@lombok.Data
public class Data {

    private Object assetsBasePath;
    private String currencyUnit;
    private P2p p2p;
}
