package com.example.lesson2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = -1;
    private int mGenap = 0;
    private TextView mShowCount;
    private TextView mShowGenap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);
   /*     mShowGenap = (TextView) findViewById(R.id.show_genap);*/

    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_LONG);
        toast.show();
    }
    public void countUp(View view) {
        mCount += 2;
        mGenap = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
    public void countDown(View view) {
        mGenap += 2;
        mCount = -1;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mGenap));
    }
}