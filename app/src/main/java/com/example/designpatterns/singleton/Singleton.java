package com.example.designpatterns.singleton;

/**
 * 单例模式
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}   //禁止外部new

    public static Singleton getInstance() { //唯一获取访问点
        if(null == instance)
            instance = new Singleton();
        return instance;
    }
}
