package br.com.renatofermi.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tela2Fragment extends Fragment {

    public Tela2Fragment() {  } // Required empty public constructor

    private EditText edtTela1;
    private Button btnTela1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tela2, container, false);
        bindView(view);
        capture();
        // Inflate the layout for this fragment
        return view;
    }

    private void clickTela2(){
        btnTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                assert fragmentManager != null;
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.container, new Tela1Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }


    private void bindView(View view) {
        edtTela1 = view.findViewById(R.id.edtTexto);
        btnTela1 = view.findViewById(R.id.btnTela1);
    }

    private void capture(){
        String texto = edtTela1.getEditableText().toString().trim();
        if ( texto.isEmpty() ){
            edtTela1.setError("Campo Obrigatorio");
            edtTela1.requestFocus();
        }
        else{
            Bundle bundle = new Bundle();
        }
    }

}
