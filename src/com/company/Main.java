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

        Pizza[] Menukort = {Vesuvio, Margherita, Bertil, Victoria};

        for (int i = 0; i < Menukort.length; i++) {
            System.out.println(Menukort[i]);
        }



        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> orderFromCostumers = new ArrayList<Integer>();

        System.out.println("Hello and welcome to Marios pizzaria, how can i help you?");
        System.out.println("Enter 0 to finish this order.");
        // en kunde siger hvilke pizzaer de vil have f.eks. en nummer 2 og nummer 3.
        int costumerPizza = scanner.nextInt();
        int countPizza = 0;
        while (costumerPizza != 0) {
            orderFromCostumers.add(costumerPizza);
            costumerPizza = scanner.nextInt();
            countPizza++;
            if (costumerPizza == 1){
                Vesuvio.getName();
                continue;
            }else if(costumerPizza == 2){
    Margherita.getName();
    continue;
            }else if (costumerPizza == 3){
                Bertil.getName();
                continue;
            }else if (costumerPizza == 4){
                Victoria.getName();

                continue;
            }else {

                continue;
            }
        }


        System.out.println("So in total you have " + countPizza + " pizzas and the numbers are: ");

        for (int e : orderFromCostumers) {
            System.out.println("Number " + e);
        }

        if (countPizza < 10){
            System.out.println("They are ready in 10 minuts🍕");
       }else {
               System.out.println("They are ready in 20 minuts🍕");
        }
    }
}




