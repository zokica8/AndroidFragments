package com.example.fragmentsandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.fragmentsandroid.fragments.FragmentOne;
import com.example.fragmentsandroid.fragments.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeFragement(View view) {
        Fragment fragment = null;

        if(view == view.findViewById(R.id.btn_1)) {
            fragment = new FragmentOne();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id, fragment);
            ft.commit();
        }

        if(view == view.findViewById(R.id.btn_2)) {
            fragment = new FragmentTwo();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id, fragment);
            ft.commit();
        }

    }
}
