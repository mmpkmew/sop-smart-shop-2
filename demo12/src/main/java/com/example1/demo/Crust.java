package com.example1.demo;

public class Crust {
    private int id;
    private String crust;
    private String[] ALL_Crust = new String[]{
            "Pan",
            "Crispy Thin",
            "Extreme Cheese Crust"
    };

    public Crust(int list) {
        this.id = list;
    }

    public void setCrust(int num) {
        if (num < 0 || num >= this.ALL_Crust.length) {
            this.id = 0;
            this.crust = ALL_Crust[0];
        } else {
            this.id = num;
            this.crust = ALL_Crust[this.id];
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }
}