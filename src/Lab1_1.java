import java.util.ArrayList;

public class Lab1_1 {
    public static void main(String[] args) {
        //Initializing variables
        double subtotal = 0, sales_tax = 0, total = 0;

        //creating array list for names
        ArrayList<String> store_item = new ArrayList<String>();

        //adding name
        store_item.add("Beans");
        store_item.add("Pineapple");
        store_item.add("Water");
        store_item.add("Apple Watch");
        store_item.add("Toothpaste");
        store_item.add("Chips");

        //creating array list for names
        ArrayList<Double> store_price = new ArrayList<Double>();

        //adding prices
        store_price.add(2.50);
        store_price.add(3.99);
        store_price.add(1.99);
        store_price.add(299.99);
        store_price.add(0.50);
        store_price.add(3.50);

        //command line input
        for (int i = 0; i < args.length; i++) {
            try {
                int n = Integer.parseInt(args[i]) - 1;
                System.out.printf(store_item.get(n) + ", $" + store_price.get(n) + "%n");
            } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception thrown: " + e);
                    System.exit(1);
            }
        }
    }
}
