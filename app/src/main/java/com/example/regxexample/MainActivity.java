package com.example.regxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hello java", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello java", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello java", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello java", Toast.LENGTH_SHORT).show();

        Log.v("Java","MyTag");
        Log.d("Java","MyTag");
        Log.e("Java","MyTag");

    }
}