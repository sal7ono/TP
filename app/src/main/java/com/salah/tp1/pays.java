package com.salah.tp1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pays extends AppCompatActivity {
    private Button choisir;
    private Button annuler ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pays);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        choisir = (Button) findViewById(R.id.choisir);
        choisir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast T1 = Toast.makeText(pays.this, "Angleterre est votre nouvelle destination",
                        Toast.LENGTH_LONG);
                T1.show();
            }
        });
        annuler = (Button) findViewById(R.id.annuler);
        annuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), MainActivity.class);


                startActivity(i1);
            }
        });
    }
}
