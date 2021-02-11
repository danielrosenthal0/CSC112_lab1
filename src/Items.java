import java.util.ArrayList;

public class Items {
    //private
    private String itemName;
    private double itemPrice;


    //constructor
    public Items(String name, double price) {
        this.itemName = name;
        this.itemPrice = price;
    }

    //get item name
    public String getItemName() {
        return this.itemName;
    }

    //get item price
    public double getItemPrice() {
        return this.itemPrice;
    }

    //set item name
    public void setItemName(String name) {
        this.itemName = name;
    }

    //set item price
    public void setItemPrice(double price) {
        this.itemPrice = price;
    }
}
