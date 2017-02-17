package com.example.mcaner.yemektarifleri.activity;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.mcaner.yemektarifleri.R;

/**
 * Created by mcaner on 15.02.2017.
 */

public class BaseActivity extends AppCompatActivity {
    LinearLayout container;
    Toolbar toolbar;
    FrameLayout activityContent;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        container= (LinearLayout) getLayoutInflater().inflate(R.layout.activity_base,null);
        activityContent= (FrameLayout) container.findViewById(R.id.activityContent);
        getLayoutInflater().inflate(layoutResID,activityContent,true);
        super.setContentView(container);
        toolbar= (Toolbar) container.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
    public void setTitle(String title){
        getSupportActionBar().setTitle(title);
    }
}
