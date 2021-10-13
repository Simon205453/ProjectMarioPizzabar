package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //creates a new instance of pizzatoppings
        Pizzatopping pizzatopping = new Pizzatopping("Tomatsauce", "Ost", "Oregano", "Skinke", "Bacon", "Løg", "Champingnon", "Chili", "Ananas", "Kebab");
        //Pizzas
        //Vi laver en pizza, ved først at bestemme toppingen tilhørende. Laver et dedikeret array til hver enkelt pizzas toppings
        String[] vesuvioToppings = {pizzatopping.getTomatsauce(), pizzatopping.getOst(), pizzatopping.getSkinke(), pizzatopping.getOregano()};
        //Vi laver pizzaen med toppingen fra tidl. krearede array.
        Pizza Vesuvio = new Pizza(1, "Vesuvio", 59, vesuvioToppings);
        String[] margheritaToppings = {pizzatopping.getTomatsauce(), pizzatopping.getOst()};
        Pizza Margherita = new Pizza(2, "Margherita", 59, margheritaToppings);
        String[] bertilToppings = {pizzatopping.getTomatsauce(), pizzatopping.getOst(), pizzatopping.getBacon(), pizzatopping.getOregano()};
        Pizza Bertil = new Pizza(3, "Bertil", 59, bertilToppings);
        String[] victoriaToppings = {pizzatopping.getTomatsauce(), pizzatopping.getOst(), pizzatopping.getSkinke(), pizzatopping.getAnanas(), pizzatopping.getChampingnon(), pizzatopping.getLøg()};
        Pizza Victoria = new Pizza(4, "Victoria", 75, victoriaToppings);

        System.out.println(Vesuvio.getPizzaNum());
        System.out.println(Vesuvio.getName());
        System.out.println(Vesuvio.getPrice());
        System.out.println(Vesuvio.getPizzaTopping());

        Pizza[] Menukort = {Vesuvio, Margherita, Bertil, Victoria};
        System.out.println(Menukort);


/*
        Pizza vesuvio = new Pizza("Vesuvio", 59, true, true, "Skinke", "", "", true, "", "", "");
        Pizza magarita = new Pizza("Magarita",59,true,true,"","","",true,"","","");
        Pizza bertil = new Pizza("Betil",59,true,true,"Bacon","","",true,"","","");
        Pizza victoria = new Pizza("Victoria",75,true,true,"Skinke","","",true,"Champignon","Løg","Ananas");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> orderFromCostumers = new ArrayList<Integer>();

        System.out.println("Hello and welcome to Marios pizzaria, how can i help you?");
        System.out.println("Enter 0 to finish this order.");
        // en kunde siger hvilke pizzaer de vil have f.eks. en nummer 2 og nummer 3.
        int costumerPizza = scanner.nextInt();

        while (costumerPizza != 0){

            orderFromCostumers.add(costumerPizza);
            costumerPizza = scanner.nextInt();
        }
        for (int e  : orderFromCostumers) {
            System.out.println("Number "+ e);

 */

        }

        /*

        /*

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

         */


        }
        /*
         */


    }

