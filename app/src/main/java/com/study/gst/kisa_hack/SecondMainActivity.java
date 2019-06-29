package com.study.gst.kisa_hack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.study.gst.kisa_hack.fragment.PeopleFragment;
import com.study.gst.kisa_hack.fragment.SecondPeopleFragment;
public class SecondMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.secondmainactivity_bottomnavigationview);

        getFragmentManager().beginTransaction().replace(R.id.secondmainactivity_framelayout, new SecondPeopleFragment()).commit();

    }
}
