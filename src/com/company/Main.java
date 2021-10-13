package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Pizzaer

        Pizza vesuvio = new Pizza("Vesuvio", 59, true, true, "Skinke", "", "", true, "", "", "");
        Pizza magarita = new Pizza("Magarita",59,true,true,"","","",true,"","","");
        Pizza bertil = new Pizza("Betil",59,true,true,"Bacon","","",true,"","","");
        Pizza victoria = new Pizza("Victoria",75,true,true,"Skinke","","",true,"Champignon","Løg","Ananas");


        ArrayList<String> listOfPizzaToppings = new ArrayList<String>();
        listOfPizzaToppings.add("Tomatsauce");
        listOfPizzaToppings.add("Ost");
        listOfPizzaToppings.add("Oregano");
        listOfPizzaToppings.add("Skinke");
        listOfPizzaToppings.add("Bacon");
        listOfPizzaToppings.add("Løg");
        listOfPizzaToppings.add("Champingnon");
        listOfPizzaToppings.add("Ananas");



        ArrayList<Pizza>pizzaOrders = new ArrayList<>();

        pizzaOrders.add(vesuvio);
        pizzaOrders.add(magarita);
        pizzaOrders.add(bertil);
        pizzaOrders.add(victoria);
        pizzaOrders.add(bertil);
        pizzaOrders.add(victoria);
        System.out.println("s");
        System.out.println("Here is your list with your orders:");

        for (Pizza e: pizzaOrders ) {
            System.out.println(e);


        }

    }
}
