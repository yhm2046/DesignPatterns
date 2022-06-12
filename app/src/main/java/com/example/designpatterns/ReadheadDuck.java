package com.example.designpatterns;

/**
 * 红头鸭
 */
public class ReadheadDuck extends Duck{
    public ReadheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是真正的红头鸭！");
    }
}
