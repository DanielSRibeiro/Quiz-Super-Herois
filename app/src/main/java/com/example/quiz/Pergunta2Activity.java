package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Pergunta2Activity extends AppCompatActivity {

    CheckBox checkBoxBatman, checkBoxDeedpool, checkBoxAquaman, checkBoxCapital, checkBoxWolverine, checkBoxFlash;
    CheckBox checkBoxThor;
    TextView textViewAnonimoP2;
    Button buttonAvançarP2;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta2);

        buttonAvançarP2 = findViewById(R.id.buttonAvançarP2);
        textViewAnonimoP2 = findViewById(R.id.textViewAnonimoP2);
        checkBoxBatman = findViewById(R.id.checkBoxBatman);
        checkBoxAquaman = findViewById(R.id.checkBoxAquaman);
        checkBoxDeedpool = findViewById(R.id.checkBoxDeedpool);
        checkBoxCapital = findViewById(R.id.checkBoxCapital);
        checkBoxWolverine = findViewById(R.id.checkBoxWolverine);
        checkBoxFlash = findViewById(R.id.checkBoxFlash);
        checkBoxThor = findViewById(R.id.checkBoxThor);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        final String Usuario = bundle.getString("Usuario");
        i = bundle.getInt("i");

        if(!Usuario.equals("")){
            textViewAnonimoP2.setText(Usuario);
        }

        buttonAvançarP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBoxBatman.isChecked() && checkBoxFlash.isChecked() && checkBoxThor.isChecked()
                        && !checkBoxAquaman.isChecked() && !checkBoxCapital.isChecked() && !checkBoxDeedpool.isChecked() && !checkBoxWolverine.isChecked()){
                    Toast.makeText(Pergunta2Activity.this, "Acertoou!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Pergunta2Activity.this, Pergunta3Activity.class);
                    intent.putExtra("i",i);
                    intent.putExtra("Usuario", textViewAnonimoP2.getText().toString());
                    startActivity(intent);
                }
                else{
                    i++;
                    Toast.makeText(Pergunta2Activity.this, "Erroou!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}