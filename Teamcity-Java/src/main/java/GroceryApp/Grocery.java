package GroceryApp;

import java.util.*;

public class Grocery {
    private Set<String> groceryItems = new HashSet<String>();
    private Map<String, Double> groceryStore = new HashMap<String, Double>();

    public Grocery(){

    }


    public Map<String, Double> getGroceryStore() {
        return groceryStore;
    }

    public Map<String,Double> addItemsInGroceryStore(String item , Double price){
          groceryStore.put(item,price);
        return groceryStore;
    }

    public String addGroceryItems(String item){
        if(groceryStore.containsKey(item)){
            groceryItems.add(item);
            return "Item has been successfully added in the cart";
        }

            return "Item is not available in grocery shop";


    }

    public Set<String> getGroceryItems() {
        return groceryItems;
    }
}
