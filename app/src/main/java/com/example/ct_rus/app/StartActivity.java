package com.example.ct_rus.app;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initSizes();


    }

    public void click(View v){
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }

    public void initSizes(){
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels;
        int height= displaymetrics.heightPixels;
       // ((ImageSwitcher)findViewById(R.id.imageSwitcher)).setImageResource(R.id.icon);
        findViewById(R.id.imageSwitcher).setLayoutParams(new LinearLayout.LayoutParams(width, (int)(height*0.47)));
        findViewById(R.id.randButton).setLayoutParams(new LinearLayout.LayoutParams((int)(width*0.5), (int)(height*0.2)));
        findViewById(R.id.allTestButton).setLayoutParams(new LinearLayout.LayoutParams((int)(width*0.5), (int)(height*0.2)));
        findViewById(R.id.statistic).setLayoutParams(new LinearLayout.LayoutParams((int)(width*0.5), (int)(height*0.2)));
        findViewById(R.id.other).setLayoutParams(new LinearLayout.LayoutParams((int)(width*0.5), (int)(height*0.2)));
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
