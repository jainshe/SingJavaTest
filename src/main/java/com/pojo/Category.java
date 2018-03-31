package com.pojo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author shefali.jain
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Data
public class Category {

    private String id;
    private String displayName;
    private Eta eta;
    private boolean canRideLater;
    private boolean needDropLocation;
    private Fare fare;
    private boolean isSelect;
    private String categoryType;
}
