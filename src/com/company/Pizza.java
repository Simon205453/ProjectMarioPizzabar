package com.company;

import java.util.ArrayList;

public class Pizza {

    private ArrayList<String> listOfPizzaToppings;

    public Pizza(ArrayList<String> listOfPizzaToppings) {
        this.listOfPizzaToppings = listOfPizzaToppings;
    }

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

    @Override
    public String toString() {
        return "Pizza{" +
                "listOfPizzaToppings=" + listOfPizzaToppings +
                '}';
    }

    public String getPizzaToppings1() {

        String pizzaTopping1 = getListOfPizzaToppings().get(0);

        return pizzaTopping1;
    }

}



