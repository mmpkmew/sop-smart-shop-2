package com.example1.demo;

public class Cheese1 implements Shop {
    private String name = "Cheese pizza";
    private int price = 300;
    private String size = "S";
    private String topping = "Mozzarella Cheese, Cheese, Pizza Sauce";
    private Crust[] crust() {
        return new Crust[0];
    }

    @Override
    public String getName(){
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getSize() {
        return size;
    }
    public String getTopping(){
        return topping;
    }
}
