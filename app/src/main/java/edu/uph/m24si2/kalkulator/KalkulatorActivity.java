package edu.uph.m24si2.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorActivity extends AppCompatActivity {
private EditText edt2,edt3;
private Button Tambah, Kali, Bagi;
private TextView txvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);
        Tambah = findViewById(R.id.Tambah);
        Kali = findViewById(R.id.Kali);
        Bagi = findViewById(R.id.Bagi);
        txvHasil = findViewById(R.id.txvHasil);
        Tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b, hasil;
                a = Integer.parseInt(edt2.getText().toString());
                b = Integer.parseInt(edt3.getText().toString());
                hasil = a + b;
                txvHasil.setText(Integer.toString(hasil));
            }
        });
        Kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b, hasil;
                a = Integer.parseInt(edt2.getText().toString());
                b = Integer.parseInt(edt3.getText().toString());
                hasil = a * b;
                txvHasil.setText(Integer.toString(hasil));
            }
        });
        Bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b, hasil;
                a = Integer.parseInt(edt2.getText().toString());
                b = Integer.parseInt(edt3.getText().toString());
                hasil = a / b;
                txvHasil.setText(Integer.toString(hasil));
            }


        });
    }
}