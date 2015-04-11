package com.example.mervetop.newproject;

import com.example.mervetop.newproject.R;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String KEY = "TEXTEINGABE";
    public static final int REQUEST_ID = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edit = (EditText) findViewById(R.id.editText);



        Button b = (Button) findViewById(R.id.buttonzumzweiten);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ZweitesActivity.class);
                i.putExtra(KEY, edit.getText().toString());
                startActivityForResult(i, REQUEST_ID);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_ID) {
            if (resultCode == RESULT_OK) {
                String retValue = data.getStringExtra(ZweitesActivity.RETVAL_KEY);
                EditText edit = (EditText) findViewById(R.id.editText);
                edit.setText(retValue);
            }
        }
    }}





