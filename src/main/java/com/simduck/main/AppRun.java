package com.simduck.main;

import com.simduck.model.Duck;
import com.simduck.model.RealGreenDuck;
import com.simduck.model.RedHeadDuck;
import com.simduck.model.RubberDuck;

public class AppRun {

    public static void main(String args[]){

        print(new RealGreenDuck());
        print(new RedHeadDuck());
        print(new RubberDuck());

    }

    private static void print(Duck duck){
        System.out.println();
        duck.swim();
        duck.quack();
        duck.fly();
        duck.display();
    }
}
