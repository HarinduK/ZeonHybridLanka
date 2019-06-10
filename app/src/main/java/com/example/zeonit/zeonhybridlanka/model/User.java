package com.example.zeonit.zeonhybridlanka.model;

import java.io.Serializable;

public class User implements Serializable{

    private String username;
    private String user;
    private String email;
    private String nic;
    private String address;
    private String mobile;
    private String pwd;
    private String user_catagory;
    private String sales_officer;

    public User(String username, String user, String email, String nic, String address, String mobile, String pwd, String user_catagory, String sales_officer) {
        this.username = username;
        this.user = user;
        this.email = email;
        this.nic = nic;
        this.address = address;
        this.mobile = mobile;
        this.pwd = pwd;
        this.user_catagory = user_catagory;
        this.sales_officer = sales_officer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUser_catagory() {
        return user_catagory;
    }

    public void setUser_catagory(String user_catagory) {
        this.user_catagory = user_catagory;
    }

    public String getSales_officer() {
        return sales_officer;
    }

    public void setSales_officer(String sales_officer) {
        this.sales_officer = sales_officer;
    }
}
