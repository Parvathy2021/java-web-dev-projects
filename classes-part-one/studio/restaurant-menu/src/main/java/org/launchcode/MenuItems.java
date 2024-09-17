package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItems {

    private String item;
    private String description;
    private double price;
    private String category;
    private final LocalDate lastUpdate;

    public MenuItems(String item, String description, double price, String category) {
        this.item = item;
        this.description = description;
        this.price = price;
        this.category = category;
        this.lastUpdate = LocalDate.now();

        // Test isNew() to be false
        //this.lastUpdate = LocalDate.parse(text: "2024-16-02");
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }
    // SPECIAL METHODS
    // TODO: Define custom toString() method
    //Format name, description, price and conditional "NEW!"


    //TODO: Define custom equals() method



    //INSTANCE METHOD
    //TODO: Define instance method isNEW()
    //return true if item added within last 90 days.
    boolean isNew(){
        LocalDate today = LocalDate.now();
        double daysBetween = getLastUpdate().until(today, ChronoUnit.DAYS );
        return daysBetween < 90;
    }
}

