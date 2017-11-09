package com.salah.tp1;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {
    private EditText prenom;
    private EditText nom;
    private EditText mail;
    private EditText tel;
    private Button inscrire ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        prenom = (EditText) findViewById(R.id.prenom) ;
        nom = (EditText) findViewById(R.id.nom);
        mail = (EditText) findViewById(R.id.mail);
        tel = (EditText) findViewById(R.id.tel);

        inscrire = (Button) findViewById(R.id.inscrire);

        inscrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = prenom.getText().toString();
                String s1 = nom.getText().toString();
                String s2 = mail.getText().toString();
                String s3 = tel.getText().toString();

                if (s.isEmpty()) {
                    Toast T = Toast.makeText(MainActivity.this, "Erreur prenom est vide",
                            Toast.LENGTH_LONG);
                    T.show();}
                if (s1.isEmpty()) {
                    Toast T = Toast.makeText(MainActivity.this, "Erreur nom est vide",
                            Toast.LENGTH_LONG);
                    T.show();}
                if (s2.isEmpty()) {
                    Toast T = Toast.makeText(MainActivity.this, "Erreur mail est vide",
                            Toast.LENGTH_LONG);
                    T.show();}
                if (s3.isEmpty()) {
                    Toast T = Toast.makeText(MainActivity.this, "Erreur telephone est vide",
                            Toast.LENGTH_LONG);
                    T.show();}
               else

                    {Intent i1 = new Intent(getApplicationContext(), pays.class);


                startActivity(i1);}

            }
        });


    }
}
