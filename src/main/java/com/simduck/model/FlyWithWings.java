package com.simduck.model;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly with my wings");
    }
}
