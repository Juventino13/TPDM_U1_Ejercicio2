package com.example.tpdm_u1_ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

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
            case.R.id.agregaboton:
                break;
                case.R.id.agregarcampo:
            break;
             case.R.id.agregaretiqueta:
            break;

            case.R.id.quitar:
            break;

        }
        return super.onOptionsItemSelected(item);
    }
}
