package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Pergunta4Activity extends AppCompatActivity {

    Button buttonAvancarP4;
    CheckBox checkBoxCapitalP4, checkBoxThorP4, checkBoxViuvaP4, checkBoxDeadpoolP4, checkBoxSupermanP4, checkBoxHomemP4, checkBoxWolverineP4;
    TextView textViewAnonimoP4;
    int i;
    String Usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta4);

        buttonAvancarP4 = findViewById(R.id.buttonAvancarP4);
        textViewAnonimoP4 = findViewById(R.id.textViewAnonimoP4);
        checkBoxCapitalP4 = findViewById(R.id.checkBoxCapitaoP4);
        checkBoxHomemP4 = findViewById(R.id.checkBoxHomemP4);
        checkBoxThorP4 = findViewById(R.id.checkBoxThorP4);
        checkBoxViuvaP4 = findViewById(R.id.checkBoxViuvaP4);
        checkBoxDeadpoolP4 = findViewById(R.id.checkBoxDeadpoolP4);
        checkBoxSupermanP4 = findViewById(R.id.checkBoxSupermanP4);
        checkBoxWolverineP4 = findViewById(R.id.checkBoxWolverineP4);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Usuario = bundle.getString("Usuario");
        i = bundle.getInt("i");

        if(!Usuario.equals("")){
            textViewAnonimoP4.setText(Usuario);
        }

        buttonAvancarP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBoxCapitalP4.isChecked() && checkBoxThorP4.isChecked() && checkBoxViuvaP4.isChecked() && checkBoxSupermanP4.isChecked() &&
                        !checkBoxDeadpoolP4.isChecked() && !checkBoxHomemP4.isChecked() && !checkBoxWolverineP4.isChecked()){
                    Toast.makeText(Pergunta4Activity.this, "Acertoou!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Pergunta4Activity.this, ConclusaoActivity.class);
                    intent.putExtra("i", i);
                    intent.putExtra("Usuario", Usuario);
                    startActivity(intent);
                }
                else{
                    i++;
                    Toast.makeText(Pergunta4Activity.this, "Erroou!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}