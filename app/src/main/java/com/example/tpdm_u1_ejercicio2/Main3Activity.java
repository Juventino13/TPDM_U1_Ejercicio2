package com.example.tpdm_u1_ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
EditText n1, n2 ;
Button mayor,menor;
TextView eti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        n1.findViewById(R.id.valor1);
        n2.findViewById(R.id.valor2);
        mayor.findViewById(R.id.mayor);
        menor.findViewById(R.id.menor);
        eti.findViewById(R.id.resultado);

        mayor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarMayor();
            }
        });


        menor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarMenor();
            }
        });
    }

    private void buscarMayor(){
        int val1, val2 ;
        val1 = Integer.parseInt(n1.getText().toString());
        val2 = Integer.parseInt(n2.getText().toString());

        if(val1>val2) {
            eti.setText("El numero  "+val1+" es mayor que "+val2);
        }else{
            eti.setText("El numero  "+val2+" es mayor que "+val1);
            }
    }

    private void buscarMenor(){
        int val1,val2;
        val1 = Integer.parseInt(n1.getText().toString());
        val2 = Integer.parseInt(n2.getText().toString());

        if (val1<=val2){
            eti.setText("El numero"+val1+"es menor o igual a "+val2);
        }else{
            eti.setText("El numero"+val2+"es menor o igual a "+val1);
        }
    }
}
