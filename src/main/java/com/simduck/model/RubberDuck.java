package com.simduck.model;

public class RubberDuck extends Duck{

    @Override
    public void fly() {
        System.out.println("I  can't fly");
    }

    public void display() {
        System.out.println("I'm RubberDuck!");
    }
}
