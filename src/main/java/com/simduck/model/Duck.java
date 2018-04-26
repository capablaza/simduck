package com.simduck.model;

public abstract class Duck {
    public void quack(){
        System.out.println("I can do quack!");
    }

    public void swim(){
        System.out.println("I can swim!");
    }

    public void fly(){
        System.out.println("I can fly");
    }

    public abstract void display();
}
