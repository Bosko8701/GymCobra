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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Hombros3 extends Activity {
    int contadorAtras=0, contadorIntentos=0, Combinacion=0, Comb1=3, Comb2=10, Comb3=101, Comb4=1000;
    Intent abrirMusculos1, abrirInfoH3, abrirAnteriorH3, abrirSiguienteH3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hombros3);

        ImageView imageViewVolverH3 = (ImageView)findViewById(R.id.imageViewVolverH3);
        ImageView imageViewHombroSiguienteH3 = (ImageView)findViewById(R.id.imageViewHombroSiguienteH3);
        ImageView imageViewHombroAnteriorH3 = (ImageView)findViewById(R.id.imageViewHombroAnteriorH3);
        ImageView imageViewInfoH3 = (ImageView)findViewById(R.id.imageViewBtnInfoH3);
        TextView textViewEjercicioH3Info = (TextView)findViewById(R.id.textViewEjercicioH3Info);

        Typeface RobotoRegular = Typeface.createFromAsset(this.getAssets(), "Roboto-Regular.ttf");
        Typeface RobotoThin = Typeface.createFromAsset(this.getAssets(), "Roboto-Thin.ttf");
        Typeface RobotoLight = Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");

        textViewEjercicioH3Info.setTypeface(RobotoLight);

    }

    public void onClickIVBtnH3Info(View view){
        abrirInfoH3 = new Intent(this, Hombros3Info.class);
        startActivity(abrirInfoH3);
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
        this.finish();
    }

    public void onClickIVBtnH3Volver(View view){
        abrirMusculos1 = new Intent(this, Musculos1.class);
        startActivity(abrirMusculos1);
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
        this.finish();
    }

    public void onClickIVBtnH3Siguiente(View view){
        abrirSiguienteH3 = new Intent(this, Hombros4.class);
        startActivity(abrirSiguienteH3);
        overridePendingTransition(R.animator.fast_fade_in, R.animator.fast_fade_out);
        this.finish();
    }


    public void onClickIVBtnH3Anterior(View view){
        abrirAnteriorH3 = new Intent(this, Hombros2.class);
        startActivity(abrirAnteriorH3);
        overridePendingTransition(R.animator.fast_fade_in, R.animator.fast_fade_out);
        this.finish();
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
