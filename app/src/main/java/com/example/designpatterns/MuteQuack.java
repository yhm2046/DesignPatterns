package com.example.designpatterns;

/**
 * 不会呱呱叫
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("不会呱呱叫");
    }
}
