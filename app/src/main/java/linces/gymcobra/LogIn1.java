package linces.gymcobra;

/**
 * Created by jose- on 09/12/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn1 extends Activity {

    int contadorAtras=0, contadorAceptar=0;
    Intent abrirLogin2, cerrarLogin1;
    EditText editTextUsuario;
    public static final int segundos=1;
    public static int milisegundos=segundos*1000;
    public static final  int delay=2;
    private ProgressBar pBCargarL2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login1);
        pBCargarL2 = (ProgressBar) findViewById(R.id.pBCargarL2);
        pBCargarL2.setMax(maximo_progreso());
        comenzarAnimacion();


        ImageView imageViewBotonSiguienteL1 = (ImageView)findViewById(R.id.imageViewBotonSiguienteL1);
        EditText editTextUsuario = (EditText)findViewById(R.id.editTextUsuario);
        TextView textViewBienvenido = (TextView)findViewById(R.id.textViewBienvenido);

        Typeface RobotoRegular = Typeface.createFromAsset(this.getAssets(), "Roboto-Regular.ttf");
        Typeface RobotoThin = Typeface.createFromAsset(this.getAssets(), "Roboto-Thin.ttf");
        Typeface RobotoLight = Typeface.createFromAsset(this.getAssets(), "Roboto-Light.ttf");

        editTextUsuario.setTypeface(RobotoLight);
        textViewBienvenido.setTypeface(RobotoLight);


    }




    public void comenzarAnimacion()
    {

    }

    public int establecer_progreso(long miliseconds)
    {
        return (int)((milisegundos=milisegundos)/1000);
    }

    public int maximo_progreso()
    {
        return  segundos-delay;
    }


    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.splash_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void onClickIVBtnAceptarL1(View view){
        EditText editTextUsuario = (EditText)findViewById(R.id.editTextUsuario);
        String Usuario = editTextUsuario.getText().toString();

        if(Usuario.matches("Bosko")||Usuario.matches("Fernando")||Usuario.matches("Usuario UNE")) {

            if(Usuario.matches("Bosko")){
                //animacion imagen usuario bosko
                ImageView imageViewUsuario = (ImageView)findViewById(R.id.imageViewUsuario);
                ImageView imageViewUsuarioBosko = (ImageView)findViewById(R.id.imageViewUsuarioBosko);
                Animation fast_fade_out = AnimationUtils.loadAnimation(LogIn1.this,R.anim.fast_fade_out);
                Animation middle_fade_in = AnimationUtils.loadAnimation(LogIn1.this,R.anim.middle_fade_in);
                imageViewUsuario.startAnimation(fast_fade_out);
                imageViewUsuario.setVisibility(view.INVISIBLE);
                imageViewUsuarioBosko.startAnimation(middle_fade_in);
                imageViewUsuarioBosko.setVisibility(view.VISIBLE);
            }

            if(Usuario.matches("Fernando")){
                //animacion imagen usuario fernando
                ImageView imageViewUsuario = (ImageView)findViewById(R.id.imageViewUsuario);
                ImageView imageViewUsuarioFernando = (ImageView)findViewById(R.id.imageViewUsuarioFernando);
                Animation fast_fade_out = AnimationUtils.loadAnimation(LogIn1.this,R.anim.fast_fade_out);
                Animation middle_fade_in = AnimationUtils.loadAnimation(LogIn1.this,R.anim.middle_fade_in);
                imageViewUsuario.startAnimation(fast_fade_out);
                imageViewUsuario.setVisibility(view.INVISIBLE);
                imageViewUsuarioFernando.startAnimation(middle_fade_in);
                imageViewUsuarioFernando.setVisibility(view.VISIBLE);
            }

            if(Usuario.matches("Usuario UNE")){
                //animacion imagen usuario bosko
                ImageView imageViewUsuario = (ImageView)findViewById(R.id.imageViewUsuario);
                ImageView imageViewUsuarioUNE = (ImageView)findViewById(R.id.imageViewUsuarioUNE);
                Animation fast_fade_out = AnimationUtils.loadAnimation(LogIn1.this,R.anim.fast_fade_out);
                Animation middle_fade_in = AnimationUtils.loadAnimation(LogIn1.this,R.anim.middle_fade_in);
                imageViewUsuario.startAnimation(fast_fade_out);
                imageViewUsuario.setVisibility(view.INVISIBLE);
                imageViewUsuarioUNE.startAnimation(middle_fade_in);
                imageViewUsuarioUNE.setVisibility(view.VISIBLE);
            }



            contadorAceptar=contadorAceptar+1;
            if(contadorAceptar==1) {
                TextView textViewBienvenido = (TextView)findViewById(R.id.textViewBienvenido);
                Animation fade_in = AnimationUtils.loadAnimation(LogIn1.this,R.anim.fade_in);
                Animation fast_fade_out = AnimationUtils.loadAnimation(LogIn1.this,R.anim.fast_fade_out);

                textViewBienvenido.setText(("Bienvenido ")+(editTextUsuario.getText()) + ("\nPresiona para continuar"));
                textViewBienvenido.startAnimation(fade_in);
                textViewBienvenido.setVisibility(View.VISIBLE);
                ImageView imageViewBotonSiguienteL1 = (ImageView) findViewById(R.id.imageViewBotonSiguienteL1);
                ImageView imageViewBotonAceptar = (ImageView) findViewById(R.id.imageViewBotonAceptar);
                editTextUsuario.setKeyListener(null);
                editTextUsuario.startAnimation(fast_fade_out);
                editTextUsuario.setVisibility(view.INVISIBLE);
                imageViewBotonSiguienteL1.startAnimation(fade_in);
                imageViewBotonSiguienteL1.setVisibility(View.VISIBLE);
                imageViewBotonAceptar.startAnimation(fast_fade_out);
                imageViewBotonAceptar.setVisibility(View.INVISIBLE);
            }
        }
        else{
            Toast.makeText(getApplicationContext(), "      Usuario incorrecto\nIngrese un nombre valido", Toast.LENGTH_SHORT).show();
        }

    }




    public void onClickIVBtnSiguienteL1(View view) {
        TextView textViewBienvenido = (TextView)findViewById(R.id.textViewBienvenido);
        ImageView imageViewBotonSiguienteL1 = (ImageView)findViewById(R.id.imageViewBotonSiguienteL1);
        Animation fast_fade_out = AnimationUtils.loadAnimation(LogIn1.this,R.anim.fast_fade_out);
        Animation middle_fade_out = AnimationUtils.loadAnimation(LogIn1.this,R.anim.middle_fade_out);
        textViewBienvenido.startAnimation(fast_fade_out);
        textViewBienvenido.setVisibility(View.INVISIBLE);
        imageViewBotonSiguienteL1.startAnimation(middle_fade_out);
        imageViewBotonSiguienteL1.setVisibility(view.INVISIBLE);
        pBCargarL2.setVisibility(View.VISIBLE);

        new CountDownTimer(milisegundos, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                pBCargarL2.setProgress(establecer_progreso(millisUntilFinished));
            }

            @Override
            public void onFinish() {

                Intent nuevoform = new Intent(LogIn1.this, LogIn2.class);
                startActivity(nuevoform);
                overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
                finish();

            }
        }.start();



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
