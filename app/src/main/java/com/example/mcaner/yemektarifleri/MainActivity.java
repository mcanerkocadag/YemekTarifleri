package com.example.mcaner.yemektarifleri;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.mcaner.yemektarifleri.activity.Kategoriler;
import com.example.mcaner.yemektarifleri.activity.Yazarlar;
import com.example.mcaner.yemektarifleri.adapter.ViewPagerAdapter;
import com.example.mcaner.yemektarifleri.fragment.FirstFragment;
import com.example.mcaner.yemektarifleri.fragment.SecondFragment;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    RelativeLayout content;
    //fragment  objeleri oluşturuldu
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= (Toolbar) findViewById(R.id.activityToolbar);
        drawerLayout= (DrawerLayout) findViewById(R.id.drawerLayout);
        navigationView= (NavigationView) findViewById(R.id.navigationView);
        content= (RelativeLayout) findViewById(R.id.content);
        tabLayout= (TabLayout) findViewById(R.id.tabLayout);
        viewPager= (ViewPager) findViewById(R.id.viewPager);
        viewPagerAyarla();
        toolbarAyarla();
        navigationViewAyarla();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void viewPagerAyarla() {
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(),"Menüler");
        adapter.addFragment(new SecondFragment(),"Bugün Ne Pişirsem ?");
        viewPager.setAdapter(adapter);
    }

    private void toolbarAyarla() {
        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawerOpened,R.string.drawerClosed){

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                content.setTranslationX(slideOffset*drawerView.getWidth());
            }
        };

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }


    private void navigationViewAyarla() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.kategoriItem: startActivity(new Intent(MainActivity.this, Kategoriler.class)); break;
                    case R.id.yazarItem:    startActivity(new Intent(MainActivity.this, Yazarlar.class)); break;
                    case R.id.xxItem:
                        Toast.makeText(getApplicationContext(),"Daha Bu sayfa oluşmadi!!",Toast.LENGTH_SHORT).show(); break;

                }
                return true;

            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                if(drawerLayout.isDrawerOpen(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.END);
                else
                    drawerLayout.openDrawer(GravityCompat.START);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

}
