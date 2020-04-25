package br.com.renatofermi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Responsavel por apresentar o layout
        setContentView(R.layout.activity_main);

        // Instanciar os componentes visuais
        Button btnTela1 = findViewById(R.id.btnTela1);

        // Criando o clique do botao
        btnTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criar o objeto intent
                Intent intentTela2 = new Intent(MainActivity.this, Tela2Activity.class);
                // Passando parametro para outra tela
                intentTela2.putExtra("texto", "Deu certo.\n Tela 2");
                // Executar a intent
                startActivity(intentTela2);
            }
        });
    }
}
