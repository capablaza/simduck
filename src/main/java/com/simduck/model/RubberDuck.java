package com.simduck.model;

public class RubberDuck extends Duck  implements Quackable , Flyable{

    public void quack() {
        System.out.println("I can do quack!");
    }

    public void fly() {
        System.out.println("I  can't fly");
    }

    public void display() {
        System.out.println("I'm RubberDuck!");
    }
}
