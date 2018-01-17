package com.example.andrii.jsonapp;

/**
 * Created by andrii on 17.01.18.
 */

public class Phone {
    private String name;
    private int price;

    Phone(String name, int price){
        this.name = name;
        this.price = price;
    }

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
    @Override
    public String toString(){
        return name + "" + String.valueOf(price);
    }
}
