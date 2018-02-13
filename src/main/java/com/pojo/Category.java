package com.pojo;

/**
 * @author shefali.jain
 */
public class Category {
    private String id;

    public String getId() { return this.id; }

    public void setId(String id) { this.id = id; }

    private String displayName;

    public String getDisplayName() { return this.displayName; }

    public void setDisplayName(String displayName) { this.displayName = displayName; }

    private Eta eta;

    public Eta getEta() { return this.eta; }

    public void setEta(Eta eta) { this.eta = eta; }

    private boolean canRideLater;

    public boolean getCanRideLater() { return this.canRideLater; }

    public void setCanRideLater(boolean canRideLater) { this.canRideLater = canRideLater;
    }

    private boolean needDropLocation;

    public boolean getNeedDropLocation() { return this.needDropLocation; }

    public void setNeedDropLocation(boolean needDropLocation) { this.needDropLocation = needDropLocation; }

    private Fare fare;

    public Fare getFare() { return this.fare; }

    public void setFare(Fare fare) { this.fare = fare; }
}
