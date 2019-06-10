package com.example.zeonit.zeonhybridlanka.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Images implements Serializable {

    private String[] vehicle=null;
    private String[] bl=null;

    public Images(String[] vehicle, String[] bl) {
        this.vehicle = vehicle;
        this.bl = bl;
    }

    public String[] getVehicle() {
        return vehicle;
    }

    public void setVehicle(String[] vehicle) {
        this.vehicle = vehicle;
    }

    public String[] getBl() {
        return bl;
    }

    public void setBl(String[] bl) {
        this.bl = bl;
    }
}
