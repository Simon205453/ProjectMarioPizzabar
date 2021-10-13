package com.company;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Order {



    private String timestamp;
    private double totalPrice;
    private String customerName;
    private Pizza[] chosenPizzas;
    private int orderId;

    public Orders() {

    }


    public static String timeStamp(){
        return "Timestamp: " + new Timestamp(new java.util.Date().getTime());
    }

    @Override
    public String toString() {
        return "Orders{ timeOfOrder: " + timeStamp() +
                " totalPrice=" + totalPrice +
                ", customerName='" + customerName + '\'' +
                ", chosenPizzas=" + Arrays.toString(chosenPizzas) +
                ", orderId='" + orderId + '\'' +
                '}';
    }

    public Order(String timestamp, double totalPrice, String customerName, Pizza[] chosenPizzas, int orderId) {
        this.timestamp = timestamp;
        this.totalPrice = totalPrice;
        this.customerName = customerName;
        this.chosenPizzas = chosenPizzas;
        this.orderId = orderId;

        //TODO Generate order name (not in order class, method or smth) eks. johnson1234 + johnson1235
        // autogenerated, så vi kan referere tilbage til ordrene når mario vil lave statestik

        //setOrderinactive


    }
    public void orderSystem(){


    }
    public void showAllOrders(){

    }
    public void placeOrder(){

    }
    public int getOrderId(){

        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Pizza[] getChosenPizzas() {
        return chosenPizzas;
    }
}
