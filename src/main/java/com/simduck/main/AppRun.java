package com.simduck.main;

import com.simduck.model.*;

public class AppRun {

    public static void main(String args[]){

        print(new RealGreenDuck());
        print(new RedHeadDuck());
        print(new RubberDuck());

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(new FlyWithWings());
        print(rubberDuck);
    }


    public static void print(Duck duck){
        System.out.println("#########################");
        duck.display();
        duck.swim();
        duck.performQuack();
        duck.performFly();

    }

}
