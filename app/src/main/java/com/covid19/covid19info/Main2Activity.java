package com.covid19.covid19info;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.covid19.covid19info.fragments.PageFragment1;
import com.covid19.covid19info.fragments.PageFragment2;
import com.covid19.covid19info.fragments.PageFragment3;
import com.covid19.covid19info.fragments.PageFragment4;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    //Variables pantallas carrusel-----
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    private List<Fragment> list;
    //---------------------------------
    //Variables puntos pantalla--------
    private LinearLayout linearPuntos;
    private TextView[] puntosSlide;
    //---------------------------------

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        //----------------------------------------------------------------------------
        //----------------------Mostrar las pantallas en carrusel---------------------
        //----------------------------------------------------------------------------
        list = new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());
        list.add(new PageFragment4());
        pager = findViewById(R.id.pager);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),list);
        pager.setAdapter(pagerAdapter);
        pager.setOffscreenPageLimit(4);
        //----------------------------------------------------------------------------
        //----------------------------------------------------------------------------
        //----------------------------------------------------------------------------
        //----------------------------------------------------------------------------
        //---------------------------Mostrar puntos de página-------------------------
        //----------------------------------------------------------------------------
        linearPuntos = findViewById(R.id.idLinearPuntos);
        agregarIndicadorPuntos(0);
        pager.addOnPageChangeListener(viewListener);
        //----------------------------------------------------------------------------
        //----------------------------------------------------------------------------
        //----------------------------------------------------------------------------
    }

    //Función que genera y agrega puntos de página
    private void agregarIndicadorPuntos(int pos) {
        puntosSlide = new TextView[4];
        linearPuntos.removeAllViews();
        for(int i=0;i<puntosSlide.length;i++){
            puntosSlide[i] = new TextView(this);
            puntosSlide[i].setText(Html.fromHtml("&#8226;"));
            puntosSlide[i].setTextSize(35);
            puntosSlide[i].setTextColor(getResources().getColor(R.color.colorBlancoTransparente));
            linearPuntos.addView(puntosSlide[i]);
        }
        if(puntosSlide.length>0){
            puntosSlide[pos].setTextColor(getResources().getColor(R.color.blanco));
        }
    }

    ViewPager.OnPageChangeListener viewListener=new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            agregarIndicadorPuntos(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    public void abrir_activity_resultados(View view) {
        //---------------------------------------------------
        //-------Recolectar datos de las preguntas-----------
        //---------------------------------------------------
        String respuesta = "";
        RadioButton radioButton = list.get(0).getActivity().findViewById(R.id.radioButton7);
        boolean ningun_pais_visitado = radioButton.isChecked();
        if(!ningun_pais_visitado){
            //si se visitó un país
            radioButton = list.get(1).getActivity().findViewById(R.id.no_contacto);
            boolean no_contacto_con_personas_infectadas = radioButton.isChecked();
            if(!no_contacto_con_personas_infectadas){
                //Si hubo contacto
                radioButton = list.get(2).getActivity().findViewById(R.id.no_fiebre);
                boolean no_fiebre = radioButton.isChecked();
                if(!no_fiebre){
                    //Si hay fiebre
                    radioButton = list.get(3).getActivity().findViewById(R.id.no_tos);
                    boolean no_tos = radioButton.isChecked();
                    if(!no_tos){
                        //Sí hay tos
                        respuesta = "S";
                    } else {
                        //No hay tos
                        respuesta = "S";
                    }
                } else {
                    //No hay fiebre
                    radioButton = list.get(3).getActivity().findViewById(R.id.no_tos);
                    boolean no_tos = radioButton.isChecked();
                    if(!no_tos){
                        //Sí hay tos
                        respuesta = "T";
                    } else {
                        //No hay tos
                        respuesta = "N";
                    }
                }
            } else {
                //No hubo contacto
                radioButton = list.get(2).getActivity().findViewById(R.id.no_fiebre);
                boolean no_fiebre = radioButton.isChecked();
                if(!no_fiebre){
                    //Si hay fiebre
                    radioButton = list.get(3).getActivity().findViewById(R.id.no_tos);
                    boolean no_tos = radioButton.isChecked();
                    if(!no_tos){
                        //Sí hay tos
                        respuesta = "S";
                    } else {
                        //No hay tos
                        respuesta = "S";
                    }
                } else {
                    //No hay fiebre
                    radioButton = list.get(3).getActivity().findViewById(R.id.no_tos);
                    boolean no_tos = radioButton.isChecked();
                    if(!no_tos){
                        //Sí hay tos
                        respuesta = "T";
                    } else {
                        //No hay tos
                        respuesta = "N";
                    }
                }
            }
        } else {
            //No se visitó un país
            radioButton = list.get(1).getActivity().findViewById(R.id.no_contacto);
            boolean no_contacto_con_personas_infectadas = radioButton.isChecked();
            if(!no_contacto_con_personas_infectadas){
                //Si hubo contacto
                radioButton = list.get(2).getActivity().findViewById(R.id.no_fiebre);
                boolean no_fiebre = radioButton.isChecked();
                if(!no_fiebre){
                    //Si hay fiebre
                    radioButton = list.get(3).getActivity().findViewById(R.id.no_tos);
                    boolean no_tos = radioButton.isChecked();
                    if(!no_tos){
                        //Sí hay tos
                        respuesta = "S";
                    } else {
                        //No hay tos
                        respuesta = "S";
                    }
                } else {
                    //No hay fiebre
                    radioButton = list.get(3).getActivity().findViewById(R.id.no_tos);
                    boolean no_tos = radioButton.isChecked();
                    if(!no_tos){
                        //Sí hay tos
                        respuesta = "T";
                    } else {
                        //No hay tos
                        respuesta = "N";
                    }
                }
            } else {
                //No hubo contacto
                radioButton = list.get(2).getActivity().findViewById(R.id.no_fiebre);
                boolean no_fiebre = radioButton.isChecked();
                if(!no_fiebre){
                    //Si hay fiebre
                    radioButton = list.get(3).getActivity().findViewById(R.id.no_tos);
                    boolean no_tos = radioButton.isChecked();
                    if(!no_tos){
                        //Sí hay tos
                        respuesta = "T";
                    } else {
                        //No hay tos
                        respuesta = "T";
                    }
                } else {
                    //No hay fiebre
                    radioButton = list.get(3).getActivity().findViewById(R.id.no_tos);
                    boolean no_tos = radioButton.isChecked();
                    if(!no_tos){
                        //Sí hay tos
                        respuesta = "T";
                    } else {
                        //No hay tos
                        respuesta = "N";
                    }
                }
            }
        }
        //---------------------------------------------------
        //---------------------------------------------------
        //---------------------------------------------------
        this.finish();
        Intent intent = new Intent (view.getContext(), Resultados.class);
        intent.putExtra("respuesta", respuesta);
        startActivity(intent);
    }

    public void volver_activity_principal(View view) {
        this.finish();
    }
}
