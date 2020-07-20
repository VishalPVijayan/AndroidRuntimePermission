package com.vishalpvijayan.androidruntimepermission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSinglePermission, btnMultiplePermission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Define Buttons
        DefineWidgets();
    }

    private void DefineWidgets() {
        btnSinglePermission = findViewById(R.id.btnSinglePermission);
        btnMultiplePermission = findViewById(R.id.btnMultiplePermission);

        btnSinglePermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Single permission

            }
        });

        btnMultiplePermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Multiple permissions

            }
        });
    }

}