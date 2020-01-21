package com.royeth.mymapsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.assist.AssistStructure;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = "MainActivity";

    public float usrLongitude;
    public float usrLatitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText userLongitude = findViewById(R.id.longitudeet);
        // float usrLongitude = Float.valueOf(userLongitude.getText().toString());

        Button submitLocation = findViewById(R.id.submitbtn);

        submitLocation.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        usrLongitude = Float.valueOf(((EditText) findViewById(R.id.longitudeet)).getText().toString());
        usrLatitude = Float.valueOf(((EditText) findViewById(R.id.latitudeet)).getText().toString());
        startActivity(new Intent(getApplicationContext(), MapsActivity.class));
    }
}
