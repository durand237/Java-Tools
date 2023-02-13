package com.example.sweethome;

import android.content.ClipData;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.navigation.NavigationBarItemView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationItemView bottomNavigationItemView;
    home home = new home();
    favoris favoris = new favoris();
    contacts contacts = new contacts();
    info info = new info();
    moi moi = new moi();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragment(home);
        bottomNavigationItemView = findViewById(R.id.fragmentContainerView);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, home).commit();
        bottomNavigationItemView.setOmItemSelectedListener(new NavigationBarItemView.onItemselectedlistener() {
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        replaceFragment(home);
                        break;
                    case R.id.favoris:
                        replaceFragment(favoris);
                        break;
                    case R.id.contacts:
                        replaceFragment(contacts);
                        break;
                    case R.id.info:
                        replaceFragment(info);
                        break;
                    case R.id.moi:
                        replaceFragment(moi);
                        break;
                }
                return false;
            }
        });
    }
    private void replaceFragment(Fragment fragment ) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment);
        fragmentTransaction.commit();
    }

}