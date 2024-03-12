package com.colton.projectthree.inventory;

public class Item {

    private String name;

    private int amount;

    public Item(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public Item(String name) {
        this.name = name;
        this.amount = 1;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
