package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int counter;
    private TextView countTextView;
    private Button buttonToast;
    private Button buttonCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countTextView = findViewById(R.id.show_count);
        buttonToast = findViewById(R.id.button_toast);
        buttonCount = findViewById(R.id.button_count);

        buttonToast.setOnClickListener(view -> {
            showToast();
        });

        buttonCount.setOnClickListener(view -> {
            countUp();
        });

    }

    public void showToast() {
        counter = 0;
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
        if (countTextView != null) countTextView.setText(Integer.toString(counter));
    }

    public void countUp() {
        counter++;
        if (countTextView != null) countTextView.setText(Integer.toString(counter));
    }


}