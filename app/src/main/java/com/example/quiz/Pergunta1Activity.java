package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Pergunta1Activity extends AppCompatActivity {

    RadioButton radioButtonVingadoresP1;
    Button buttonAvancarP1;
    TextView textViewAnonimo;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta1);

        buttonAvancarP1 = findViewById(R.id.buttonAvancarP1);
        radioButtonVingadoresP1 = findViewById(R.id.radioButtonVingadoresP1);
        textViewAnonimo = findViewById(R.id.textViewAnonimo);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String Usuario = bundle.getString("Usuario");

        if(!Usuario.equals("")){
            textViewAnonimo.setText(Usuario);
        }

        buttonAvancarP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButtonVingadoresP1.isChecked()){
                    Intent intent = new Intent(Pergunta1Activity.this, Pergunta2Activity.class);
                    intent.putExtra("i",i);
                    intent.putExtra("Usuario", textViewAnonimo.getText().toString());
                    startActivity(intent);
                    Toast.makeText(Pergunta1Activity.this, "Acertoou", Toast.LENGTH_SHORT).show();
                }
                else{
                    i++;
                    Toast.makeText(Pergunta1Activity.this, "Erroou", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}