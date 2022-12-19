package com.example.designpatterns;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        策略模式：鸭子-绿头鸭
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack(); //使用代理委托方式调用叫声和飞行
        mallardDuck.performFly();
//        mallardDuck.quackBehavior.quack();    //使用Duck内的叫声和飞行
//        mallardDuck.flyBehavior.fly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quackBehavior.quack();
        rubberDuck.flyBehavior.fly();
    }
}