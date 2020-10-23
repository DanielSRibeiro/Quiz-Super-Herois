package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Pergunta3Activity extends AppCompatActivity {

    Button buttonAvancarP3;
    RadioButton radioButtonBatmanP3;
    TextView textViewAnonimo;
    String Usuario;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta3);

        buttonAvancarP3 = findViewById(R.id.buttonAvancarP3);
        radioButtonBatmanP3 = findViewById(R.id.radioButtonBatmanP3);
        textViewAnonimo = findViewById(R.id.textViewAnonimo);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Usuario = bundle.getString("Usuario");
        i = bundle.getInt("i");

        if(!Usuario.equals("")){
            textViewAnonimo.setText(Usuario);
        }

        buttonAvancarP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButtonBatmanP3.isChecked()){
                    Toast.makeText(Pergunta3Activity.this, "Acertoou!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Pergunta3Activity.this, Pergunta4Activity.class);
                    intent.putExtra("i",i);
                    intent.putExtra("Usuario",textViewAnonimo.getText().toString());
                    startActivity(intent);
                }
                else {
                    i++;
                    Toast.makeText(Pergunta3Activity.this, "Erroou!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}