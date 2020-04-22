package com.gmail.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLinearLayoutSample(View view) {
        Intent intent = new Intent(this, LinearActivity.class);
        startActivity(intent);
    }

    public void showConstraintLayoutSample(View view) {
        Intent intent = new Intent(this, ConstraintActivity.class);
        startActivity(intent);
    }
}
