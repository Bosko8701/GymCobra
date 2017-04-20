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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Hombros1Info extends Activity {
    int contadorAtras=0;
    Intent cerrarH1Info;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hombros1info);

        ImageView imageViewCerrarH1Info = (ImageView)findViewById(R.id.imageViewCerrarH1Info);
        TextView textViewEjercicioH1Info = (TextView)findViewById(R.id.textViewEjercicioH1Info);
        TextView textViewInfoH1 = (TextView)findViewById(R.id.textViewInfoH1);

        Typeface RobotoRegular = Typeface.createFromAsset(this.getAssets(), "Roboto-Regular.ttf");
        Typeface RobotoThin = Typeface.createFromAsset(this.getAssets(), "Roboto-Thin.ttf");
        Typeface RobotoLight = Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");

        textViewEjercicioH1Info.setTypeface(RobotoLight);
        textViewInfoH1.setTypeface(RobotoLight);

    }

    public void onClickIVBtnH1InfoCerrar(View view){
        cerrarH1Info= new Intent(this, Hombros1.class);
        startActivity(cerrarH1Info);
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

