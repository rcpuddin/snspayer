package com.example.kimby.snspayer;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    android.support.v4.app.FragmentManager fm;
    android.support.v4.app.FragmentTransaction tran;
    PostFragment postFragment;
    MapFragment mapFragment;
    SearchFragment searchFragment;
    FreindFragment freindFragment;
    SetFragment settingFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postFragment = new PostFragment();
        mapFragment = new MapFragment();
        searchFragment = new SearchFragment();
        freindFragment = new FreindFragment();
        settingFragment = new SetFragment();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                fm = getSupportFragmentManager();
                tran = fm.beginTransaction();
                switch (item.getItemId()) {
                    case R.id.action_post:
                        tran.replace(R.id.main_frame, postFragment);
                        tran.commit();
                        break;
                    case R.id.action_map:
                        tran.replace(R.id.main_frame, mapFragment);
                        tran.commit();
                        break;
                    case R.id.action_search:
                        tran.replace(R.id.main_frame, searchFragment);
                        tran.commit();
                        break;
                    case R.id.action_freind:
                        tran.replace(R.id.main_frame, freindFragment);
                        tran.commit();
                        break;
                    case R.id.action_setting:
                        tran.replace(R.id.main_frame, settingFragment);
                        tran.commit();
                        break;
                }
                return true;
            }
        });
    }
}
