package com.example.designpatterns;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子不会飞行");
    }
}
