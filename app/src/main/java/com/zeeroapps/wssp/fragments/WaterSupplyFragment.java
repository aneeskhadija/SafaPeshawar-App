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
public class WaterSupplyFragment extends Fragment {


    public WaterSupplyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_water_supply, container, false);
    }

}
