package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItems> menuItems = new ArrayList<>();
    private LocalDate lastUpdate;

    // Allow for default constructor

    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }

    //SPECIAL METHODS
    // Define custom toString()
    // List menu items, grouped by category
    @Override
    public String toString() {
        StringBuilder appetizer = new StringBuilder();
        for (MenuItems item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizer.append("\n").append(item.toString());

            }
        }
        StringBuilder mainCuorse = new StringBuilder();
        for (MenuItems item : menuItems) {
            if (item.getCategory().equals("Main course")) {
                mainCuorse.append("\n").append(item.toString());

            }
        }
        StringBuilder dessert = new StringBuilder();
        for (MenuItems item : menuItems) {
            if (item.getCategory().equals("Dessert")) {
                dessert.append("\n").append(item.toString());

            }
        }
        return "\n OUR RESTAURANT MENU \n" +
                "APPETIZERS" + appetizer.toString() + "\n" +
                "MAIN COURSE" + mainCuorse.toString() + "\n" +
                "DESSERT" + dessert.toString() + "\n";

    }
    //TODO: define addItem()
        void addItem(MenuItems newItem) {
            menuItems.add(newItem);
            lastUpdate = LocalDate.now();


        }

    //TODO: define removeItem()
    void removeItem(MenuItems item){
            menuItems.remove(item);
            lastUpdate = LocalDate.now();
        }
}
