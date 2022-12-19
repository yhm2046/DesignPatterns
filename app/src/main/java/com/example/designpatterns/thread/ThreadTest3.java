package com.example.designpatterns.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//实现Callble接口创建线程
public class ThreadTest3 {

    public static void main(String[] args){
        var thread3 = new ThreadTest3();
        FutureTask<Integer> task = new FutureTask<>((Callable<Integer>)() -> {
            var i = 0;
            for(;i < 10; i++){
                System.out.println(Thread.currentThread().getName() + " " + i + " is running");
            }
            return i;
        });
        for(var i = 0; i < 100; i++){
            System.out.println("current Thread name:" + Thread.currentThread().getName() + " " + i);
            if(i == 20){
                new Thread(task,"had return value thread").start();	//i是连续的,共享target
            }
        }
        try{
            System.out.println("sub thread return value:" + task.get());
        }catch(Exception e){

            e.printStackTrace();
        }
    }
}