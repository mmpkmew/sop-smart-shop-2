package com.example1.demo;

public class PizzaFactory {
    private static Shop[] Pizzas = new Shop[]{
            new Cheese1(),
            new Hawaiian(),
            new Pepperoni()
    };
    public static Shop[] getMenuList() {
        return Pizzas;
    }
    public static Shop getMenu(int index) {
        return Pizzas[index];
    }
}
