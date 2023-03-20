package org.techtown.localiiztion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.techtown.localiiztion.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.imageView2.setImageResource(R.drawable.flag1);
        activityMainBinding.textView2.setText(R.string.str1);
    }
}