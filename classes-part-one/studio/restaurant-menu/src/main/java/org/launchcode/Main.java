package org.launchcode;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // TODO: Create % menu items in different categories.

        MenuItems item1 = new MenuItems("Poutina Turner", "Rock Star Dusted fries topped with cheddar cheese curds, chorizo gravy (or make it vegetarian!), onions, and cilantro", 15.00,  "Appetizer");
        MenuItems item2 = new MenuItems( "Shrimp Bizkit", "pan-seared shrimp, peppers and onions", 5.25, "Main Course");
        MenuItems item3 = new MenuItems( "Goonies Are Good",  "Gigantic quesadilla, stuffed with crab Rangoon filling, and served up with a spicy sweet chili sauce",  16.00,  "Main Course");
        MenuItems item4 = new MenuItems( "Bread Michaels",  "Hawaiian bread pudding, topped with caramel and sea salt",  7.00,  "Dessert");

        // TODO: print first item
        System.out.println(item1);

        // Create a menu
        Menu menu = new Menu();

        // TODO: Add item to the menu and print it

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);

        System.out.println(menu
        );

        // TODO: Remove an item and print menu

        menu.removeItem(item3);
        System.out.println(menu);


        // TODO: Test equals method


        // TODO: Attempt to add a duplicate item, then print menu to confirm it wasn't added.
    }
}
