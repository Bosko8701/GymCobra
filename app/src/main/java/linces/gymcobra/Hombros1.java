package linces.gymcobra;

/**
 * Created by jose- on 09/12/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Hombros1 extends Activity {
    int contadorAtras=0, contadorIntentos=0, Combinacion=0, Comb1=3, Comb2=10, Comb3=101, Comb4=1000;
    Intent abrirMusculos1, abrirInfoH1, abrirSiguienteH1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hombros1);

        ImageView imageViewVolverH1 = (ImageView)findViewById(R.id.imageViewVolverH1);
        ImageView imageViewHombroSiguienteH1 = (ImageView)findViewById(R.id.imageViewHombroSiguienteH1);
        ImageView imageViewHombroAnteriorH1 = (ImageView)findViewById(R.id.imageViewHombroAnteriorH1);
        ImageView imageViewInfoH1 = (ImageView)findViewById(R.id.imageViewBtnInfoH1);
        TextView textViewEjercicioH1 = (TextView)findViewById(R.id.textViewEjercicioH1Info);

        Typeface RobotoRegular = Typeface.createFromAsset(this.getAssets(), "Roboto-Regular.ttf");
        Typeface RobotoThin = Typeface.createFromAsset(this.getAssets(), "Roboto-Thin.ttf");
        Typeface RobotoLight = Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");

        textViewEjercicioH1.setTypeface(RobotoLight);

    }

    public void onClickIVBtnH1Info(View view){

        ImageView imageViewBtnInfoH1 = (ImageView)findViewById(R.id.imageViewBtnInfoH1);
        Animation scale_80to100 = AnimationUtils.loadAnimation(Hombros1.this, R.anim.scale_80to100);

        //Animacion
        imageViewBtnInfoH1.startAnimation(scale_80to100);

        abrirInfoH1 = new Intent(this, Hombros1Info.class);
        startActivity(abrirInfoH1);
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
        this.finish();
    }

    public void onClickIVBtnH1Volver(View view){

        ImageView imageViewVolverH1 = (ImageView)findViewById(R.id.imageViewVolverH1);
        Animation scale_80to100 = AnimationUtils.loadAnimation(Hombros1.this, R.anim.scale_80to100);

        //Animacion
        imageViewVolverH1.startAnimation(scale_80to100);

        abrirMusculos1 = new Intent(this, Musculos1.class);
        startActivity(abrirMusculos1);
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
        this.finish();
    }

    public void onClickIVBtnH1Siguiente(View view){

        ImageView imageViewHombroSiguienteH1 = (ImageView)findViewById(R.id.imageViewHombroSiguienteH1);
        Animation scale_80to100 = AnimationUtils.loadAnimation(Hombros1.this, R.anim.scale_80to100);

        //Animacion
        imageViewHombroSiguienteH1.startAnimation(scale_80to100);

        abrirSiguienteH1 = new Intent(this, Hombros2.class);
        startActivity(abrirSiguienteH1);
        overridePendingTransition(R.animator.fast_fade_in, R.animator.fast_fade_out);
        this.finish();
    }

    public void onClickIVBtnH1Anterior(View view){
        Toast.makeText(getApplicationContext(), "Boton Anterior", Toast.LENGTH_SHORT).show();
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

