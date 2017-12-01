package com.joapps.crowdsource;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SubPage0 extends Fragment {


    public SubPage0() {
    }

    public void ButtonClick(View view) {
        Intent intent = new Intent(getActivity(), ProjectInfo.class);
        startActivity(intent);

    }
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_thread_feed, container, false);
        return rootView;

    }

}