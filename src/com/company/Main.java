package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    static ArrayList<Integer> orderFromCostumers = new ArrayList<Integer>();
    static int orderNum;
    static double totalPriceSum;
    static ArrayList<String> currentOrders = new ArrayList<String>();
    static ArrayList<String> allOrders = new ArrayList<String>();

    public static double getTotalPriceSum() {
        //if (currentOrders.contains(Pizza Ves))
        return totalPriceSum;
    }

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

        int chosenPizza;
        int chosenAction;
        boolean pizzabarOpen = true;
        System.out.println("Welcome to the Pizzabar system");
        while (pizzabarOpen) {

            System.out.println(" 1 - place order \n 2 - show menu \n 3 - show all orders \n 4 - show current orders \n 5 - remove order");
            chosenAction = scanner.nextInt();

            String pizzaorder = "Order";
            int pizzaOrderCount = 0;
            int currentOrderNum = 0;
            String customerName = "";
            while (currentOrderNum != pizzaOrderCount) {
                String newestOrder = pizzaorder + pizzaOrderCount;
                currentOrders.add(newestOrder);
            }
            ArrayList<Pizza> placeOrder = new ArrayList<Pizza>();
            switch (chosenAction) {
                case 1:
                    System.out.println("Place order\n 1 - Vesuvio\n 2 - Bertil\n 3 - Margherita\n 4 - Victoria");
                    chosenPizza = scanner.nextInt();
            //Vi sætter totalpricesum til 0, for ikke at lægge den forrige pizzas pris oven i den nye pizzas pris
                    totalPriceSum = 0;

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
                        chosenPizza = scanner.nextInt();
                        if (chosenPizza == 0) {
                            System.out.println("total price: " + totalPriceSum);
                        }
                    }
                    //Vi laver en placeOrderString for at kunne tilføje ordren til vores orders arraylist som en string
                    String placeOrderString = "";
                    placeOrderString = placeOrder.toString();
                    currentOrders.add(placeOrderString);
                    allOrders.add(placeOrderString);

                    pizzaOrderCount++;
                    break;

                case 2:
                    System.out.println("Menukort \n-----------");
                    for (int i = 0; i < Menukort.length; i++) {
                        System.out.println(Menukort[i]);
                    }
                    break;

                case 3:
                    System.out.println(allOrders.stream().map(Object::toString)
                            .collect(Collectors.joining("\n")));
                    break;
                case 4:
                    System.out.println(currentOrders.stream().map(Object::toString)
                            .collect(Collectors.joining("\n")));
                    break;
                case 5:
                    System.out.println("Chose order to remove/mark as done");
                    System.out.println(currentOrders.stream().map(Object::toString)
                            .collect(Collectors.joining("\n")));
                    int removeOrder = scanner.nextInt();
                    currentOrders.remove(removeOrder - 1);
                    System.out.println("Current orders");
                    System.out.println(currentOrders.stream().map(Object::toString)
                            .collect(Collectors.joining("\n")));
                    break;
                default:
                    System.out.println("Invalid action");
                    break;
            }
        }
    }
}

//make txt with saved orders