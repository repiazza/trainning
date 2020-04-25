package br.com.renatofermi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        //Instanciar
        TextView txvTela2 = findViewById(R.id.txvTela2);
        Button   btnTela2 = findViewById(R.id.btnTela2);
        final EditText edtNome = findViewById(R.id.edtNome);

        //Recuperar o texto da intent
        String texto = getIntent().getStringExtra("texto");
        txvTela2.setText(texto);
        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperando o texto digitado
                String nome = edtNome.getEditableText().toString().trim();

                // Intent
                Intent intentTela3 =  new Intent(Tela2Activity.this, Tela3Activity.class);

                // Bundle
                Bundle bundle = new Bundle();
                bundle.putString("nome", "Seja bem vindo(a):\n" + nome);

                intentTela3.putExtras(bundle);
                startActivity(intentTela3);
            }
        });
    }
}
