package org.techtown.imageresouce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import org.techtown.imageresouce.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        Resources resources = getResources();

        //Bitmap : JPG, PNG, GIF 등 파일로부터 읽어온 이미지 데이터를 관리
        Bitmap bitmap = BitmapFactory.decodeResource(resources, R.drawable.img_android);
        activityMainBinding.imageView3.setImageBitmap(bitmap);

        //Drawable : Bitmap을 포함한 다양한 타입으로 부터 이미지 데이터를 관리
        Drawable drawable = getDrawable(R.drawable.img_android);
        activityMainBinding.imageView4.setImageDrawable(drawable);

        // 버튼에 적용할 이미지를 생성한다
        Drawable drawable2 = getDrawable(R.drawable.btn_image);
        activityMainBinding.button.setBackground(drawable2);

        // 배경을 지정한다.
        activityMainBinding.container.setBackgroundResource(R.drawable.tile);

        // layer 이미지를 가져온다
        Drawable drawable3 = getDrawable(R.drawable.layer);
        activityMainBinding.imageView5.setImageDrawable(drawable3);
    }
}