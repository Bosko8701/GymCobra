package linces.gymcobra;

/**
 * Created by jose- on 09/12/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Musculos1 extends Activity {

    int contadorAtras=0, contadorHombro=0, contadorPecho=0, contadorBrazo=0, contadorAbdomen=0, contadorOblicuos=0, contadorPierna=0, contadorPantorrilla=0;
    Intent abrirHombros, abrirLogin1, abririnfo;
    public static final int segundos=1;
    public static int milisegundos=segundos*1000;
    public static final  int delay=2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musculos1);
        comenzarAnimacion();

        ImageView imageViewBtnHombro = (ImageView)findViewById(R.id.imageViewBtnHombro);
        ImageView imageViewBtnPecho = (ImageView)findViewById(R.id.imageViewBtnPecho);
        ImageView imageViewBtnBrazo = (ImageView)findViewById(R.id.imageViewBtnBrazo);
        ImageView imageViewBtnAbdomen = (ImageView)findViewById(R.id.imageViewBtnAbdomen);
        ImageView imageViewBtnOblicuo = (ImageView)findViewById(R.id.imageViewBtnOblicuo);
        ImageView imageViewBtnPierna = (ImageView)findViewById(R.id.imageViewBtnPierna);
        ImageView imageViewBtnPantorrilla = (ImageView)findViewById(R.id.imageViewBtnPantorrilla);
        ImageView imageViewHombroLetras = (ImageView)findViewById(R.id.imageViewHombroLetras);
        ImageView imageViewPechoLetras = (ImageView)findViewById(R.id.imageViewPechoLetras);
        ImageView imageViewBrazoLetras = (ImageView)findViewById(R.id.imageViewBrazoLetras);
        ImageView imageViewAbdomenLetras = (ImageView)findViewById(R.id.imageViewAbdomenLetras);
        ImageView imageViewOblicuosLetras = (ImageView)findViewById(R.id.imageViewOblicuosLetras);
        ImageView imageViewPiernaLetras = (ImageView)findViewById(R.id.imageViewPiernaLetras);
        ImageView imageViewPantorrillaLetras = (ImageView)findViewById(R.id.imageViewPantorrillaLetras);


        //Tipos de letra
        Typeface RobotoRegular = Typeface.createFromAsset(this.getAssets(), "Roboto-Regular.ttf");
        Typeface RobotoThin = Typeface.createFromAsset(this.getAssets(), "Roboto-Thin.ttf");
        Typeface RobotoLight = Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");

    }

    public void comenzarAnimacion()
    {
        new CountDownTimer(milisegundos, 1000)
        {

            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                Animation middle_fade_in = AnimationUtils.loadAnimation(Musculos1.this, R.anim.middle_fade_in);
                //Hombro
                ImageView imageViewBtnHombro = (ImageView)findViewById(R.id.imageViewBtnHombro);
                imageViewBtnHombro.startAnimation(middle_fade_in);
                imageViewBtnHombro.setVisibility(View.VISIBLE);
                //Pecho
                ImageView imageViewBtnPecho = (ImageView)findViewById(R.id.imageViewBtnPecho);
                imageViewBtnPecho.startAnimation(middle_fade_in);
                imageViewBtnPecho.setVisibility(View.VISIBLE);
                //Brazo
                ImageView imageViewBtnBrazo = (ImageView)findViewById(R.id.imageViewBtnBrazo);
                imageViewBtnBrazo.startAnimation(middle_fade_in);
                imageViewBtnBrazo.setVisibility(View.VISIBLE);
                //Abdomen
                ImageView imageViewBtnAbdomen = (ImageView)findViewById(R.id.imageViewBtnAbdomen);
                imageViewBtnAbdomen.startAnimation(middle_fade_in);
                imageViewBtnAbdomen.setVisibility(View.VISIBLE);
                //Oblicuos
                ImageView imageViewBtnOblicuo = (ImageView)findViewById(R.id.imageViewBtnOblicuo);
                imageViewBtnOblicuo.startAnimation(middle_fade_in);
                imageViewBtnOblicuo.setVisibility(View.VISIBLE);
                //Pierna
                ImageView imageViewBtnPierna = (ImageView)findViewById(R.id.imageViewBtnPierna);
                imageViewBtnPierna.startAnimation(middle_fade_in);
                imageViewBtnPierna.setVisibility(View.VISIBLE);
                //Pantorrilla
                ImageView imageViewBtnPantorrilla = (ImageView)findViewById(R.id.imageViewBtnPantorrilla);
                imageViewBtnPantorrilla.startAnimation(middle_fade_in);
                imageViewBtnPantorrilla.setVisibility(View.VISIBLE);
            }
        }.start();
    }

    //Accion que realiza al dar click en hombro
    public void onClickIVBtnHombro(View view){

        ImageView imageViewBtnHombro = (ImageView)findViewById(R.id.imageViewBtnHombro);
        Animation fast_fade_in = AnimationUtils.loadAnimation(Musculos1.this, R.anim.fast_fade_in);
        Animation fast_fade_out = AnimationUtils.loadAnimation(Musculos1.this, R.anim.fast_fade_out);
        Animation scale_80to100 = AnimationUtils.loadAnimation(Musculos1.this, R.anim.scale_80to100);

        //Animacion
        imageViewBtnHombro.startAnimation(scale_80to100);

        contadorHombro=contadorHombro+1;
        contadorPecho=0;
        contadorBrazo=0;
        contadorAbdomen=0;
        contadorOblicuos=0;
        contadorPierna=0;
        contadorPantorrilla=0;

        if(contadorHombro==1)
        {
            //Copiar a todos y completar
            ImageView imageViewEsquemaHombro = (ImageView)findViewById(R.id.imageViewEsquemaHombro);
            ImageView imageViewEsquemaPecho = (ImageView)findViewById(R.id.imageViewEsquemaPecho);
            ImageView imageViewEsquemaBrazo = (ImageView)findViewById(R.id.imageViewEsquemaBrazo);

            imageViewEsquemaHombro.startAnimation(fast_fade_in);
            imageViewEsquemaHombro.setVisibility(view.VISIBLE);

            imageViewEsquemaPecho.setVisibility(view.INVISIBLE);
            imageViewEsquemaBrazo.setVisibility(view.INVISIBLE);

            ImageView imageViewHombroLetras = (ImageView)findViewById(R.id.imageViewHombroLetras);
            ImageView imageViewPechoLetras = (ImageView)findViewById(R.id.imageViewPechoLetras);
            ImageView imageViewBrazoLetras = (ImageView)findViewById(R.id.imageViewBrazoLetras);
            ImageView imageViewAbdomenLetras = (ImageView)findViewById(R.id.imageViewAbdomenLetras);
            ImageView imageViewOblicuosLetras = (ImageView)findViewById(R.id.imageViewOblicuosLetras);
            ImageView imageViewPiernaLetras = (ImageView)findViewById(R.id.imageViewPiernaLetras);
            ImageView imageViewPantorrillaLetras = (ImageView)findViewById(R.id.imageViewPantorrillaLetras);



            //Animacion
            imageViewHombroLetras.startAnimation(fast_fade_in);
            imageViewHombroLetras.setVisibility(View.VISIBLE);

            imageViewPechoLetras.setVisibility(View.INVISIBLE);
            imageViewBrazoLetras.setVisibility(View.INVISIBLE);
            imageViewAbdomenLetras.setVisibility(View.INVISIBLE);
            imageViewOblicuosLetras.setVisibility(View.INVISIBLE);
            imageViewPiernaLetras.setVisibility(View.INVISIBLE);
            imageViewPantorrillaLetras.setVisibility(View.INVISIBLE);

            Toast.makeText(getApplicationContext(), "Presiona de nuevo", Toast.LENGTH_SHORT).show();
        }
        else if (contadorHombro>=2)
        {
            abrirHombros = new Intent(this, Hombros1.class);
            startActivity(abrirHombros);
            overridePendingTransition(R.animator.slow_fade_in, R.animator.slow_fade_out);
            this.finish();
        }
    }

    public void onClickIVBtnPecho(View view){
        ImageView imageViewBtnPecho = (ImageView)findViewById(R.id.imageViewBtnPecho);
        Animation fast_fade_in = AnimationUtils.loadAnimation(Musculos1.this, R.anim.fast_fade_in);
        Animation fast_fade_out = AnimationUtils.loadAnimation(Musculos1.this, R.anim.fast_fade_out);
        Animation scale_80to100 = AnimationUtils.loadAnimation(Musculos1.this, R.anim.scale_80to100);

        //Animacion
        imageViewBtnPecho.startAnimation(scale_80to100);

        contadorHombro=0;
        contadorPecho=contadorPecho+1;
        contadorBrazo=0;
        contadorAbdomen=0;
        contadorOblicuos=0;
        contadorPierna=0;
        contadorPantorrilla=0;

        if(contadorPecho==1)
        {
            ImageView imageViewEsquemaHombro = (ImageView)findViewById(R.id.imageViewEsquemaHombro);
            ImageView imageViewEsquemaPecho = (ImageView)findViewById(R.id.imageViewEsquemaPecho);
            ImageView imageViewEsquemaBrazo = (ImageView)findViewById(R.id.imageViewEsquemaBrazo);

            imageViewEsquemaPecho.startAnimation(fast_fade_in);
            imageViewEsquemaPecho.setVisibility(view.VISIBLE);

            imageViewEsquemaHombro.setVisibility(view.INVISIBLE);
            imageViewEsquemaBrazo.setVisibility(view.INVISIBLE);


            ImageView imageViewHombroLetras = (ImageView)findViewById(R.id.imageViewHombroLetras);
            ImageView imageViewPechoLetras = (ImageView)findViewById(R.id.imageViewPechoLetras);
            ImageView imageViewBrazoLetras = (ImageView)findViewById(R.id.imageViewBrazoLetras);
            ImageView imageViewAbdomenLetras = (ImageView)findViewById(R.id.imageViewAbdomenLetras);
            ImageView imageViewOblicuosLetras = (ImageView)findViewById(R.id.imageViewOblicuosLetras);
            ImageView imageViewPiernaLetras = (ImageView)findViewById(R.id.imageViewPiernaLetras);
            ImageView imageViewPantorrillaLetras = (ImageView)findViewById(R.id.imageViewPantorrillaLetras);

            //Animacion
            imageViewPechoLetras.startAnimation(fast_fade_in);
            imageViewPechoLetras.setVisibility(View.VISIBLE);

            imageViewHombroLetras.setVisibility(View.INVISIBLE);
            imageViewBrazoLetras.setVisibility(View.INVISIBLE);
            imageViewAbdomenLetras.setVisibility(View.INVISIBLE);
            imageViewOblicuosLetras.setVisibility(View.INVISIBLE);
            imageViewPiernaLetras.setVisibility(View.INVISIBLE);
            imageViewPantorrillaLetras.setVisibility(View.INVISIBLE);

            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
        else if (contadorPecho>=2)
        {
            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickIVBtnBrazo(View view){
        //Animacion
        Animation fast_fade_in = AnimationUtils.loadAnimation(Musculos1.this, R.anim.fast_fade_in);
        Animation scale_80to100 = AnimationUtils.loadAnimation(Musculos1.this, R.anim.scale_80to100);
        ImageView imageViewBtnBrazo = (ImageView)findViewById(R.id.imageViewBtnBrazo);
        imageViewBtnBrazo.startAnimation(scale_80to100);

        contadorHombro=0;
        contadorPecho=0;
        contadorBrazo=contadorBrazo+1;
        contadorAbdomen=0;
        contadorOblicuos=0;
        contadorPierna=0;
        contadorPantorrilla=0;

        if(contadorBrazo==1)
        {
            ImageView imageViewEsquemaHombro = (ImageView)findViewById(R.id.imageViewEsquemaHombro);
            ImageView imageViewEsquemaPecho = (ImageView)findViewById(R.id.imageViewEsquemaPecho);
            ImageView imageViewEsquemaBrazo = (ImageView)findViewById(R.id.imageViewEsquemaBrazo);

            imageViewEsquemaBrazo.startAnimation(fast_fade_in);
            imageViewEsquemaBrazo.setVisibility(view.VISIBLE);

            imageViewEsquemaPecho.setVisibility(view.INVISIBLE);
            imageViewEsquemaHombro.setVisibility(view.INVISIBLE);


            ImageView imageViewHombroLetras = (ImageView)findViewById(R.id.imageViewHombroLetras);
            ImageView imageViewPechoLetras = (ImageView)findViewById(R.id.imageViewPechoLetras);
            ImageView imageViewBrazoLetras = (ImageView)findViewById(R.id.imageViewBrazoLetras);
            ImageView imageViewAbdomenLetras = (ImageView)findViewById(R.id.imageViewAbdomenLetras);
            ImageView imageViewOblicuosLetras = (ImageView)findViewById(R.id.imageViewOblicuosLetras);
            ImageView imageViewPiernaLetras = (ImageView)findViewById(R.id.imageViewPiernaLetras);
            ImageView imageViewPantorrillaLetras = (ImageView)findViewById(R.id.imageViewPantorrillaLetras);

            //Animacion
            imageViewBrazoLetras.startAnimation(fast_fade_in);

            imageViewHombroLetras.setVisibility(View.INVISIBLE);
            imageViewPechoLetras.setVisibility(View.INVISIBLE);
            imageViewBrazoLetras.setVisibility(View.VISIBLE);
            imageViewAbdomenLetras.setVisibility(View.INVISIBLE);
            imageViewOblicuosLetras.setVisibility(View.INVISIBLE);
            imageViewPiernaLetras.setVisibility(View.INVISIBLE);
            imageViewPantorrillaLetras.setVisibility(View.INVISIBLE);

            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
        else if (contadorBrazo>=2)
        {
            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickIVBtnAbdomen(View view){
        //Animacion
        Animation fast_fade_in = AnimationUtils.loadAnimation(Musculos1.this, R.anim.fast_fade_in);
        Animation scale_80to100 = AnimationUtils.loadAnimation(Musculos1.this, R.anim.scale_80to100);
        ImageView imageViewBtnAbdomen = (ImageView)findViewById(R.id.imageViewBtnAbdomen);
        imageViewBtnAbdomen.startAnimation(scale_80to100);

        contadorHombro=0;
        contadorPecho=0;
        contadorBrazo=0;
        contadorAbdomen=contadorAbdomen+1;
        contadorOblicuos=0;
        contadorPierna=0;
        contadorPantorrilla=0;

        if(contadorAbdomen==1)
        {
            ImageView imageViewEsquemaHombro = (ImageView)findViewById(R.id.imageViewEsquemaHombro);
            ImageView imageViewEsquemaPecho = (ImageView)findViewById(R.id.imageViewEsquemaPecho);
            ImageView imageViewEsquemaBrazo = (ImageView)findViewById(R.id.imageViewEsquemaBrazo);

            //imageViewEsquemaBrazo.startAnimation(fast_fade_in);
            //imageViewEsquemaBrazo.setVisibility(view.VISIBLE);

            imageViewEsquemaHombro.setVisibility(view.INVISIBLE);
            imageViewEsquemaPecho.setVisibility(view.INVISIBLE);
            imageViewEsquemaBrazo.setVisibility(view.INVISIBLE);


            ImageView imageViewHombroLetras = (ImageView)findViewById(R.id.imageViewHombroLetras);
            ImageView imageViewPechoLetras = (ImageView)findViewById(R.id.imageViewPechoLetras);
            ImageView imageViewBrazoLetras = (ImageView)findViewById(R.id.imageViewBrazoLetras);
            ImageView imageViewAbdomenLetras = (ImageView)findViewById(R.id.imageViewAbdomenLetras);
            ImageView imageViewOblicuosLetras = (ImageView)findViewById(R.id.imageViewOblicuosLetras);
            ImageView imageViewPiernaLetras = (ImageView)findViewById(R.id.imageViewPiernaLetras);
            ImageView imageViewPantorrillaLetras = (ImageView)findViewById(R.id.imageViewPantorrillaLetras);

            //Animacion
            imageViewAbdomenLetras.startAnimation(fast_fade_in);

            imageViewHombroLetras.setVisibility(View.INVISIBLE);
            imageViewPechoLetras.setVisibility(View.INVISIBLE);
            imageViewBrazoLetras.setVisibility(View.INVISIBLE);
            imageViewAbdomenLetras.setVisibility(View.VISIBLE);
            imageViewOblicuosLetras.setVisibility(View.INVISIBLE);
            imageViewPiernaLetras.setVisibility(View.INVISIBLE);
            imageViewPantorrillaLetras.setVisibility(View.INVISIBLE);

            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
        else if (contadorAbdomen>=2)
        {
            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickIVBtnOblicuo(View view){
        //Animacion
        Animation fast_fade_in = AnimationUtils.loadAnimation(Musculos1.this, R.anim.fast_fade_in);
        Animation scale_80to100 = AnimationUtils.loadAnimation(Musculos1.this, R.anim.scale_80to100);
        ImageView imageViewBtnOblicuo = (ImageView)findViewById(R.id.imageViewBtnOblicuo);
        imageViewBtnOblicuo.startAnimation(scale_80to100);

        contadorHombro=0;
        contadorPecho=0;
        contadorBrazo=0;
        contadorAbdomen=0;
        contadorOblicuos=contadorOblicuos+1;
        contadorPierna=0;
        contadorPantorrilla=0;

        if(contadorOblicuos==1)
        {
            ImageView imageViewEsquemaHombro = (ImageView)findViewById(R.id.imageViewEsquemaHombro);
            ImageView imageViewEsquemaPecho = (ImageView)findViewById(R.id.imageViewEsquemaPecho);
            ImageView imageViewEsquemaBrazo = (ImageView)findViewById(R.id.imageViewEsquemaBrazo);

            //imageViewEsquemaBrazo.startAnimation(fast_fade_in);
            //imageViewEsquemaBrazo.setVisibility(view.VISIBLE);

            imageViewEsquemaHombro.setVisibility(view.INVISIBLE);
            imageViewEsquemaPecho.setVisibility(view.INVISIBLE);
            imageViewEsquemaBrazo.setVisibility(view.INVISIBLE);


            ImageView imageViewHombroLetras = (ImageView)findViewById(R.id.imageViewHombroLetras);
            ImageView imageViewPechoLetras = (ImageView)findViewById(R.id.imageViewPechoLetras);
            ImageView imageViewBrazoLetras = (ImageView)findViewById(R.id.imageViewBrazoLetras);
            ImageView imageViewAbdomenLetras = (ImageView)findViewById(R.id.imageViewAbdomenLetras);
            ImageView imageViewOblicuosLetras = (ImageView)findViewById(R.id.imageViewOblicuosLetras);
            ImageView imageViewPiernaLetras = (ImageView)findViewById(R.id.imageViewPiernaLetras);
            ImageView imageViewPantorrillaLetras = (ImageView)findViewById(R.id.imageViewPantorrillaLetras);

            //Animacion
            imageViewOblicuosLetras.startAnimation(fast_fade_in);

            imageViewHombroLetras.setVisibility(View.INVISIBLE);
            imageViewPechoLetras.setVisibility(View.INVISIBLE);
            imageViewBrazoLetras.setVisibility(View.INVISIBLE);
            imageViewAbdomenLetras.setVisibility(View.INVISIBLE);
            imageViewOblicuosLetras.setVisibility(View.VISIBLE);
            imageViewPiernaLetras.setVisibility(View.INVISIBLE);
            imageViewPantorrillaLetras.setVisibility(View.INVISIBLE);

            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
        else if (contadorOblicuos>=2)
        {
            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickIVBtnPierna(View view){
        //Animacion
        Animation fast_fade_in = AnimationUtils.loadAnimation(Musculos1.this, R.anim.fast_fade_in);
        Animation scale_80to100 = AnimationUtils.loadAnimation(Musculos1.this, R.anim.scale_80to100);
        ImageView imageViewBtnPierna = (ImageView)findViewById(R.id.imageViewBtnPierna);
        imageViewBtnPierna.startAnimation(scale_80to100);

        contadorHombro=0;
        contadorPecho=0;
        contadorBrazo=0;
        contadorAbdomen=0;
        contadorOblicuos=0;
        contadorPierna=contadorPierna+1;
        contadorPantorrilla=0;

        if(contadorPierna==1)
        {
            ImageView imageViewEsquemaHombro = (ImageView)findViewById(R.id.imageViewEsquemaHombro);
            ImageView imageViewEsquemaPecho = (ImageView)findViewById(R.id.imageViewEsquemaPecho);
            ImageView imageViewEsquemaBrazo = (ImageView)findViewById(R.id.imageViewEsquemaBrazo);

            //imageViewEsquemaBrazo.startAnimation(fast_fade_in);
            //imageViewEsquemaBrazo.setVisibility(view.VISIBLE);

            imageViewEsquemaHombro.setVisibility(view.INVISIBLE);
            imageViewEsquemaPecho.setVisibility(view.INVISIBLE);
            imageViewEsquemaBrazo.setVisibility(view.INVISIBLE);


            ImageView imageViewHombroLetras = (ImageView)findViewById(R.id.imageViewHombroLetras);
            ImageView imageViewPechoLetras = (ImageView)findViewById(R.id.imageViewPechoLetras);
            ImageView imageViewBrazoLetras = (ImageView)findViewById(R.id.imageViewBrazoLetras);
            ImageView imageViewAbdomenLetras = (ImageView)findViewById(R.id.imageViewAbdomenLetras);
            ImageView imageViewOblicuosLetras = (ImageView)findViewById(R.id.imageViewOblicuosLetras);
            ImageView imageViewPiernaLetras = (ImageView)findViewById(R.id.imageViewPiernaLetras);
            ImageView imageViewPantorrillaLetras = (ImageView)findViewById(R.id.imageViewPantorrillaLetras);

            //Animacion
            imageViewPiernaLetras.startAnimation(fast_fade_in);

            imageViewHombroLetras.setVisibility(View.INVISIBLE);
            imageViewPechoLetras.setVisibility(View.INVISIBLE);
            imageViewBrazoLetras.setVisibility(View.INVISIBLE);
            imageViewAbdomenLetras.setVisibility(View.INVISIBLE);
            imageViewOblicuosLetras.setVisibility(View.INVISIBLE);
            imageViewPiernaLetras.setVisibility(View.VISIBLE);
            imageViewPantorrillaLetras.setVisibility(View.INVISIBLE);

            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
        else if (contadorPierna>=2)
        {
            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickIVBtnPantorrilla(View view){
        //Animacion
        Animation fast_fade_in = AnimationUtils.loadAnimation(Musculos1.this, R.anim.fast_fade_in);
        Animation scale_80to100 = AnimationUtils.loadAnimation(Musculos1.this, R.anim.scale_80to100);
        ImageView imageViewBtnPantorrilla = (ImageView)findViewById(R.id.imageViewBtnPantorrilla);
        imageViewBtnPantorrilla.startAnimation(scale_80to100);

        contadorHombro=0;
        contadorPecho=0;
        contadorBrazo=0;
        contadorAbdomen=0;
        contadorOblicuos=0;
        contadorPierna=0;
        contadorPantorrilla=contadorPantorrilla+1;

        if(contadorPantorrilla==1)
        {
            ImageView imageViewEsquemaHombro = (ImageView)findViewById(R.id.imageViewEsquemaHombro);
            ImageView imageViewEsquemaPecho = (ImageView)findViewById(R.id.imageViewEsquemaPecho);
            ImageView imageViewEsquemaBrazo = (ImageView)findViewById(R.id.imageViewEsquemaBrazo);

            //imageViewEsquemaBrazo.startAnimation(fast_fade_in);
            //imageViewEsquemaBrazo.setVisibility(view.VISIBLE);

            imageViewEsquemaHombro.setVisibility(view.INVISIBLE);
            imageViewEsquemaPecho.setVisibility(view.INVISIBLE);
            imageViewEsquemaBrazo.setVisibility(view.INVISIBLE);


            ImageView imageViewHombroLetras = (ImageView)findViewById(R.id.imageViewHombroLetras);
            ImageView imageViewPechoLetras = (ImageView)findViewById(R.id.imageViewPechoLetras);
            ImageView imageViewBrazoLetras = (ImageView)findViewById(R.id.imageViewBrazoLetras);
            ImageView imageViewAbdomenLetras = (ImageView)findViewById(R.id.imageViewAbdomenLetras);
            ImageView imageViewOblicuosLetras = (ImageView)findViewById(R.id.imageViewOblicuosLetras);
            ImageView imageViewPiernaLetras = (ImageView)findViewById(R.id.imageViewPiernaLetras);
            ImageView imageViewPantorrillaLetras = (ImageView)findViewById(R.id.imageViewPantorrillaLetras);

            //Animacion
            imageViewPantorrillaLetras.startAnimation(fast_fade_in);

            imageViewHombroLetras.setVisibility(View.INVISIBLE);
            imageViewPechoLetras.setVisibility(View.INVISIBLE);
            imageViewBrazoLetras.setVisibility(View.INVISIBLE);
            imageViewAbdomenLetras.setVisibility(View.INVISIBLE);
            imageViewOblicuosLetras.setVisibility(View.INVISIBLE);
            imageViewPiernaLetras.setVisibility(View.INVISIBLE);
            imageViewPantorrillaLetras.setVisibility(View.VISIBLE);

            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
        else if (contadorPantorrilla>=2)
        {
            Toast.makeText(getApplicationContext(), "Disponible proximamente", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            // do something on back.
            contadorAtras=contadorAtras+1;
            if(contadorAtras==1)
            {
                Toast.makeText(getApplicationContext(), "Presiona de nuevo para salir", Toast.LENGTH_SHORT).show();
            }
            else if (contadorAtras>=2)
            {
                this.finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }






}




