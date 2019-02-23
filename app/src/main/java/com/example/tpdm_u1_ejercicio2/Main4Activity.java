package com.example.tpdm_u1_ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
EditText cantidadB;
Button generarB,borrarB;
LinearLayout layo;
int i2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        borrarB =findViewById(R.id.eliminarbotones);
        generarB = findViewById(R.id.agregaboton);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

//eleimar botones dinamico(0);
    private void generarBotonesDinamicos(){
        eliminarBotonesDinamicos( 1 );
        int cantidad = Integer.parseInt(cantidadB.getText().toString());
        vectorBotones= new Button[cantidad];

        for(int i=0; i<vectorBotones.length; i++){
            i2=i;
            vectorBotones[i]= new Button(this);
            vectorBotones[i].setText("Boton numero "+(i+1));
            layo.addView(vectorBotones[i]);
            vectorBotones[i].setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Toast.makeText(Main4Activity.this, "alerta"+i2,Toast.LENGTH_LONG)
                            .show();
                }
            });
        }
    }
    public void eliminarBotonesDinamicos( int w) {
        if (vectorBotones = null ) {
            if (w==0){
                Toast.makeText(this, "primero crea!", Toast.LENGTH_LONG).show();
//COMO EN UN ALERT PUEDO AGREGAR VIEWS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            }
               return;

        }
        layo.removeViews(3, vectorBotones.lenght);
        vectoresBotones=null;
    }
}
