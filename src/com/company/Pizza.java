package com.company;

import java.util.Arrays;

public class Pizza {

//Simon

    private int pizzaNum;
    private String name;
    private int price;
    private String[] pizzaTopping;



    public Pizza(int pizzaNum, String name, int price, String[] pizzaTopping) {
        this.pizzaNum = pizzaNum;
        this.name = name;
        this.price = price;
        this.pizzaTopping = pizzaTopping;

    }


    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Pizza{ " + pizzaNum +
                ". " + name +
                ", price=" + price +
                ", pizzaTopping= " + Arrays.toString(pizzaTopping) +
                '}';
    }
}



