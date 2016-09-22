package com.example.anima.aboutrobot2016;

import android.app.Activity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainRobot extends Activity {

    private Button btn;
    private TextView txt;
    private int contador;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_robot);

        btn = (Button) findViewById(R.id.btn);
        txt = (TextView) findViewById(R.id.txt);
        img = (ImageView) findViewById(R.id.img);

        contador = 0;

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                contador++;

                if(contador == 1){
                    //cambia la imagen
                    img.setImageResource(R.drawable.robot2);
                    //cambia el texto del TextView y del button
                    txt.setText(R.string.txt2);
                    btn.setText(R.string.btn2);
                }

                if(contador == 2){
                    txt.setText(R.string.txt3);
                    //hace invisible el boton
                    btn.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
