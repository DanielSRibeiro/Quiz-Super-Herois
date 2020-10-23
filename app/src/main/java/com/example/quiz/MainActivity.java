package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonAvancar;
    EditText editTextUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAvancar = findViewById(R.id.buttonAvancar);
        editTextUsuario = findViewById(R.id.editTextUsuario);

        buttonAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Pergunta1Activity.class);
                intent.putExtra("Usuario", editTextUsuario.getText().toString());
                startActivity(intent);
            }
        });
    }
}