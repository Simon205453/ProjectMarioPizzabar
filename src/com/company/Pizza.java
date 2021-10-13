package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {

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

    public int getPizzaNum() {
        return pizzaNum;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String[] getPizzaTopping() {
        return pizzaTopping;
    }

    @Override
    public String toString() {
        return "Pizza{ " + pizzaNum +
                ". " + name +
                ", price=" + price +
                ", pizzaTopping= " + Arrays.toString(pizzaTopping) +
                '}';
    }

    /*
    public ArrayList<String> getListOfPizzaToppings() {

        ArrayList<String> listOfPizzaToppings = new ArrayList<String>();
        listOfPizzaToppings.add("Tomatsauce");
        listOfPizzaToppings.add("Ost");
        listOfPizzaToppings.add("Oregano");
        listOfPizzaToppings.add("Skinke");
        listOfPizzaToppings.add("Bacon");
        listOfPizzaToppings.add("Løg");
        listOfPizzaToppings.add("Champingnon");
        listOfPizzaToppings.add("Ananas");

        return listOfPizzaToppings;

    }


 */

/*
    public String getPizzaToppings1() {

        String pizzaTopping1 = getListOfPizzaToppings().get(0);

        return pizzaTopping1;
    }
*/
}



