import java.util.ArrayList;

public class Lab1_1 {
    public static void main(String[] args) {
        //Initializing variables
        double subtotal = 0.00;
        double sales_tax;
        double total;

        //welcome note
        System.out.println("Welcome to Daniel's Corner Store");
        System.out.println();
        System.out.println("           Receipt");
        String item_name = "Item";
        String item_prices = "Price";
        System.out.printf( "%-15s %13s %n", item_name, item_prices);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//creating array list for names
        ArrayList<Items> store = new ArrayList<>();

        Items beans = new Items("Beans      ", 2.50);
        Items pineapple = new Items("Pineapple  ", 3.99);
        Items water = new Items("Water        ", 1.99);
        Items apple_watch = new Items("Apple Watch", 299.99);
        Items toothpaste = new Items("Toothpaste ", 0.50);
        Items chips = new Items("Chips      ", 3.50);

        //adding name
        store.add(beans);
        store.add(pineapple);
        store.add(water);
        store.add(apple_watch);
        store.add(toothpaste);
        store.add(chips);


        //command line input
        //loops for every argument
        for (int i = 0; i < args.length; i++) {
            //try and catch in case argument number is out of bounds
            try {
                //converting integer from string from command line
                int n = Integer.parseInt(args[i]) - 1;
                //getting item to print on receipt
                System.out.print(store.get(n).getItemName());
                //getting price and formatting to print on receipt
                System.out.printf("%12s", "$");
                System.out.printf("%6.2f\n", store.get(n).getItemPrice());
                //calculating subtotal w/in for loop to continually update for each argument
                subtotal = subtotal + store.get(n).getItemPrice();
                //exception handling for out of bounds exception
            } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception thrown: " + e);
                    System.exit(1);
            }

        }
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //calculating sales tax and total
        sales_tax = subtotal*0.05;
        total = subtotal + sales_tax;

        //printing and formatting bottom portion of receipt
        System.out.println();
        System.out.println("Subtotal:             $" + subtotal);
        System.out.print("Sales tax (5%):       $ ");
        System.out.printf("%.2f\n", sales_tax);
        System.out.print("Total:                ");
        System.out.printf("$%.2f\n", + total);
        System.out.println();

        System.out.println("Thanks for shopping at Daniel's Corner Store. Have a great day!");
    }
}
