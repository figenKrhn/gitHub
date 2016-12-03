package com.example.wn81.merhaba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Turk humanTurk = new Turk();
        Kurt humanKurt=new Kurt();
        Arap humanArap=new Arap();


        humanTurk.speak();
        humanKurt.speak();
        humanArap.speak();

    }
}
