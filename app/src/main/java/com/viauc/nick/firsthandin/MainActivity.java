package com.viauc.nick.firsthandin;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
//    public void Sensor(View View) {
//        Intent startNewActivity = new Intent(this, Sensor.class);
//        startActivity(startNewActivity);
//    }
    //Toast Sensor/Map

    public void SensorToast(View view) {
        Context context = getApplicationContext();
        CharSequence text="This is a Sensor";
        int duration= Toast.LENGTH_SHORT;

        Toast toast=Toast.makeText(context, text, duration);
        toast.show();
    }

    //Toast Map
    public void MapToast(View view) {
        Context context = getApplicationContext();
        CharSequence text="This is a Map";
        int duration= Toast.LENGTH_SHORT;

        Toast toast=Toast.makeText(context,text,duration);
        toast.show();
    }

}
