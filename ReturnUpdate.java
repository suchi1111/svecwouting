package com.example.admin.myappfencing;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ReturnUpdate extends AppCompatActivity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update);
        button = (Button) findViewById(R.id.update);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "button clicked", Toast.LENGTH_LONG).show();
                //Intent intent = new Intent(context, App2Activity.class);
                //start

            }

        });

    }


}
