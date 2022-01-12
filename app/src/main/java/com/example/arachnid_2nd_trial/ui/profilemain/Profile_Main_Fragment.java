package com.example.arachnid_2nd_trial.ui.profilemain;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arachnid_2nd_trial.R;

public class Profile_Main_Fragment extends Fragment {

    private ProfileMain_ViewModel mViewModel;

    public static Profile_Main_Fragment newInstance() {
        return new Profile_Main_Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.profile__main__fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ProfileMain_ViewModel.class);
        // TODO: Use the ViewModel
    }

}