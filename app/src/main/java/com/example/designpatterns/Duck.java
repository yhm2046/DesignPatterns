package com.example.designpatterns;

/**
 * 鸭子类
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void performQuack(){ //实现叫声委托
        quackBehavior.quack();
    }
    public void performFly(){//实现飞行委托
        flyBehavior.fly();
    }
    public void display(){};
}
