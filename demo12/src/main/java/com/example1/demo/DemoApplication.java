package com.example1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import java.io.IOException;


@RestController
@SpringBootApplication
public class DemoApplication {

    List<Integer> cart=new ArrayList<>();
    public static void main(String[] args)  {
        SpringApplication.run(DemoApplication.class, args);
    }
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/shop")
    Shop[] viewMenuList(){
        return PizzaFactory.getMenuList();
    }

    @RequestMapping("/menu/{num}")
    Shop viewMenu(@PathVariable int num){
        return PizzaFactory.getMenu(num);
    }

    @RequestMapping({"/menu/{id}/add"})
    String addToCart(@PathVariable int id) {
        if (cart.add(id)) {
            return PizzaFactory.getMenu(id).getName() + " is added successfully.";
        } else {
            return "menu is unavailable";
        }

    }

    @RequestMapping({"/cart"})
    String viewCart() {
        if (cart.size() != 0) {

            String listc = "menu"+Arrays.deepToString(cart.toArray());
            return listc;
        } else {
            return "empty";
        }

    }
    @RequestMapping({"/clear"})
    String clear() {
        cart.clear();
        return "Cart is cleared";
    }
    @RequestMapping({"/save"})
    String save(){
        Gson gson = new Gson();

        // convert java object to JSON format,
        // and returned as JSON formatted string
        String json = gson.toJson(cart);

        try {
            //write converted json data to a file named "CountryGSON.json"
            FileWriter writer = new FileWriter("ggg.json");
            writer.write(json);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "seve";
    }

}
