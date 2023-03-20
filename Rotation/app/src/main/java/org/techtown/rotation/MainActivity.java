package org.techtown.rotation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.techtown.rotation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    // 액티비티 처음 생성되어 화면을 구성하고자 할 떄
    // 화면 회전이 발생했을 때
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        Log.d("test", "on Create");

        // 화면 회전이 발생했을 떄만 처리한다.
        if (savedInstanceState != null) {
            // 복원한다.
            String str1 = savedInstanceState.getString("data1");
            activityMainBinding.textView.setText(str1);
        }

        Button1ClickListener button1ClickListener = new Button1ClickListener();
        activityMainBinding.button.setOnClickListener(button1ClickListener);
    }

    class Button1ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String str1 = activityMainBinding.editText.getText().toString();
            activityMainBinding.textView.setText(str1);
        }
    }

    // 화면 회전이 발생했을 때 호출되는 메서드
    // 새롭게 나타난 화면의 UI에 설정해줄 값을 저장한다.

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        // 화면 복원을 위해 필요한 데이터를 저장한다
        String str1 = activityMainBinding.textView.getText().toString();
        //저장한다
        outState.putString("data1", str1);
    }
}