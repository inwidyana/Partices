package com.joapps.crowdsource;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SubPage0 extends android.support.v4.app.Fragment {

    Button button;





    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_thread_feed, container, false);

        button = (Button) rootView.findViewById(R.id.but1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
                // Your Code Lines
            });
        return rootView;

    }



}