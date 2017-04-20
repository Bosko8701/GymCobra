package linces.gymcobra;

/**
 * Created by jose- on 23/12/2015.
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

public class Hombros4 extends Activity {
    int contadorAtras=0;
    Intent abrirMusculos1, abrirInfoH4, abrirAnteriorH4, abrirSiguienteH4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hombros4);

        ImageView imageViewVolverH4 = (ImageView)findViewById(R.id.imageViewVolverH4);
        ImageView imageViewHombroSiguienteH4 = (ImageView)findViewById(R.id.imageViewHombroSiguienteH4);
        ImageView imageViewHombroAnteriorH4 = (ImageView)findViewById(R.id.imageViewHombroAnteriorH4);
        ImageView imageViewInfoH4 = (ImageView)findViewById(R.id.imageViewBtnInfoH4);
        TextView textViewEjercicioH4 = (TextView)findViewById(R.id.textViewEjercicioH4Info);

        Typeface RobotoRegular = Typeface.createFromAsset(this.getAssets(), "Roboto-Regular.ttf");
        Typeface RobotoThin = Typeface.createFromAsset(this.getAssets(), "Roboto-Thin.ttf");
        Typeface RobotoLight = Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");

        textViewEjercicioH4.setTypeface(RobotoLight);

    }

    public void onClickIVBtnH4Info(View view){
        abrirInfoH4 = new Intent(this, Hombros4Info.class);
        startActivity(abrirInfoH4);
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
        this.finish();
    }

    public void onClickIVBtnH4Volver(View view){
        abrirMusculos1 = new Intent(this, Musculos1.class);
        startActivity(abrirMusculos1);
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
        this.finish();
    }

    public void onClickIVBtnH4Siguiente(View view){
        abrirSiguienteH4 = new Intent(this, Hombros5.class);
        startActivity(abrirSiguienteH4);
        overridePendingTransition(R.animator.fast_fade_in, R.animator.fast_fade_out);
        this.finish();
    }


    public void onClickIVBtnH4Anterior(View view){
        abrirAnteriorH4 = new Intent(this, Hombros3.class);
        startActivity(abrirAnteriorH4);
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
