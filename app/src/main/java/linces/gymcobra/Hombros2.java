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

public class Hombros2 extends Activity {
    int contadorAtras=0, contadorIntentos=0, Combinacion=0, Comb1=3, Comb2=10, Comb3=101, Comb4=1000;
    Intent abrirMusculos1, abrirInfoH2, abrirAnteriorH2, abrirsiguienteH2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hombros2);

        ImageView imageViewVolverH2 = (ImageView)findViewById(R.id.imageViewVolverH2);
        ImageView imageViewHombroSiguienteH2 = (ImageView)findViewById(R.id.imageViewHombroSiguienteH2);
        ImageView imageViewHombroAnteriorH2 = (ImageView)findViewById(R.id.imageViewHombroAnteriorH2);
        ImageView imageViewInfoH2 = (ImageView)findViewById(R.id.imageViewBtnInfoH2);
        TextView textViewEjercicioH2 = (TextView)findViewById(R.id.textViewEjercicioH2Info);

        Typeface RobotoRegular = Typeface.createFromAsset(this.getAssets(), "Roboto-Regular.ttf");
        Typeface RobotoThin = Typeface.createFromAsset(this.getAssets(), "Roboto-Thin.ttf");
        Typeface RobotoLight = Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");

        textViewEjercicioH2.setTypeface(RobotoLight);

    }

    public void onClickIVBtnH2Info(View view){
        abrirInfoH2 = new Intent(this, Hombros2Info.class);
        startActivity(abrirInfoH2);
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
        this.finish();
    }

    public void onClickIVBtnH2Volver(View view){
        abrirMusculos1 = new Intent(this, Musculos1.class);
        startActivity(abrirMusculos1);
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
        this.finish();
    }

    public void onClickIVBtnH1Siguiente(View view){
        abrirsiguienteH2 = new Intent(this, Hombros3.class);
        startActivity(abrirsiguienteH2);
        overridePendingTransition(R.animator.fast_fade_in, R.animator.fast_fade_out);
        this.finish();
    }

    public void onClickIVBtnH1Anterior(View view){
        abrirAnteriorH2 = new Intent(this, Hombros1.class);
        startActivity(abrirAnteriorH2);
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

