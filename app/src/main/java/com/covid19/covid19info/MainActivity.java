package com.covid19.covid19info;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    public void abrir_activity_preguntas(View view) {
        Intent intent = new Intent (view.getContext(), Main2Activity.class);
        startActivityForResult(intent, 0);
    }

    public void abrir_activity_prevencion(View view) {
        Intent intent = new Intent (view.getContext(), Prevencion.class);
        startActivityForResult(intent, 0);
    }

    public void abrir_activity_material(View view) {
        Intent intent = new Intent (view.getContext(), Material.class);
        startActivityForResult(intent, 0);
    }

    public void abrir_activity_telefonos(View view) {
        Intent intent = new Intent (view.getContext(), Telefonos.class);
        startActivityForResult(intent, 0);
    }
}
