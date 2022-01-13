package com.example.arachnid_2nd_trial.ui.downloads;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.arachnid_2nd_trial.databinding.FragmentDownloadsBinding;

public class Downloads_Main_Fragment extends Fragment {

    private Download_ViewModel downloadViewModel;
    private FragmentDownloadsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        downloadViewModel =
                new ViewModelProvider(this).get(Download_ViewModel.class);

        binding = FragmentDownloadsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}