package com.ananth.scrollingtechniques;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView mToolbarOffScreen;
    private TextView mToolbarWithTab;
    private TextView mFelxibleSpace;
    private TextView mFelxibleSpaceWithImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back_arrow);

        mToolbarOffScreen = (TextView) findViewById(R.id.toolbar_off_screen);
        mToolbarWithTab = (TextView) findViewById(R.id.toolbar_off_with_tab_screen);
        mFelxibleSpace = (TextView) findViewById(R.id.flexible_space);
        mFelxibleSpaceWithImage = (TextView) findViewById(R.id.flexible_space_with_image);
        mToolbarOffScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ToolbarOffScreen.class));
            }
        });

        mToolbarWithTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ToolbarOffWithTab.class));
            }
        });

        mFelxibleSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ToolbarWithFlexibleSpace.class));
            }
        });
        mFelxibleSpaceWithImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FlexibleSpaceWithImage.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return true;
    }
}
