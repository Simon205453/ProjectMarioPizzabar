package com.company;

public class Pizza {

    private String pizzaName;
    private double pizzaPrice;
    private boolean tomatoSauce;
    private boolean cheese;
    private boolean oregano;
    private String meat1;
    private String meat2;
    private String meat3;
    private String vegetables;
    private String spices;
    private String other;



    public Pizza(String pizzaName, double pizzaPrice, boolean tomatoSauce, boolean cheese, String meat1, String meat2, String meat3, boolean oregano, String vegetables, String spices, String other) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.meat1 = meat1;
        this.meat2 = meat2;
        this.meat3 = meat3;
        this.oregano = oregano;
        this.vegetables = vegetables;
        this.spices = spices;
        this.other = other;


    }

    @Override
    public String toString() {
        return "Pizza{" +
                "" + "" + pizzaName + '\'' +
                '}';
    }
}