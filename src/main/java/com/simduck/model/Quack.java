package com.simduck.model;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can do quack");
    }
}
