package com.example.company.areal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String title = getIntent().getStringExtra(DATALIST.COURSE_TITLE);
        TextView textViewdetail = (TextView) findViewById(R.id.textViewNEWTITLE);
        textViewdetail.setText(title);
        String content = getIntent().getStringExtra(DATALIST.NEW_CONTENT);
        TextView view2 = (TextView) findViewById(R.id.textViewNEW);
        view2.setText(content);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
