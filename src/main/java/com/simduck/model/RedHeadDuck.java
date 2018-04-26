package com.simduck.model;

public class RedHeadDuck extends Duck  implements Quackable, Flyable {

    public void quack() {
        System.out.println("I can do quack!");
    }

    public void fly() {
        System.out.println("I can fly");
    }

    public void display() {
        System.out.println("I'm RealHeadDuck");
    }
}
