package com.example.arachnid_2nd_trial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.arachnid_2nd_trial.ui.profilemain.Profile_Main_Fragment;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Profile_Main_Fragment.newInstance())
                    .commitNow();
        }
    }
}