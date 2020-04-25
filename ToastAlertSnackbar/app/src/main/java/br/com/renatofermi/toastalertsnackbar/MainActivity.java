package br.com.renatofermi.toastalertsnackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    final String TAG = "showAlert => ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnToast:
                showToast();
                break;
            case R.id.btnAlert:
                showAlert();
                break;
            case R.id.btnSnackbar:
                showSnackbar(view);
                break;
        }
    }
    @SuppressLint("ShowToast")
    private void showToast(){
        // Toast
        Toast.makeText(MainActivity.this, R.string.toast_text, Toast.LENGTH_LONG);
    }
    private void showAlert(){

        new AlertDialog.Builder(MainActivity.this)
            .setTitle(R.string.alert_text)
            .setMessage(R.string.alert_message)
            .setCancelable(false)
            .setPositiveButton(getString(R.string.alert_ok), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Log.i(TAG, "Botao OK clicado.");
                }
            })
            .setNegativeButton(R.string.alert_nok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Log.i(TAG, "Botao NAO OK clicado.");
                }
            })
            .setNeutralButton(R.string.alert_cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Log.i(TAG, "Botao Cancel(neutro) clicado.");
                }
            })
            .create()
            .show();
       // Alert;
    }
    private void showSnackbar(View view){
        //   Snack;
        Snackbar.make(view, getString(R.string.snack_text), Snackbar.LENGTH_INDEFINITE)
                .setAction(getString(R.string.snack_action), new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i(TAG, "Clique do Snackbar");
                    }
                }).show();


    }
}


