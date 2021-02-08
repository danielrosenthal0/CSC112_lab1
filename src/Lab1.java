import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        //private class store {
            //Names of items in store
            ArrayList<String> store_item = new ArrayList<String>();
        store_item.add("Beans, $2");
        store_item.add("Pineapple, $3");
        store_item.add("Water, $1");
        store_item.add("Apple Watch, $300");
        store_item.add("Toothpaste, $0.50");
        store_item.add("Chips, $3.50");

            //Prices of items
            ArrayList<Double> store_price = new ArrayList<Double>();
        store_price.add(2.0);
        store_price.add(3.0);
        store_price.add(1.0);
        store_price.add(300.0);
        store_price.add(0.5);
        store_price.add(3.5);
        //}
        //Initializing variables
        double subtotal = 0, sales_tax = 0, total = 0;

        //Presenting list of items in store w/ prices
        System.out.println("Store inventory and prices:");
        for (int i = 0; i < store_item.size(); i++){
            System.out.print(i + 1 + " ");
            System.out.println(store_item.get(i));
        }

        //Initializing more variables
        boolean exit = false;
        int item = 0;
        String yes;

        //While loop to continuously ask for inout from command line
        //while (!exit) {
            System.out.println("Select number of item to add to cart:");
            Scanner scnr = new Scanner(System.in);

            //try and catch for out of bounds exception
            try {
                item = scnr.nextInt() - 1;
                System.out.println(store_item.get(item));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception thrown: " + e);
            }
            subtotal = subtotal + store_price.get(item);
            sales_tax = subtotal*0.05;
            total = subtotal + sales_tax;
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Sales tax: $" + sales_tax);
            System.out.println("Total: $" + total);
            //System.out.println("Do you want to continue shopping? Enter yes or no.");
            //yes = scnr.nextLine();
            //if (scnr.nextLine() == "yes") {
               // exit = false;
            //} else if (scnr.nextLine() == "no") {
                //exit = true;
            //}
        //}
    }
}
