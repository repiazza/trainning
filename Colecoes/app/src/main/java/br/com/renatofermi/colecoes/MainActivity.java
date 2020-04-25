package br.com.renatofermi.colecoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Selecione uma fruta");
        listaFrutas.add("Banana");
        listaFrutas.add("Uva");
        listaFrutas.add("Melancia");
        listaFrutas.add("Tangerina");
        listaFrutas.add("Morango");
        listaFrutas.add("Amora");
        listaFrutas.add("Laranja");
        listaFrutas.add("Maracuja");

        // Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item,
                listaFrutas
        );
        // Instanciar os componentes
        Spinner  spnFrutas     = findViewById(R.id.spnFrutas);
        final TextView txvFrutas = findViewById(R.id.txvFrutas);

        // Adicionando o adapter ao spinner
        spnFrutas.setAdapter(adapter);

        // Listener para selecao do combo
        spnFrutas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                txvFrutas.setText(item);
                txvFrutas.setTextColor(getColor(R.color.colorPrimaryDark));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // Clique do botao
        findViewById(R.id.btnTela1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Tela2Activity.class));
            }

        });
    }
}
