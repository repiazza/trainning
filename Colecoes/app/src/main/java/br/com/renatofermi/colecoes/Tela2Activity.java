package br.com.renatofermi.colecoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 100; i++){
            list.add("Item: " + i);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
            Tela2Activity.this,
            android.R.layout.simple_list_item_1,
//                android.R.layout.simple_list_item_single_choice,
            list
        );
        ListView lsvFrutas = findViewById(R.id.lsvFrutas);

        lsvFrutas.setAdapter(adapter);

        lsvFrutas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(Tela2Activity.this, "Clique no item " + position, Toast.LENGTH_LONG).show();
            }
        });
    }
}
