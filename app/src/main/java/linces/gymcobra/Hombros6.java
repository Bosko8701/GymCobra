package linces.gymcobra;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jose- on 22/09/2016.
 */
public class Hombros6 extends Activity {

    Intent abrirPrincipal, abrirInfo, abrirSiguiente;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hombros6);

        ImageView imageTituloH6 = (ImageView)findViewById(R.id.imageTituloH6);
        ImageView imageImagenH6 = (ImageView)findViewById(R.id.imageImagenH6);
        ImageView imageInfoH6 = (ImageView)findViewById(R.id.imageInfoH6);
        ImageView imageVolverH6 = (ImageView)findViewById(R.id.imageVolverH6);
        ImageView imageSiguienteH6 = (ImageView)findViewById(R.id.imageSiguienteH6);
        TextView textViewDescripcionH6 = (TextView)findViewById(R.id.textViewDescripcionH6);

        Typeface Letrachingona = Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");

        textViewDescripcionH6.setTypeface(Letrachingona);
    }

    public void onClickIVInformacionH6(View view){

        abrirInfo = new Intent(this, Hombros1Info.class);
        startActivity(abrirInfo);
        this.finish();

    }

    public void onClickIVVolverH6(View view){

        abrirPrincipal = new Intent(this, Musculos1.class);
        startActivity(abrirPrincipal);
        this.finish();

    }

    public void onClickIVSiguienteH6(View view){

        abrirSiguiente = new Intent(this, Hombros2.class);
        startActivity(abrirSiguiente);
        this.finish();

    }

}
