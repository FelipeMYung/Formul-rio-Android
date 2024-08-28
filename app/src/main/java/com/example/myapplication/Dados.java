package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Dados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        TextView txtNome = findViewById(R.id.telaNome);
        TextView txtIdade = findViewById(R.id.telaIdade);
        TextView txtCPF = findViewById(R.id.telaCPF);
        TextView txtEmail = findViewById(R.id.telaEmail);
        Intent intent = getIntent();
        String MsgNome = intent.getStringExtra("nome");
        String MsgIdade = intent.getStringExtra("idade");
        String MsgCPF = intent.getStringExtra("CPF");
        String MsgEmail = intent.getStringExtra("Email");

        txtNome.setText(MsgNome);
        txtIdade.setText(MsgIdade);
        txtCPF.setText(MsgCPF);
        txtEmail.setText(MsgEmail);
    }
}