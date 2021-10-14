package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static ArrayList<Pizza> placeOrder = new ArrayList<Pizza>();
    static ArrayList<Integer> orderFromCostumers = new ArrayList<Integer>();
    static int orderNum;
    static ArrayList<String> orders = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
/*





        System.out.println("Enter 0 to finish this order.");
        // en kunde siger hvilke pizzaer de vil have f.eks. en nummer 2 og nummer 3.
        int costumerPizza = scanner.nextInt();
        int countPizza = 0;
        while (costumerPizza != 0) {
            orderFromCostumers.add(costumerPizza);
            costumerPizza = scanner.nextInt();
            countPizza++;

            Costumer random = new Costumer("name", "24");
*/
        int chosenPizza;
        int chosenAction;
        boolean pizzabarOpen = true;
        System.out.println("Hello and welcome to Marios pizzaria, how can i help you?");
        while (pizzabarOpen) {

            System.out.println("press 1 to place order \n press 2 to show menu \n press 3 to show orders");
            chosenAction = scanner.nextInt();

            String pizzaorder = "Order";
            int pizzaOrderCount = 0;
            int currentOrderNum = 0;
            while (currentOrderNum != pizzaOrderCount) {
                String newestOrder = pizzaorder + pizzaOrderCount;
                orders.add(newestOrder);
            }

            switch (chosenAction) {
                case 1:
                    System.out.println("Place order");
                    chosenPizza = scanner.nextInt();
                    double totalPriceSum = 0;
                    System.out.println("");



                    while (chosenPizza != 0) {


                        switch (chosenPizza) {
                            case 1:
                                System.out.println(Vesuvio.getName());
                                totalPriceSum = totalPriceSum + Vesuvio.getPrice();
                                placeOrder.add(Vesuvio);
                                break;
                            case 2:
                                System.out.println(Bertil.getName());
                                totalPriceSum = totalPriceSum + Bertil.getPrice();
                                placeOrder.add(Bertil);
                                break;
                            case 3:
                                System.out.println(Margherita.getName());
                                totalPriceSum = totalPriceSum + Margherita.getPrice();
                                placeOrder.add(Margherita);
                                break;
                            case 4:
                                System.out.println(Victoria.getName());
                                totalPriceSum = totalPriceSum + Victoria.getPrice();
                                placeOrder.add(Victoria);
                                break;
                            default:
                                System.out.println("Unavailable Pizza");
                                break;
                        }

                        System.out.println(placeOrder.stream().map(Object::toString)
                                .collect(Collectors.joining("\n")));

                        System.out.println("Do you to finish your order? \n type:\n 0 - YES ");
                        //System.out.println("total price: " + totalPriceSum);
                        chosenPizza = scanner.nextInt();
                        if (chosenPizza == 0) {
                            System.out.println("total price: " + totalPriceSum);
                        }
                        String placeOrderString = placeOrder.toString();
                        orders.set(pizzaOrderCount, placeOrderString);
                        System.out.println(orders);
                    }
                    pizzaOrderCount++;
                    break;

                case 2:
                    System.out.println("Menukort \n-----------");
                    for (int i = 0; i < Menukort.length; i++) {
                        System.out.println(Menukort[i]);
                    }
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid action");
                    break;
            }
        }
        //  System.out.println("total price: " + totalPriceSum);
    }
      /*

        System.out.println("So in total you have " + countPizza + " pizzas and the numbers are: ");

        for (int e : orderFromCostumers) {
            System.out.println("Number " + e);
        }

        if (countPizza < 10) {
            System.out.println("They are ready in 10 minuts🍕");
        } else {
            System.out.println("They are ready in 20 minuts🍕");
        }

       */

}


//make txt with saved orders