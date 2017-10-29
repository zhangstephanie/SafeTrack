package com.example.safetrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    private int time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        EditText editTextName = (EditText) findViewById(R.id.editText);
        editTextName.setOnEditorActionListener(new TextView.OnEditorActionListener(){
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent){
                boolean handeled = false;
                if (i == EditorInfo.IME_ACTION_NEXT) {
                    String inputText = textView.getText().toString();
                    int timeTemp = Integer.parseInt(inputText);
                    Toast.makeText(Settings.this, "Time is:" + inputText, Toast.LENGTH_SHORT).show();
                }
                return handeled;
            }
        });
    }



}