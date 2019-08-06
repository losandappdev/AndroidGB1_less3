package com.n.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Main2Activity";

    public static final String EXTRA_KEY1 ="EXTRA_KEY1";
    public static final String EXTRA_KEY2 ="EXTRA_KEY2";

    private TextView textView1;
    private  TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       String str =  getIntent().getStringExtra(EXTRA_KEY1);
       int x = getIntent().getIntExtra(EXTRA_KEY2, -1);

        Log.d(TAG, "onCreate: "+ str);
        Log.d(TAG, "onCreate: " + x);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
//
        textView1.setText(str);
        textView2.setText(String.valueOf(x));
    }
}
