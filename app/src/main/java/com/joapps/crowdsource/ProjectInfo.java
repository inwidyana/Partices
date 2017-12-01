package com.joapps.crowdsource;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class ProjectInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_info);


        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            if(bundle.getString("some")!=null){
                Toast.makeText(getApplicationContext(),"data :" + bundle.getString("some"), Toast.LENGTH_SHORT).show();
            }

        }
    }

}
