package com.simduck.model;

public abstract class Duck {
    public void quack(){
        System.out.println("I can do quack!");
    }

    public void swim(){
        System.out.println("I can swim!");
    }

    public abstract void display();
}
