package com.example.designpatterns.thread;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.designpatterns.MallardDuck;
import com.example.designpatterns.R;
import com.example.designpatterns.RubberDuck;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}