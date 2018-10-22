package com.pertemuan3.pk.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nA,nB;
    TextView hasil;
    Double a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nA = findViewById(R.id.inputA);
        nB = findViewById(R.id.inputB);
        hasil = findViewById(R.id.Hasil);
    }

    public void LP(View view) {
        a = Double.parseDouble(nA.getText().toString());
        b = Double.parseDouble(nB.getText().toString());
        Double c = a*b;
        hasil.setText(Double.toString(c));

    }

    public void LS(View view) {
        a = Double.parseDouble(nA.getText().toString());
        b = Double.parseDouble(nB.getText().toString());
        Double c = 0.5*a*b;
        hasil.setText(Double.toString(c));

    }

    public void LL(View view) {
        a = Double.parseDouble(nA.getText().toString());
        b = Double.parseDouble(nB.getText().toString());
        Double c = 3.14*a*b;
        hasil.setText(Double.toString(c));

    }

    public void KP(View view) {
        a = Double.parseDouble(nA.getText().toString());
        b = Double.parseDouble(nB.getText().toString());
        Double c = 4*a;
        hasil.setText(Double.toString(c));

    }

    public void KS(View view) {
        a = Double.parseDouble(nA.getText().toString());
        b = Double.parseDouble(nB.getText().toString());
        Double c = (Math.sqrt(Math.pow(a,2)+Math.pow(b,2)))+a+b;
        hasil.setText(Double.toString(c));

    }

    public void KL(View view) {
        a = Double.parseDouble(nA.getText().toString());
        b = Double.parseDouble(nB.getText().toString());
        Double c = 2*3.14*a;
        hasil.setText(Double.toString(c));

    }
}
