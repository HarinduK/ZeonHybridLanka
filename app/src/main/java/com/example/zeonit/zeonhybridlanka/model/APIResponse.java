package com.example.zeonit.zeonhybridlanka.model;

import java.io.Serializable;

public class APIResponse implements Serializable {

    private boolean error;
    private int id;
    private User user;
    private String error_msg;
    private Details details;
//    private Images images ;


    public APIResponse(boolean error, int id, User user, String error_msg) {

        this.error = error;
        this.id = id;
        this.user = user;
        this.error_msg = error_msg;
    }

    public APIResponse(boolean error, int id, Details details, Images images, String error_msg) {
        this.error = error;
        this.id = id;
        this.details = details;
//        this.images = images;
        this.error_msg = error_msg;
    }

    public APIResponse(boolean error, int id, Details details, String error_msg) {
        this.error = error;
        this.id = id;
        this.details = details;
        this.error_msg = error_msg;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

//    public Images getImages() {
//        return images;
//    }
//
//    public void setImages(Images images) {
//        this.images = images;
//    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
