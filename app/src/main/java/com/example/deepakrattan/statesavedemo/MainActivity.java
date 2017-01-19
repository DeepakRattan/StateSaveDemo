package com.example.deepakrattan.statesavedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText edtName;
    private String name;
    private static final String TAG = "StateSave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() is called");

        //findViewByID

        edtName = (EditText)findViewById(R.id.edtName);
       // name = edtName.getText().toString();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() is called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState() is called");
        name = edtName.getText().toString();
        outState.putString("abc",name);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState() is called");

        name = savedInstanceState.getString("abc");
        edtName.setText(name);
    }
}
