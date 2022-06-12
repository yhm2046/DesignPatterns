package com.example.designpatterns;

/**
 * 橡皮鸭
 */
public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭！");
    }
}
