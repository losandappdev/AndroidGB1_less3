package com.n.lesson3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText editText1;
    private EditText editText2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if (savedInstanceState != null){
//            String str1 = savedInstanceState.getString(EXTRA_KEY);
//            String str2 = savedInstanceState.getString(EXTRA_KEY1);
//        }
//
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.simpleButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str1 = editText1.getText().toString();
                String str2 = editText2.getText().toString();
                Log.d(TAG, "onClick: "+ str1 + str2);


                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra(Main2Activity.EXTRA_KEY1, editText1.getText().toString());

                int x = Integer.parseInt(editText2.getText().toString());
                intent.putExtra(Main2Activity.EXTRA_KEY1, x);

                startActivity(intent);
            }
        });

    }
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        String str1 = editText1.getText().toString();
//        String str2 = editText2.getText().toString();
//
//        outState.putString(EXTRA_KEY, str1);
//        outState.putString(EXTRA_KEY1, str2);
//
//        Log.d(TAG, "onSaveInstanceState: " + str1 + str2);
//
//    }
//    @Override
//    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        String str1 = savedInstanceState.getString(EXTRA_KEY);
//        String str2 = savedInstanceState.getString(EXTRA_KEY1);
//        editText1.setText(str1);
//        editText2.setText(str2);
//
//    }


}
