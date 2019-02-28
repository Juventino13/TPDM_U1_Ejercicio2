package com.example.tpdm_u1_ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
LinearLayout layin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        layin = findViewById(R.id.layoutdinamico);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menudinamico,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.agregaboton:
                agregarBoton();
                break;
            case R.id.agregarcampo:
                agregarCampo();
                break;
            case R.id.regresar:
                finish();
                break;
            case R.id.quitar:
                quitarObjeto();
                break;
            case R.id.agregaretiqueta:
                agregarEtiqueta();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    private void agregarBoton(){
        Button boton = new Button(this  );
                boton.setText("BOTON DINAMICO");
                layin.addView(boton);
    }
    //NO SE TIENE REFERENCIA A EL

    public void agregarCampo(){
        EditText campotexto = new EditText(this);
        campotexto.setText("Campo de texto dinamico");
        layin.addView(campotexto);
        Toast.makeText(Main2Activity.this, "hola", Toast.LENGTH_LONG).show();

    }
    private void agregarEtiqueta(){
        TextView eti= new TextView(this);
        eti.setText("ETIQUETA DINAMICA");
        layin.addView(eti);
    }
    private void quitarObjeto (){
        layin.removeAllViews();
    }
}
