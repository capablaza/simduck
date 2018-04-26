package com.simduck.model;

public class RealGreenDuck extends Duck{

    public RealGreenDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm Real Green Duck!");
    }
}
