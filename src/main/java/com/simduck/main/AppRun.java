package com.simduck.main;

import com.simduck.model.RealGreenDuck;
import com.simduck.model.RedHeadDuck;
import com.simduck.model.RubberDuck;

public class AppRun {

    public static void main(String args[]){

        print(new RealGreenDuck());
        print(new RedHeadDuck());
        print(new RubberDuck());

    }


    public static void print(RealGreenDuck duck){
        System.out.println();
        duck.swim();
        duck.quack();
        duck.fly();
        duck.display();
    }

    public static void print(RedHeadDuck duck){
        System.out.println();
        duck.swim();
        duck.quack();
        duck.fly();
        duck.display();
    }

    public static void print(RubberDuck duck){
        System.out.println();
        duck.swim();
        duck.quack();
        duck.fly();
        duck.display();
    }
}
