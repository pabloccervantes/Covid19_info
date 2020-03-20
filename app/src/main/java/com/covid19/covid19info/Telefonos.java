package com.covid19.covid19info;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Telefonos extends AppCompatActivity {
    //----------------------------------
    //-----Declaracion de textos--------
    //----------------------------------
    TextView textView10;
    TextView textView13;
    TextView textView14;
    TextView textView18;
    TextView textView19;
    TextView textView23;
    TextView textView27;
    TextView textView28;
    TextView textView32;
    TextView textView36;
    TextView textView40;
    TextView textView44;
    TextView textView48;
    TextView textView61;
    TextView textView64;
    //----------------------------------
    //----------------------------------
    //----------------------------------

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_telefonos);
        //--------------------------------------------------------------------------------
        //-------------------------Control de eventos del texto---------------------------
        //--------------------------------------------------------------------------------
        //--------------------
        textView10=(TextView)findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("https://www.argentina.gob.ar/salud");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView13=(TextView)findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("https://coronavirus.saude.gov.br/");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView14=(TextView)findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("https://redcap.saude.gov.br/surveys/?s=TPMRRNMJ3D");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView18=(TextView)findViewById(R.id.textView18);
        textView18.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("http://www.minsal.cl");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView19=(TextView)findViewById(R.id.textView19);
        textView19.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("http://www.saludresponde.cl");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView23=(TextView)findViewById(R.id.textView23);
        textView23.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("http://www.ins.gov.co/Paginas/Inicio.aspx");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView27=(TextView)findViewById(R.id.textView27);
        textView27.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("http://www.citas.med.ec");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView28=(TextView)findViewById(R.id.textView28);
        textView28.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("https://www.salud.gob.ec/");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView32=(TextView)findViewById(R.id.textView32);
        textView32.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("http://www.salud.gob.sv");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView36=(TextView)findViewById(R.id.textView36);
        textView36.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("https://www.mscbs.gob.es/");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView40=(TextView)findViewById(R.id.textView40);
        textView40.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("https://www.cdc.gov/coronavirus/2019-nCoV/index.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView44=(TextView)findViewById(R.id.textView44);
        textView44.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("https://www.gob.mx/salud/documentos/nuevo-coronavirus");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView48=(TextView)findViewById(R.id.textView48);
        textView48.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("http://www.salud.gov.pr/Coronavirus");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView61=(TextView)findViewById(R.id.textView61);
        textView61.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("https://www.mspbs.gov.py/covid-19-viajeros.php#graficos");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------
        textView64=(TextView)findViewById(R.id.textView64);
        textView64.setOnClickListener(new View.OnClickListener() {
            //Sí sólo se pulsa una vez
            public void onClick(View v) {
                Uri url = Uri.parse("http://www.mpps.gob.ve/");
                Intent intent = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intent);
            }
        });
        //--------------------
        //--------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------
    }

    public void volver_activity_principal(View view) {
        this.finish();
    }
}
