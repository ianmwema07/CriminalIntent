package com.example.criminalintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class CrimeActivity extends AppCompatActivity {

    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}