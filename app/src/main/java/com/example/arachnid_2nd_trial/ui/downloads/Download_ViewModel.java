package com.example.arachnid_2nd_trial.ui.downloads;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Download_ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Download_ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is downloads fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}