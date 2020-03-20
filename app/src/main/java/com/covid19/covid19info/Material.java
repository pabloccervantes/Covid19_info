package com.covid19.covid19info;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class Material extends AppCompatActivity {

    //----------Cargando------------------
    private ProgressBar miprogress;
    private ObjectAnimator anim;
    //------------------------------------
    private ImageButton imagen;//aux_imagen

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_material);
        //----------------------------------------------------
        //instanciamos el progrogressbar
        miprogress = (ProgressBar) findViewById(R.id.circularProgress);
        //instanciamos el animador
        //Construye y devuelve un ObjectAnimator que anima.
        anim = ObjectAnimator.ofInt(miprogress, "progress", 0, 100);
        //agregamos el tiempo de la animacion a mostrar
        anim.setDuration(16000);
        anim.setInterpolator(new DecelerateInterpolator());
        //----------------------------------------------------
        //-------------Visión de página web-------------------
        //Se cambia a imagen de selección--
        imagen = findViewById(R.id.imageButton1);
        imagen.setImageResource(R.mipmap.periodico_seleccion);
        imagen = findViewById(R.id.imageButton2);
        imagen.setImageResource(R.mipmap.video);
        imagen = findViewById(R.id.imageButton3);
        imagen.setImageResource(R.mipmap.curso);
        //---------------------------------
        WebView view = findViewById(R.id.pagina_web);
        view.getSettings().setJavaScriptEnabled(true);
        //view.getSettings().setBuiltInZoomControls(true);
        view.loadUrl("https://www.who.int/es/emergencies/diseases/novel-coronavirus-2019/advice-for-public/q-a-coronaviruses");
        view.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                return false;
            }
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                miprogress.setVisibility(view.VISIBLE);
                anim.start();
            }
            public void onPageFinished(WebView view, String url) {
                try{
                    miprogress.setVisibility(view.GONE);
                    anim.end();
                }catch(Exception exception){
                    exception.printStackTrace();
                }
            }
        });
        //----------------------------------------------------
    }

    public void cargar_pag_oms (View view) {
        //Se cambia a imagen de selección--
        imagen = findViewById(R.id.imageButton1);
        imagen.setImageResource(R.mipmap.periodico_seleccion);
        imagen = findViewById(R.id.imageButton2);
        imagen.setImageResource(R.mipmap.video);
        imagen = findViewById(R.id.imageButton3);
        imagen.setImageResource(R.mipmap.curso);
        //---------------------------------
        //-------------Visión de página web-------------------
        WebView v = findViewById(R.id.pagina_web);
        v.getSettings().setJavaScriptEnabled(true);
        //v.getSettings().setBuiltInZoomControls(true);
        v.loadUrl("https://www.who.int/es/emergencies/diseases/novel-coronavirus-2019/advice-for-public/q-a-coronaviruses");
        v.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView v, String url){
                return false;
            }
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                miprogress.setVisibility(view.VISIBLE);
                anim.start();
            }
            public void onPageFinished(WebView view, String url) {
                try{
                    miprogress.setVisibility(view.GONE);
                    anim.end();
                }catch(Exception exception){
                    exception.printStackTrace();
                }
            }
        });
        //----------------------------------------------------
    }

    public void cargar_pag_video (View view) {
        //Se cambia a imagen de selección--
        imagen = findViewById(R.id.imageButton1);
        imagen.setImageResource(R.mipmap.periodico);
        imagen = findViewById(R.id.imageButton2);
        imagen.setImageResource(R.mipmap.video_seleccion);
        imagen = findViewById(R.id.imageButton3);
        imagen.setImageResource(R.mipmap.curso);
        //---------------------------------
        //-------------Visión de página web-------------------
        WebView v = findViewById(R.id.pagina_web);
        v.getSettings().setJavaScriptEnabled(true);
        //v.getSettings().setBuiltInZoomControls(true);
        v.loadUrl("https://www.youtube.com/watch?v=aerq4byr7ps");
        v.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView v, String url){
                return false;
            }
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                miprogress.setVisibility(view.VISIBLE);
                anim.start();
            }
            public void onPageFinished(WebView view, String url) {
                try{
                    miprogress.setVisibility(view.GONE);
                    anim.end();
                }catch(Exception exception){
                    exception.printStackTrace();
                }
            }
        });
        //----------------------------------------------------
    }

    public void cargar_pag_curso (View view) {
        //Se cambia a imagen de selección--
        imagen = findViewById(R.id.imageButton1);
        imagen.setImageResource(R.mipmap.periodico);
        imagen = findViewById(R.id.imageButton2);
        imagen.setImageResource(R.mipmap.video);
        imagen = findViewById(R.id.imageButton3);
        imagen.setImageResource(R.mipmap.curso_seleccion);
        //---------------------------------
        //-------------Visión de página web-------------------
        WebView v = findViewById(R.id.pagina_web);
        v.getSettings().setJavaScriptEnabled(true);
        //v.getSettings().setBuiltInZoomControls(true);
        v.loadUrl("https://www.campusvirtualsp.org/es/node/28738");
        v.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView v, String url){
                return false;
            }
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                miprogress.setVisibility(view.VISIBLE);
                anim.start();
            }
            public void onPageFinished(WebView view, String url) {
                try{
                    miprogress.setVisibility(view.GONE);
                    anim.end();
                }catch(Exception exception){
                    exception.printStackTrace();
                }
            }
        });
        //----------------------------------------------------
    }

    public void volver_activity_principal(View view) {
        this.finish();
    }
}
