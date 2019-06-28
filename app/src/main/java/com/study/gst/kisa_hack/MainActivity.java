package com.study.gst.kisa_hack;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.study.gst.kisa_hack.fragment.PeopleFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction().replace(R.id.mainactivity_framelayout, new PeopleFragment()).commit();
    }
}
