package com.example.planit;

public class chicken_list {
    String name;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public chicken_list(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
