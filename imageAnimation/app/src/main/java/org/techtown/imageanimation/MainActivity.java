package org.techtown.imageanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import org.techtown.imageanimation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        // 애니메이션 이미지를 설정해준다
        activityMainBinding.imageView2.setImageResource(R.drawable.ani_data);

        // Drawable 객체를 생성해서 넣어준다
        Drawable drawable = getDrawable(R.drawable.ani_data);
        activityMainBinding.imageView3.setImageDrawable(drawable);

        Button1ClickListener button1ClickListener = new Button1ClickListener();
        activityMainBinding.button.setOnClickListener(button1ClickListener);

        Button2ClickListener button2ClickListener = new Button2ClickListener();
        activityMainBinding.button2.setOnClickListener(button2ClickListener);
    }

    class Button1ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            // 애니메이션 이미지 객체를 추출한다.
            AnimationDrawable animationDrawable = (AnimationDrawable) activityMainBinding.imageView.getDrawable();
            AnimationDrawable animationDrawable2 = (AnimationDrawable) activityMainBinding.imageView2.getDrawable();
            AnimationDrawable animationDrawable3 = (AnimationDrawable) activityMainBinding.imageView3.getDrawable();
            // 애니메이션 가동
            animationDrawable.start();
            animationDrawable2.start();
            animationDrawable3.start();
        }
    }

    class Button2ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            AnimationDrawable animationDrawable = (AnimationDrawable) activityMainBinding.imageView.getDrawable();
            AnimationDrawable animationDrawable2 = (AnimationDrawable) activityMainBinding.imageView2.getDrawable();
            AnimationDrawable animationDrawable3 = (AnimationDrawable) activityMainBinding.imageView3.getDrawable();

            // 애니메이션 중지
            animationDrawable.stop();
            animationDrawable2.stop();
            animationDrawable3.stop();
        }
    }
}