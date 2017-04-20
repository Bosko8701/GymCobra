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

public class LogIn2 extends Activity {

    int contadorAtras=0, contadorVolverL1=0, contadorIntentos=0, Combinacion=0, Comb1=3, Comb2=10, Comb3=101, Comb4=1000;
    Intent abrirMusculos1, abrirLogin1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2);

        ImageView imageViewBtn1 = (ImageView)findViewById(R.id.imageViewBtn1);
        ImageView imageViewBtn2 = (ImageView)findViewById(R.id.imageViewBtn2);
        ImageView imageViewBtn3 = (ImageView)findViewById(R.id.imageViewBtn3);
        ImageView imageViewBtn4 = (ImageView)findViewById(R.id.imageViewBtn4);
        ImageView imageViewBotonAnteriorL2 = (ImageView)findViewById(R.id.imageViewBotonAnteriorL2);
        TextView textViewCorrecta = (TextView)findViewById(R.id.textViewCorrecta);

        Typeface RobotoRegular = Typeface.createFromAsset(this.getAssets(), "Roboto-Regular.ttf");
        Typeface RobotoThin = Typeface.createFromAsset(this.getAssets(), "Roboto-Thin.ttf");
        Typeface RobotoLight = Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");

        textViewCorrecta.setTypeface(RobotoLight);
//

    }

    public void onClickIVBtn1(View view) {
        ImageView imageViewBtn1 = (ImageView)findViewById(R.id.imageViewBtn1);
        ImageView imageViewBotonAnteriorL2 = (ImageView)findViewById(R.id.imageViewBotonAnteriorL2);
        TextView textViewCorrecta = (TextView)findViewById(R.id.textViewCorrecta);

        //animacion
        Animation scale_80to100 = AnimationUtils.loadAnimation(LogIn2.this, R.anim.scale_80to100);
        imageViewBtn1.startAnimation(scale_80to100);
        contadorIntentos=contadorIntentos+1;
        Combinacion=Combinacion+Comb1;
        if(Combinacion==1215){
            imageViewBotonAnteriorL2.setVisibility(view.INVISIBLE);
            textViewCorrecta.setVisibility(view.VISIBLE);
            abrirMusculos1 = new Intent(this, Musculos1.class);
            startActivity(abrirMusculos1);
            overridePendingTransition(R.animator.slow_fade_in, R.animator.slow_fade_out);
            this.finish();
        }
        if(contadorIntentos>=6){
            Toast.makeText(getApplicationContext(), "Combinación incorrecta, Vuelva a intentar", Toast.LENGTH_SHORT).show();
            contadorIntentos=0;
            Combinacion=0;
        }
    }

    public void onClickIVBtn2(View view) {
        ImageView imageViewBtn2 = (ImageView)findViewById(R.id.imageViewBtn2);
        TextView textViewCorrecta = (TextView)findViewById(R.id.textViewCorrecta);
        ImageView imageViewBotonAnteriorL2 = (ImageView)findViewById(R.id.imageViewBotonAnteriorL2);

        //animacion
        Animation scale_80to100 = AnimationUtils.loadAnimation(LogIn2.this, R.anim.scale_80to100);
        imageViewBtn2.startAnimation(scale_80to100);
        contadorIntentos=contadorIntentos+1;
        Combinacion=Combinacion+Comb2;
        if(Combinacion==1215){
            imageViewBotonAnteriorL2.setVisibility(view.INVISIBLE);
            textViewCorrecta.setVisibility(view.VISIBLE);
            abrirMusculos1 = new Intent(this, Musculos1.class);
            startActivity(abrirMusculos1);
            overridePendingTransition(R.animator.slow_fade_in, R.animator.slow_fade_out);
            this.finish();
        }
        if(contadorIntentos>=6){
            Toast.makeText(getApplicationContext(), "Combinación incorrecta, Vuelva a intentar", Toast.LENGTH_SHORT).show();
            contadorIntentos=0;
            Combinacion=0;
        }
    }

    public void onClickIVBtn3(View view) {
        ImageView imageViewBtn3 = (ImageView)findViewById(R.id.imageViewBtn3);
        TextView textViewCorrecta = (TextView)findViewById(R.id.textViewCorrecta);
        ImageView imageViewBotonAnteriorL2 = (ImageView)findViewById(R.id.imageViewBotonAnteriorL2);

        //animacion
        Animation scale_80to100 = AnimationUtils.loadAnimation(LogIn2.this, R.anim.scale_80to100);
        imageViewBtn3.startAnimation(scale_80to100);
        contadorIntentos=contadorIntentos+1;
        Combinacion=Combinacion+Comb3;
        if(Combinacion==1215){
            imageViewBotonAnteriorL2.setVisibility(view.INVISIBLE);
            textViewCorrecta.setVisibility(view.VISIBLE);
            abrirMusculos1 = new Intent(this, Musculos1.class);
            startActivity(abrirMusculos1);
            overridePendingTransition(R.animator.slow_fade_in, R.animator.slow_fade_out);
            this.finish();
        }
        if(contadorIntentos>=6){
            Toast.makeText(getApplicationContext(), "Combinación incorrecta, Vuelva a intentar", Toast.LENGTH_SHORT).show();
            contadorIntentos=0;
            Combinacion=0;
        }
    }

    public void onClickIVBtn4(View view) {
        ImageView imageViewBtn4 = (ImageView)findViewById(R.id.imageViewBtn4);
        TextView textViewCorrecta = (TextView)findViewById(R.id.textViewCorrecta);
        ImageView imageViewBotonAnteriorL2 = (ImageView)findViewById(R.id.imageViewBotonAnteriorL2);

        //animacion
        Animation scale_80to100 = AnimationUtils.loadAnimation(LogIn2.this, R.anim.scale_80to100);
        imageViewBtn4.startAnimation(scale_80to100);
        contadorIntentos=contadorIntentos+1;
        Combinacion=Combinacion+Comb4;
        if(Combinacion==1215){
            imageViewBotonAnteriorL2.setVisibility(view.INVISIBLE);
            textViewCorrecta.setVisibility(view.VISIBLE);
            abrirMusculos1 = new Intent(this, Musculos1.class);
            startActivity(abrirMusculos1);
            overridePendingTransition(R.animator.slow_fade_in, R.animator.slow_fade_out);
            this.finish();
        }
        if(contadorIntentos>=6) {
            Toast.makeText(getApplicationContext(), "Combinación incorrecta, Vuelva a intentar", Toast.LENGTH_SHORT).show();
            contadorIntentos = 0;
            Combinacion=0;
        }
    }

    public void onClickIVBtnAntL2(View view){
        ImageView imageViewBotonAnteriorL2 = (ImageView)findViewById(R.id.imageViewBotonAnteriorL2);
        contadorVolverL1=contadorVolverL1+1;

        if(contadorVolverL1<=1){
            //animacion
            Animation scale_80to100 = AnimationUtils.loadAnimation(LogIn2.this, R.anim.scale_80to100);
            imageViewBotonAnteriorL2.startAnimation(scale_80to100);
            Toast.makeText(getApplicationContext(), ("Presiona de nuevo para volver "), Toast.LENGTH_SHORT).show();
        }
        if(contadorVolverL1>=2) {
            Animation fast_fade_out = AnimationUtils.loadAnimation(LogIn2.this, R.anim.fast_fade_out);
            imageViewBotonAnteriorL2.startAnimation(fast_fade_out);
            imageViewBotonAnteriorL2.setVisibility(view.INVISIBLE);
            abrirLogin1 = new Intent(this, LogIn1.class);
            startActivity(abrirLogin1);
            overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
            this.finish();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            // do something on back.
            contadorVolverL1=contadorVolverL1+1;
            if(contadorVolverL1<=1){
                Toast.makeText(getApplicationContext(), ("Presiona de nuevo para volver "), Toast.LENGTH_SHORT).show();
            }
            if(contadorVolverL1>=2) {
                abrirLogin1 = new Intent(this, LogIn1.class);
                startActivity(abrirLogin1);
                overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
                this.finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }






}
