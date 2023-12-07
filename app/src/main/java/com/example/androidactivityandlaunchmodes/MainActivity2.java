package com.example.androidactivityandlaunchmodes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this, "On create  method called ", Toast.LENGTH_SHORT).show();
    }

    public void LaunchAnotherActivity(View view){
        startActivity(new Intent(this,MainActivity.class));
    }

    public void LaunchThisActiviy(View view) {
        startActivity(new Intent(this, MainActivity2.class));


    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Toast.makeText(this, "On new intent method called ", Toast.LENGTH_SHORT).show();
    }
}