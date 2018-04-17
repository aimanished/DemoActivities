package com.example.a16031940.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DemoActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities);

        Button btnDone = (Button) findViewById(R.id.btn);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etname = (EditText)findViewById(R.id.NameText);
                EditText etage = (EditText)findViewById(R.id.age);

                String[] info = {etname.getText().toString() , etage.getText().toString()};

                Intent i = new Intent(getBaseContext(), DemoActivities2.class);
                i.putExtra("info" , info);
                startActivity(i);
            }
        });
    }
}
