package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConclusaoActivity extends AppCompatActivity {

    Button buttonVoltar;
    TextView textViewAnonimoC, textViewI, textViewV;
    int i;
    String Usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conclusao);

        buttonVoltar = findViewById(R.id.buttonVoltar);
        textViewI = findViewById(R.id.textViewI);
        textViewAnonimoC = findViewById(R.id.textViewAnonimoC);
        textViewV = findViewById(R.id.textViewV);

        final Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        i = bundle.getInt("i");
        Usuario = bundle.getString("Usuario");

        if(!Usuario.equals("")){
            textViewAnonimoC.setText(Usuario);
        }
        if (i >1){
            textViewV.setText(" Vezes");
        }

        textViewI.setText(i+"");

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConclusaoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}