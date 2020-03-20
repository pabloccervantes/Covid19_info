package com.covid19.covid19info;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    //------------------------------------------------------
    //----------------Variables de texto--------------------
    //------------------------------------------------------
    private TextView texto1;
    private TextView texto2;
    private ImageView imagen;
    //------------------------------------------------------
    //------------------------------------------------------
    //------------------------------------------------------

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_resultados);
        //------------------------------------------------
        texto1 = findViewById(R.id.textView);
        texto2 = findViewById(R.id.textView4);
        imagen = findViewById(R.id.imageView9);
        //Obtener dato de activity preguntas
        String respuesta = getIntent().getStringExtra("respuesta");
        //De acuerdo a contador
        if(respuesta.equals("N")){
            //PREVENCIÓN
            imagen.setImageResource(R.mipmap.escudo);
            texto1.setText("En tu caso no pareciera haber sospecha de infección por coronavirus.");
            texto2.setText("Consulta a tu médico en caso de presentar molestias, también es importante que recuerdes las medidas de prevención y si requieres más información comunicate a los números especializados correspondientes a tu país.");
        }
        if(respuesta.equals("T")){
            //PREVENCIÓN y CUIDADO
            imagen.setImageResource(R.mipmap.proteger);
            texto1.setText("En tu caso no pareciera haber sospecha de infección por coronavirus.");
            texto2.setText("Es importante que consultes a tu médico para evaluar la causa de tus molestias, también es importante que recuerdes las medidas de prevención y si requieres más información comunicate a los números especializados correspondientes a tu país.");
        }
        if (respuesta.equals("S")) {
            //ALERTA
            imagen.setImageResource(R.mipmap.alerta);
            texto1.setText("En tu caso podría haber sospecha de infección por coronavirus.");
            texto2.setText("No te alarmes, es importante para definir los pasos a seguir que acudas a tu unidad de salud más cercana y llames a los números especializados correspondientes a tu país.");
        }
    }

    public void volver_a_menu_principal(View view) {
        this.finish();
    }

    public void abrir_activity_telefonos(View view) {
        Intent intent = new Intent (view.getContext(), Telefonos.class);
        startActivityForResult(intent, 0);
    }

    public void abrir_activity_prevencion(View view) {
        Intent intent = new Intent (view.getContext(), Prevencion.class);
        startActivityForResult(intent, 0);
    }

}
