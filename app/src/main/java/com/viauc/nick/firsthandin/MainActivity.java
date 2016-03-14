package com.viauc.nick.firsthandin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonOnClick(View v){
        //do something when the button is clicked
        Button button=(Button) v;
        ((Button) v).setText("clicked");
    }
    //Information start
    public void LaunchInformation(View View){
        Intent startNewActivity = new Intent(this, LaunchInformation.class);
        startActivity(startNewActivity);
    }
    //Camera start
    public void Camera(View View) {
        Intent startNewActivity = new Intent(this, Camera.class);
        startActivity(startNewActivity);
    }
    //Toast Sensor/Map
    public void Sensor(View view) {
        Toast.makeText(this, "This is a Sensor", Toast.LENGTH_SHORT).show();}
    //Toast Map
    public void Map(View view) {
        Toast.makeText(this, "This is a Map", Toast.LENGTH_SHORT).show();}

}
