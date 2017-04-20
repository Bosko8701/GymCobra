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

public class Hombros5 extends Activity {
    int contadorAtras=0;
    Intent abrirMusculos1, abrirInfoH5, abrirAnteriorH5, abrirSiguienteH5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hombros5);

        ImageView imageViewVolverH5 = (ImageView)findViewById(R.id.imageViewVolverH5);
        ImageView imageViewHombroSiguienteH5 = (ImageView)findViewById(R.id.imageViewHombroSiguienteH5);
        ImageView imageViewHombroAnteriorH5 = (ImageView)findViewById(R.id.imageViewHombroAnteriorH5);
        ImageView imageViewInfoH5 = (ImageView)findViewById(R.id.imageViewBtnInfoH5);
        TextView textViewEjercicioH5Info = (TextView)findViewById(R.id.textViewEjercicioH5Info);

        Typeface RobotoRegular = Typeface.createFromAsset(this.getAssets(), "Roboto-Regular.ttf");
        Typeface RobotoThin = Typeface.createFromAsset(this.getAssets(), "Roboto-Thin.ttf");
        Typeface RobotoLight = Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");

        textViewEjercicioH5Info.setTypeface(RobotoLight);

    }


    public void onClickIVBtnH5Info(View view){
        abrirInfoH5 = new Intent(this, Hombros5Info.class);
        startActivity(abrirInfoH5);
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
        this.finish();
    }

    public void onClickIVBtnH5Volver(View view){
        abrirMusculos1 = new Intent(this, Musculos1.class);
        startActivity(abrirMusculos1);
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
        this.finish();
    }

    public void onClickIVBtnH5Siguiente(View view){
        abrirSiguienteH5 = new Intent(this, Hombros6.class);
        startActivity(abrirSiguienteH5);
        overridePendingTransition(R.animator.fast_fade_in, R.animator.fast_fade_out);
        this.finish();
    }


    public void onClickIVBtnH5Anterior(View view){
        abrirAnteriorH5 = new Intent(this, Hombros4.class);
        startActivity(abrirAnteriorH5);
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
