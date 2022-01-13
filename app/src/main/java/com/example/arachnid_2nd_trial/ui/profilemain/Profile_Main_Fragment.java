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
import com.example.arachnid_2nd_trial.databinding.FragmentHomeBinding;
import com.example.arachnid_2nd_trial.ui.home.HomeViewModel;

public class Profile_Main_Fragment extends Fragment {

    private ProfileMain_ViewModel mViewModel;
    private FragmentHomeBinding binding;

    public static Profile_Main_Fragment newInstance() {
        return new Profile_Main_Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ProfileMain_ViewModel.class);
        // TODO: Use the ViewModel
    }

}