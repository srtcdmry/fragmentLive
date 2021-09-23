package com.info.fragmentlive;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
        private MutableLiveData<CharSequence> text = new MutableLiveData<>();
        //private MutableLiveData<Integer> sonuc = new MutableLiveData<>();

        public void setText(CharSequence input) {
            text.setValue(input);
        }

        public LiveData<CharSequence> getText() {
            return text;
        }
    }

