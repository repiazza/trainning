package br.com.renatofermi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Tela3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        Bundle bundle = getIntent().getExtras();
        String nome = bundle.getString("nome");

        TextView txvTela3 = findViewById(R.id.txvTela3);
        txvTela3.setText(nome);
    }
}
