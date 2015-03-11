package com.example.lenovo.deslid_button;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
/*    protected EditText username;
    protected EditText juliocsar;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

  /*      username = (EditText) findViewById(R.id.usuario);
        Typeface fontusuario = Typeface.createFromAsset(getAssets(), "Balkeno.ttf");
        username.setTypeface(fontusuario);

        juliocsar = (EditText) findViewById(R.id.julio);
        Typeface fontjuliocsar = Typeface.createFromAsset(getAssets(), "Balkeno.ttf");
        juliocsar.setTypeface(fontjuliocsar);
*/
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
