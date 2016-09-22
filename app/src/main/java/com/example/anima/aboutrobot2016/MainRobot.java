package com.example.anima.aboutrobot2016;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainRobot extends Activity {

    private Button btn;
    private TextView txt;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_robot);

        btn = (Button) findViewById(R.id.btn);
        txt = (TextView) findViewById(R.id.txt);

        contador = 0;

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                contador++;

                txt.setText(R.string.txt2);

                if (contador > 0){
                    btn.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
