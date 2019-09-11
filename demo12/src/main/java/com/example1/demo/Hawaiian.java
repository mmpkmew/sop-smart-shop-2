package com.example1.demo;

public class Hawaiian implements Shop {
    private String name = "Pepperoni pizza";
    private int price = 300;
    private String size = "M";
    private String topping = "Pineapple, Ham Slice, Bacon Slice, Mozzarella Cheese, Pizza Sauce";
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
    @Override
    public String toString() {
        return name + " - " + price;
    }
}
