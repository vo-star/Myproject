package com.hfad.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    int TASK_ACTIVITY = 0;
    int AGREE_ACTIVITY = 0;
    int SEATING_ACTIVITY = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Task:
                Intent i = new Intent(this, Task.class);
                startActivityForResult(i, TASK_ACTIVITY);
                return true;
            case R.id.Agree:
                Intent in = new Intent(this, Agree.class);
                startActivityForResult(in, AGREE_ACTIVITY);
                return true;
            case R.id.Setings:
                Intent it = new Intent(this, Seting.class);
                startActivityForResult(it, SEATING_ACTIVITY);
                return true;
        }
        return false;
    }

}

