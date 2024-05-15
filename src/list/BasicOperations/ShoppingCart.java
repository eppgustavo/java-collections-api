package list.BasicOperations;

import list.BasicOperations.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItems(String name, double price, int quantity) {
        final Item item = new Item(name, price, quantity);
        items.add(item);
        for (Item i : items) {
            if (i.getName().equalsIgnoreCase(name)) {
                System.out.println("New item added in shopping cart, take a look in you list " + item.getName());
            }
        }
    }

    public void removeItens(String name) {
        if (!items.isEmpty()) {
            for (Item item : items) {
                if (item.getName().equalsIgnoreCase(name)) {
                    items.remove(item);
                    System.out.println(String.format("The item %s was removed succesfully", item.getName()));
                    showItems();
                    break;
                }
            }
        } else {
            System.out.println("No items in shopping cart");
        }
    }

    public void calculateTotalPrice() {

        if (!items.isEmpty()) {
            double totalPrice = 0;
            for (Item item : items) {
                totalPrice += item.getPrice();
            }
            System.out.println(String.format("Total purchase: $ %.2f", totalPrice));
        } else {
            System.out.println("No items in shopping cart");
        }

    }

    public void showItems() {
        if (!items.isEmpty()) {
            System.out.println("Items in list: ");
            for (Item item : items) {
                System.out.println(String.format("(Name: %s, Price: $ %.2f, Quantity: %d)", item.getName(), item.getPrice(), item.getQuantity()));
            }
        } else {
            System.out.println("No items in shopping cart");

        }
    }

    public static void main(String[] args) {

        // Create an instance of ShoppingCart class
        final ShoppingCart shoppingCart = new ShoppingCart();

        // Create items to build
        final Item clothes = new Item("T-shirt", 19.99, 5);
        final Item shovel = new Item("Shovel", 27.75, 1);
        final Item computer = new Item("Computer", 300.00, 1);

        // Insert the created items in my shopping cart
        shoppingCart.addItems(clothes.getName(), clothes.getPrice(), clothes.getQuantity());
        shoppingCart.addItems(shovel.getName(), shovel.getPrice(), shovel.getQuantity());
        shoppingCart.addItems(computer.getName(), computer.getPrice(), computer.getQuantity());

        // Show total items with all attributes descriptions
        shoppingCart.showItems();

        // Print the total purchase
        shoppingCart.calculateTotalPrice();

        // Remove a product by name
        shoppingCart.removeItens("computer");

        shoppingCart.calculateTotalPrice();
    }

}
