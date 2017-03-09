package com.elicastrillon.resistencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button eNegro,eMarron,eRojo,eNaranjado,eAmarillo,eVerdeClaro,eAzul,ePurpura,eGris,eBlanco,eCalcular,eLimpiar,eSalir;
    Button eTMarron,eTRojo,eTDorado,eTPlateado;
    TextView texValor,texValorT;
    String i;
    Double total=0.0;
    int j = 1,n=1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        eNegro = (Button) findViewById(R.id.eNegro);
        eMarron = (Button) findViewById(R.id.eMarron);
        eRojo = (Button) findViewById(R.id.eRojo);
        eNaranjado = (Button) findViewById(R.id.eNaranjado);
        eAmarillo = (Button) findViewById(R.id.eAmarillo);
        eVerdeClaro = (Button) findViewById(R.id.eVerdeClaro);
        eAzul = (Button) findViewById(R.id.eAzul);
        ePurpura = (Button) findViewById(R.id.ePurpura);
        eGris = (Button) findViewById(R.id.eGris);
        eBlanco = (Button) findViewById(R.id.eBlanco);
        eCalcular = (Button) findViewById(R.id.eCalcular);
        eAzul = (Button) findViewById(R.id.eLimpiar);
        eSalir = (Button) findViewById(R.id.eSalir);
        texValor = (TextView) findViewById(R.id.texValor);
        texValorT = (TextView) findViewById(R.id.texValorT);
        eLimpiar = (Button)findViewById(R.id.eLimpiar);
        eTMarron = (Button)findViewById(R.id.eTMarron);
        eTRojo = (Button)findViewById(R.id.eTRojo);
        eTDorado = (Button)findViewById(R.id.eTDorado);
        eTPlateado  = (Button)findViewById(R.id.eTPlateado);



        eTMarron.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

              texValorT.setText("+_ 1%");

            }
        });
          eTRojo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                texValorT.setText("+_ 2%");

            }
        });
       eTDorado .setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                texValorT.setText("+_ 5%");

            }
        });


      eTPlateado.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                texValorT.setText("+_ 10%");

            }
        });









        //
        eCalcular.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v) {
                try {
                    total = Double.parseDouble(texValor.getText().toString());
                }catch (Exception e){}


                      if (n == 1) {
                          try { texValor.setText(String.valueOf(total)); }catch (Exception e){}

                      } else if (n == 10) {
                          try { texValor.setText(String.valueOf(10 * total));}catch (Exception e){}

                      } else if (n == 100) {
                          try {  texValor.setText(String.valueOf(100 * total));}catch (Exception e){}

                      } else if (n == 1000) {
                          try {  texValor.setText(String.valueOf(1000 * total));}catch (Exception e){}

                      } else if (n == 10000) {
                          try {   texValor.setText(String.valueOf(10000 * total));}catch (Exception e){}

                      } else if (n == 100000) {
                          try {   texValor.setText(String.valueOf(100000 * total));}catch (Exception e){}

                      } else if (n == 1000000) {
                          try {    texValor.setText(String.valueOf(1000000 * total));}catch (Exception e){}

                      } else if (n == 11) {
                          try {    texValor.setText(String.valueOf(total / 10));}catch (Exception e){}

                      } else {
                          try {     texValor.setText(String.valueOf(total / 1000));}catch (Exception e){}

                      }


            }
        });

        eSalir.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.exit(0);

            }
        });

        eLimpiar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                j = 1;
                n=1 ;
                texValor.setText("");
                texValorT.setText("");
            }
        });


    }

    // accion al presional un boton

    @Override
    public void onClick(View v) {
        int id = v.getId();


        // primeros tres valores
        if(j<=2) {


            switch (id) {
                case R.id.eNegro:
                    i = "0";
                    break;
                case R.id.eMarron:
                    i = "1";
                    break;
                case R.id.eRojo:
                    i = "2";
                    break;

                case R.id.eNaranjado:
                    i = "3";
                    break;
                case R.id.eAmarillo:
                    i = "4";
                    break;
                case R.id.eVerdeClaro:
                    i = "5";
                    break;

                case R.id.eAzul:
                    i = "6";
                    break;
                case R.id.ePurpura:
                    i = "7";
                    break;
                case R.id.eGris:
                    i = "8";
                    break;
                case R.id.eBlanco:
                    i = "9";
                    break;

            }

            try {
                texValor.setText(texValor.getText().toString() + i);
            } catch (Exception e) {
            }

        }else {}

        // hacer nulo el string de almacenamiento

        if(j==3) {
            i=null;

        }else {

        }

        // multiplicador
        if(j==3){
            switch (id) {
                case R.id.eNegro:
                    n=1;
                    break;
                case R.id.eMarron:
                    n=10;
                    break;
                case R.id.eRojo:
                    n=100;
                    break;

                case R.id.eNaranjado:
                    n=1000;
                    break;
                case R.id.eAmarillo:
                    n =10000;
                    break;
                case R.id.eVerdeClaro:
                    n = 100000;
                    break;

                case R.id.eAzul:
                    n = 1000000;
                    break;
                case R.id.ePurpura:
                    n /= 10;
                    break;
                case R.id.eGris:
                    n /=1000;
                    break;


            }
        }

        j=j+1;


    }


        }
