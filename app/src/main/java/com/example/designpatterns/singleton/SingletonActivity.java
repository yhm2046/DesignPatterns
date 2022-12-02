package com.example.designpatterns.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.designpatterns.R;
import com.example.designpatterns.databinding.ActivityMainBinding;

/**
 * date:2022.12.2   Friday
 * description: singleton example
 */
public class SingletonActivity extends AppCompatActivity implements View.OnClickListener {
    private Button toolbox;
    private final static String TAG = "SingletonActivity:tag";
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.buttonTop.setOnClickListener(this);
        activityMainBinding.buttonMid.setOnClickListener(this);
        activityMainBinding.buttonBottom.setOnClickListener(this);
//        test singleton,单例模式,保障唯一实例
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2)
            Log.i(TAG,"singleton is the same!");
        else
            Log.i(TAG,"singleton is the different!");
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_top:
                Log.i(TAG,"click btn_top");
                openToolbox();
                break;
            case R.id.button_mid:
                Log.i(TAG,"click btn_mid");
                openToolbox();
                break;
            case R.id.button_bottom:
                Log.i(TAG,"click btn_bottom");
                openToolbox();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }

    @SuppressLint("SetTextI18n")
    private void openToolbox(){
//        Log.i(TAG,"iiiiiiiiiiiii");
        if (null == toolbox ){
            toolbox = new Button(this);
            toolbox.setText("toolBox");
            Log.i(TAG,"build toolbox");
        }
    }
}