package com.gzeinnumer.sessionmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private SessionManager mSessionManager;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.text_field);

        mSessionManager = new SessionManager(this);

        //to set data
        mSessionManager.setIdAntrian(editText.getText().toString());

        //to get data
        mSessionManager.getIdAntrian();

    }
}
