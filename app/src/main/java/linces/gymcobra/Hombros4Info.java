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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Hombros4Info extends Activity {
    int contadorAtras=0;
    Intent cerrarH4Info;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hombros4info);

        ImageView imageViewCerrarH4Info = (ImageView)findViewById(R.id.imageViewCerrarH4Info);
        TextView textViewEjercicioH4Info = (TextView)findViewById(R.id.textViewEjercicioH4Info);
        TextView textViewInfoH4 = (TextView)findViewById(R.id.textViewInfoH4);


        Typeface RobotoRegular = Typeface.createFromAsset(this.getAssets(), "Roboto-Regular.ttf");
        Typeface RobotoThin = Typeface.createFromAsset(this.getAssets(), "Roboto-Thin.ttf");
        Typeface RobotoLight = Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");

        textViewEjercicioH4Info.setTypeface(RobotoLight);
        textViewInfoH4.setTypeface(RobotoLight);

    }

    public void onClickIVBtnH4InfoCerrar(View view){
        cerrarH4Info= new Intent(this, Hombros4.class);
        startActivity(cerrarH4Info);
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

