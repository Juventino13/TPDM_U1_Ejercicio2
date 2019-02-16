package com.example.tpdm_u1_ejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView menuppal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menuppal = findViewById(R.id.lista);

        /*Intent a=new intent (ACTIVITYACTUAL,ELQUESEAQUEQUIERAS)
                startActivity (a);
        finish();*/
        menuppal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent a1 = new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(a1);
                        break;
                    case 1:
                        Intent a2 = new Intent(MainActivity.this,Main3Activity.class);
                       startActivity(a2);
                        break;
                    case 2:
                        Intent a3 = new Intent(MainActivity.this,Main4Activity.class);
                        startActivity(a3);
                        break;
                    case 3:
                        break;
                    case 4: finish();
                        break;
                }
            }
        });
    }
}
