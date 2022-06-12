package com.example.designpatterns;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("实现鸭子飞行");
    }
}
