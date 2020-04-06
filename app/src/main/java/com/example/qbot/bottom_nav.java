package com.example.qbot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class bottom_nav extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    BottomNavigationView bot_nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        bot_nav = findViewById(R.id.bottom_navigation_view);

        bot_nav.setOnNavigationItemSelectedListener(this);

        bot_nav.setSelectedItemId(R.id.home_nav);

    }

    home_fragment hf = new home_fragment();
    event_fragment ef = new event_fragment();
   chatBot_fragment cf= new chatBot_fragment();
    user_fragment uf =  new user_fragment();
   map_fragment mf = new map_fragment();
    //new_faculty nf =new new_faculty();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        switch (item.getItemId())
        {
            case R.id.home_nav:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,hf).addToBackStack(null).commit();
                return  true;

            case R.id.map_nav:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,mf).addToBackStack(null).commit();
                return  true;

            case R.id.cbot_nav:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,cf).addToBackStack(null).commit();
                return  true;

            case R.id.events_nav:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,ef).addToBackStack(null).commit();
                return  true;

          //  case R.id.user_nav:
            //    getSupportFragmentManager().beginTransaction().replace(R.id.container,uf).addToBackStack(null).commit();
              //  return  true;
        }
        return false;
    }
}

