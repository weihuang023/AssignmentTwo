package com.example.huang.assignmenttwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {
/**
 * If you want to change Picture, go to res/drawable then copy and paste the file
 * If you want to change text in about class. go to res/values/strings then edit text
 * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button aboutButton = (Button) findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(this);
        Button exitButton = (Button) findViewById(R.id.exitButton);
        exitButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.exitButton:
                finish();
                break;
            case R.id.aboutButton:
                Intent i = new Intent(this, About.class);
                startActivity(i);
                break;
        }
    }
}
