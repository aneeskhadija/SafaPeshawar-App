package com.zeeroapps.wssp.fragments;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.zeeroapps.wssp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class GarbageFragment extends Fragment {


    public GarbageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_garbage, container, false);
    }

}
