package com.codeclan.example.cards;

public class Card {

    private  String name;
    private  int value;
    private  String shape;

    public Card(String name, int value, String shape){
        this.name = name;
        this.value = value;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getShape() {
        return shape;
    }
}
