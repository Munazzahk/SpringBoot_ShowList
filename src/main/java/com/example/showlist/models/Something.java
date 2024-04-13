package com.example.showlist.models;

public class Something {
    private int id;
    private String text;
    private double decimal;

    public Something(int id, String text, double decimal) {
        this.decimal = decimal;
        this.id = id;
        this.text = text;
    }

    public Something() {
    }

    public int getId() {
        return id;
    }

    public double getDecimal() {
        return decimal;
    }

    public String getText() {
        return text;
    }
}
