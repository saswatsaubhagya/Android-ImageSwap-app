package com.example.iamgeswap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public  void change(View view){
        ImageView cat1 = (ImageView) findViewById(R.id.cat1);
        ImageView cat2 = (ImageView) findViewById(R.id.cat2);
        if (cat1.getAlpha()==1f){
            cat2.setAlpha(1f);
            cat1.setAlpha(0f);
        }
        else{
            cat2.setAlpha(0f);
            cat1.setAlpha(1f);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
