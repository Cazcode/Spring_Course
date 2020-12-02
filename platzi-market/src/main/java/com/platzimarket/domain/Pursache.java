package com.platzimarket.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pursache {
    private int pursacheId;
    private String clientId;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private String state;
    private List<PursacheItem> items;

    public int getPursacheId() {
        return pursacheId;
    }

    public void setPursacheId(int pursacheId) {
        this.pursacheId = pursacheId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<PursacheItem> getItems() {
        return items;
    }

    public void setItems(List<PursacheItem> items) {
        this.items = items;
    }
}
