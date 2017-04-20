package linces.gymcobra;

/**
 * Created by jose- on 09/12/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

public class Splash extends Activity{

    public static final int segundos=4;
    public static int milisegundos=segundos*1000;
    public static final  int delay=2;
    private ProgressBar pBProgreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        pBProgreso = (ProgressBar) findViewById(R.id.pBProgreso);
        pBProgreso.setMax(maximo_progreso());
        comenzarAnimacion();

    }

    public void comenzarAnimacion()
    {
        new CountDownTimer(milisegundos, 1000)
        {

            @Override
            public void onTick(long millisUntilFinished) {
                pBProgreso.setProgress(establecer_progreso(millisUntilFinished));
            }

            @Override
            public void onFinish() {
                Intent nuevoform=new Intent(Splash.this, LogIn1.class);
                startActivity(nuevoform);
                overridePendingTransition(R.animator.slow_fade_in, R.animator.slow_fade_out);
                finish();
            }
        }.start();
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

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            // do something on back.
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }




}
