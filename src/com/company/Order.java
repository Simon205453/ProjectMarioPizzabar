package com.company;

import java.security.PublicKey;
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


        public int countingPizza(){
            int countPizza = 0;

            return countPizza++;
        }

    }

