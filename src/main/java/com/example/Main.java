package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Language selection
        System.out.println("Select language: en / fi / sv");
        String lang = scanner.nextLine();

        Locale locale;
        switch (lang) {
            case "fi":
                locale = new Locale("fi", "FI");
                break;
            case "sv":
                locale = new Locale("sv", "SE");
                break;
            default:
                locale = new Locale("en", "US");
        }

        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
        CartCalculator calculator = new CartCalculator();

        System.out.println(messages.getString("enter_items"));
        int itemCount = scanner.nextInt();

        double[] totals = new double[itemCount];

        for (int i = 0; i < itemCount; i++) {
            System.out.println(messages.getString("enter_price"));
            double price = scanner.nextDouble();

            System.out.println(messages.getString("enter_quantity"));
            int quantity = scanner.nextInt();

            totals[i] = calculator.calculateItemTotal(price, quantity);
        }

        double totalCost = calculator.calculateCartTotal(totals);

        System.out.println(messages.getString("total_cost") + " " + totalCost);
    }
}