package GroceryApp;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Grocery admin = new Grocery();
        admin.addItemsInGroceryStore("Apple",45.67D);
        admin.addItemsInGroceryStore("Orange",34.56D);
        admin.addItemsInGroceryStore("Mango",89.56D);

        boolean shopping = true;

        while(shopping) {
            System.out.println("==================Welcome to the Grocery Shop=======================")!!!!!!!!!
            System.out.println("What do you wanna do====");
            System.out.println("1. Check the items preset in the grocery store.......");
            System.out.println("2. Check the items present in your cart.......");
            System.out.println("3. Add the Items in the Cart");
            System.out.println("Select an option..");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Map<String,Double> groceryStore = admin.getGroceryStore();
                    System.out.println(groceryStore);
                    break;

                case 2:
                    Set<String> groceryItems = admin.getGroceryItems();
                    System.out.println(groceryItems);

                    break;

                case 3:
                    System.out.println("Enter the item you want to add...");
                    String item = scanner.nextLine();
                    admin.addGroceryItems(item);
                    break;
            }
            System.out.println("Do you still want to continue.....");
            boolean option = scanner.nextBoolean();
            shopping=option;
        }
    }
}
