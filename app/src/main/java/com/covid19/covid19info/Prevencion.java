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
import android.widget.TextView;

import com.covid19.covid19info.fragments.PageFragmentPrev1;
import com.covid19.covid19info.fragments.PageFragmentPrev2;
import com.covid19.covid19info.fragments.PageFragmentPrev3;
import com.covid19.covid19info.fragments.PageFragmentPrev4;
import com.covid19.covid19info.fragments.PageFragmentPrev5;
import com.covid19.covid19info.fragments.PageFragmentPrev6;
import com.covid19.covid19info.fragments.PageFragmentPrev7;

import java.util.ArrayList;
import java.util.List;

public class Prevencion extends AppCompatActivity {

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
        setContentView(R.layout.activity_prevencion);
        //----------------------------------------------------------------------------
        //----------------------Mostrar las pantallas en carrusel---------------------
        //----------------------------------------------------------------------------
        list = new ArrayList<>();
        list.add(new PageFragmentPrev1());
        list.add(new PageFragmentPrev2());
        list.add(new PageFragmentPrev3());
        list.add(new PageFragmentPrev4());
        list.add(new PageFragmentPrev5());
        list.add(new PageFragmentPrev6());
        list.add(new PageFragmentPrev7());
        pager = findViewById(R.id.pager);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),list);
        pager.setAdapter(pagerAdapter);
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
        puntosSlide = new TextView[7];
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

    public void volver_activity_principal(View view) {
        this.finish();
    }

    public void abrir_activity_materiales(View view) {
        Intent intent = new Intent (view.getContext(), Material.class);
        startActivityForResult(intent, 0);
    }

}
