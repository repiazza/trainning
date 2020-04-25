package br.com.renatofermi.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "--- tela 1 ---";

    public void clickTela1(View view){

        if ( view.getId() == R.id.btnTela1 ){
            startActivity(new Intent(MainActivity.this, ActivityTela2.class));
        }
        else{
            onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");

        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }


}
