package com.blockera.blockeraapp;

import android.content.Intent;
import android.media.metrics.Event;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_registrar = findViewById(R.id.tv_registrar);

        tv_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intentRegistrar = new Intent(MainActivity.this, Registro.class);
                MainActivity.this.startActivity(intentRegistrar);
            }
        });

    }
}