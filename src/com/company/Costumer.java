package com.company;

public class Costumer {

    private String name;
    private String orderId;

    public Costumer(String name, String orderId) {
        this.name = name;
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public String getOrderId() {
        return orderId;
    }
}
