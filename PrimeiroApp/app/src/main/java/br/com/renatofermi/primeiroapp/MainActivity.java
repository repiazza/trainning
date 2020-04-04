package br.com.renatofermi.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button   btn = findViewById(R.id.button);
        final TextView txv = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( txv.getText().equals("Hello World!") ){
                    txv.setText("Ola mundo");
                }
                else{
                    txv.setText("Hello World!");
                }
            }
        });
    }
}
