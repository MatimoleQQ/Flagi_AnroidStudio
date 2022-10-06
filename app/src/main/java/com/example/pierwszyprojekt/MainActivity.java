package com.example.pierwszyprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public int ilosc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zlaOdpowiedz(View view)
    {
        if(ilosc<5) {
            Toast.makeText(MainActivity.this, R.string.zla_odp, Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"Wygrales, nie mozesz wiecej klikac",Toast.LENGTH_SHORT).show();
        }

    }

    public void dobraOdpowiedz(View view) {

        view.setVisibility(View.INVISIBLE);
        ilosc++;
        if(ilosc>=5)
        {
            TextView pytanieTextView = findViewById(R.id.pytanieeTextView);
            pytanieTextView.setText("Gratulacje \n znasz flage polski");
        }


    }
}