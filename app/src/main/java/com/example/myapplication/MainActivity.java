package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCaptura = findViewById(R.id.btnCadastrar);
        EditText getnome = findViewById(R.id.Nome);
        EditText getIdade = findViewById(R.id.idade);
        EditText getCPF =  findViewById(R.id.CPF);
        EditText getEmail = findViewById(R.id.email);

        btnCaptura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = getnome.getText().toString();
                String idade = getIdade.getText().toString();
                String CPF = getCPF.getText().toString();
                String Email = getEmail.getText().toString();
                Intent tela = new Intent(getApplicationContext(), Dados.class);
                tela.putExtra("nome", nome);
                tela.putExtra("idade", idade);
                tela.putExtra("CPF", CPF);
                tela.putExtra("Email", Email);

                startActivity(tela);
            }
        });
    }
}