package com.example.zeonit.zeonhybridlanka.model;

import java.io.Serializable;

public class Details implements Serializable{

    private String item;
    private String etd;
    private String won;
    private String doc_send;
    private String eta;

    public Details(String item, String etd, String won, String doc_send, String eta) {
        this.item = item;
        this.etd = etd;
        this.won = won;
        this.doc_send = doc_send;
        this.eta = eta;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getEtd() {
        return etd;
    }

    public void setEtd(String etd) {
        this.etd = etd;
    }

    public String getWon() {
        return won;
    }

    public void setWon(String won) {
        this.won = won;
    }

    public String getDoc_send() {
        return doc_send;
    }

    public void setDoc_send(String doc_send) {
        this.doc_send = doc_send;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }
}
