package com.example.designpatterns;

/**
 * 橡皮鸭子呱呱叫
 */
public class Squeak implements QuackBehavior {
    public void quack(){
        System.out.println("橡皮鸭子呱呱叫");
    }
}
