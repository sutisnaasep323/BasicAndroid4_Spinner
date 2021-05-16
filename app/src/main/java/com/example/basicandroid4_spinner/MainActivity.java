package com.example.basicandroid4_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner_test;
    TextView tv_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_test = findViewById(R.id.spinner_test);
        tv_hasil = findViewById(R.id.text3);

        spinner_test.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String hasil = adapterView.getItemAtPosition(i).toString();
                if (spinner_test.getSelectedItem().toString().equals("Status Sekolah")){
                    tv_hasil.setText("Hasil yang dipilih kosong");
                } else {
                    tv_hasil.setText("Hasil yang dipilih : " + hasil);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}