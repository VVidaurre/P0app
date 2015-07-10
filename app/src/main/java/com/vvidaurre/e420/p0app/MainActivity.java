package com.vvidaurre.e420.p0app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button spotify_app_btn = (Button)findViewById(R.id.spotify_app_btn);
        Button score_app_btn = (Button)findViewById(R.id.score_app_btn);
        Button library_app_btn = (Button)findViewById(R.id.library_app_btn);
        Button build_app_btn = (Button)findViewById(R.id.build_app_btn);
        Button reader_app_btn = (Button)findViewById(R.id.reader_app_btn);
        Button my_own_app_btn = (Button)findViewById(R.id.my_own_app_btn);
        final Context context = getApplicationContext();
       final  int duration = Toast.LENGTH_LONG;


        spotify_app_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = context.getString(R.string.spotify_app_toast_text);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        score_app_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = context.getString(R.string.score_app_toast_text);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        library_app_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = context.getString(R.string.library_app_toast_text);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        build_app_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = context.getString(R.string.build_app_toast_text);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        reader_app_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = context.getString(R.string.reader_app_toast_text);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        my_own_app_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = context.getString(R.string.my_own_app_toast_text);
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
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
