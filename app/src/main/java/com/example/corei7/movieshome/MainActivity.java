package com.example.corei7.movieshome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.Peliculas;

public class MainActivity extends AppCompatActivity {

    Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.);

                siguiente=(Button)findViewById(android.R.id.button1);
                siguiente.setOnClickListener(new View.OnClickListener(){
                                                 @Override
                                                 public void onClick(View v){
                                                     Intent siguiente = new Intent(MainActivity.this, Peliculas.class);
                                                     startActivity(siguiente);
                                                 }
                                             }

                );
            }

        }





