package com.example.mervetop.newproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ZweitesActivity extends Activity {
    public static final String RETVAL_KEY = "RETURN STRING";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zweites);

        final TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(getIntent().getExtras().getString(MainActivity.KEY));

        Button buttonZurueck = (Button) findViewById(R.id.buttonZurueck);
        buttonZurueck.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultData = new Intent();
                resultData.putExtra(RETVAL_KEY,textView.getText());
                setResult(Activity.RESULT_OK, resultData);
                finish();
            }
        });
    }
}