package com.example.designpatterns;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是真正的绿头鸭！");
    }
}
