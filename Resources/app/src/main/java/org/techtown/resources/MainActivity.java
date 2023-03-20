package org.techtown.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import org.techtown.resources.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        Button1ClcikListener button1ClcikListener = new Button1ClcikListener();
        activityMainBinding.button.setOnClickListener(button1ClcikListener);

        Button2ClickListener button2ClickListener = new Button2ClickListener();
        activityMainBinding.button2.setOnClickListener(button2ClickListener);

        Button3CLcikListener button3CLcikListener = new Button3CLcikListener();
        activityMainBinding.button3.setOnClickListener(button3CLcikListener);

        Button4ClcikListener button4ClcikListener = new Button4ClcikListener();
        activityMainBinding.button4.setOnClickListener(button4ClcikListener);

        Button5ClickListener button5ClickListener = new Button5ClickListener();
        activityMainBinding.button5.setOnClickListener(button5ClickListener);
    }

    class Button1ClcikListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            // 직접 문자열을 설정한다
            //activityMainBinding.textView.setText("반갑습니다");

            // res 폴더에 있는 리소스를 관리하는 객체를 추출한다.
            //Resources resources = getResources();
            // 문자열을 가지고 온다
            // res 폴더 ->R
            //String str1 = resources.getString(R.string.str2);
            //activityMainBinding.textView.setText(str1);

            // 문자열을 굉장히 많이 사용하는 요소이기 때문에
            // Activity가 getString이라는 메서드를 제공하고 있다.
            //String str1 = getString(R.string.str2);
            //activityMainBinding.textView.setText(str1);

            // 텍스트뷰에 리소스ID를 지접 지정할 수 있다
            activityMainBinding.textView.setText(R.string.str2);

        }
    }

    class Button2ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            // 문자열을 가지고 온다
            String str1 = getString(R.string.str3);
            // 포멧 문자 부분에 바인딩될 값을 지정하여 문자열을 완성한다.
            String str2 = String.format(str1, "홍길동", 30);

            activityMainBinding.textView.setText(str2);
        }
    }

    class Button3CLcikListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Resources resources = getResources();
            // 등록된 문자열 배열을 가져온다
            String[] data_list = resources.getStringArray(R.array.data_array);

            activityMainBinding.textView.setText("");

            for (String str1 : data_list) {
                activityMainBinding.textView.append(str1 + '\n');
            }
        }
    }

    class Button4ClcikListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            // 사전 정의된 색상값 사용
            /*
           activityMainBinding.textView.setTextColor(Color.BLUE);
            */


            //RGB지정
            /*
            int color = Color.rgb(26,186,129);
            activityMainBinding.textView.setTextColor(color);
            */

            // ARGB 지정
            /*
            int color = Color.argb(50, 26, 106, 129);
            activityMainBinding.textView.setTextColor(color);
            */

            // Rsource로 정의된 색상값을 가져온다
            /*
            Resources resources = getResources();
            int color = resources.getColor(R.color.color1);
            activityMainBinding.textView.setTextColor(color);
            */

            // 색상 값도 자주 사용하기 때문에 메서드를 따로 제공한다.
            /*int color = getColor(R.color.color1);
            activityMainBinding.textView.setTextColor(color);
            */

            /*
            int color = getColor(R.color.color2);
            activityMainBinding.textView.setTextColor(color);
            */

            /*
            int color = getColor(R.color.color3);
            activityMainBinding.textView.setTextColor(color);
            */
            int color = getColor(R.color.color4);
            activityMainBinding.textView.setTextColor(color);
        }
    }

    class Button5ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Resources resources = getResources();

            float px = resources.getDimension(R.dimen.px);
            float dp = resources.getDimension(R.dimen.dp);
            float sp = resources.getDimension(R.dimen.sp);
            float inch = resources.getDimension(R.dimen.inch);
            float mm = resources.getDimension(R.dimen.mm);
            float pt = resources.getDimension(R.dimen.pt);

            activityMainBinding.textView.setText("px : " + px + "\n");
            activityMainBinding.textView.append("dp : " + dp + "\n");
            activityMainBinding.textView.append("sp : " + sp + "\n");
            activityMainBinding.textView.append("inch : " + inch + "\n");
            activityMainBinding.textView.append("mm : " + mm + "\n");
            activityMainBinding.textView.append("pt : " + pt + "\n");
        }
    }
}