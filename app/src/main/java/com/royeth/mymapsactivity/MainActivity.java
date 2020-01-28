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

    private float usrLongitude;
    private float usrLatitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText userLongitude = findViewById(R.id.longitudeet);
        // float usrLongitude = Float.valueOf(userLongitude.getText().toString());

        Button submitLocation = findViewById(R.id.submitbtn);

        submitLocation.setOnClickListener(this);
    }

    public void Coord(){
        this.usrLongitude = Float.valueOf(((EditText) findViewById(R.id.longitudeet)).getText().toString());
        this.usrLatitude = Float.valueOf(((EditText) findViewById(R.id.latitudeet)).getText().toString());
    }

    public float getLongitude(){
        return this.usrLongitude;
    }
    public float getLatitude(){
        return this.usrLatitude;
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(), MapsActivity.class));
    }


}
