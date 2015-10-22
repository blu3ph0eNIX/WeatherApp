package com.example.android.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailFragment extends Fragment {

    public DetailFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        Intent intent = getActivity().getIntent();

        if(intent != null & intent.hasExtra(intent.EXTRA_TEXT)){
            String forecastStr = intent.getStringExtra(intent.EXTRA_TEXT);
            TextView textView = (TextView) rootView.findViewById(R.id.detailFragment_TextView);
            textView.setText(forecastStr);
        }

        return rootView;
    }
}
