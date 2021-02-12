package com.eymenalpat.basithesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView sonuctext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        sonuctext = findViewById(R.id.sonuctext);
        //System.out.println("açıldım");


    }

    public void topla(View view){

        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){

        sonuctext.setText("Bir yerleri boş bıraktın sankiiii :)");
        } else {
            int numberr = Integer.parseInt(number1.getText().toString());
            int numberrr = Integer.parseInt(number2.getText().toString());
            int resultt = numberr + numberrr;
            sonuctext.setText("Sonuç:" + resultt);
        }


    }

    public void cikar(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){

            sonuctext.setText("Bir yerleri boş bıraktın sankiiii :)");
        } else {
            int numberr = Integer.parseInt(number1.getText().toString());
            int numberrr = Integer.parseInt(number2.getText().toString());
            int resultt = numberr - numberrr;
            sonuctext.setText("Sonuç:" + resultt);
        }
    }

    public void carp(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){

            sonuctext.setText("Bir yerleri boş bıraktın sankiiii :)");
        } else {
            int numberr = Integer.parseInt(number1.getText().toString());
            int numberrr = Integer.parseInt(number2.getText().toString());
            int resultt = numberr * numberrr;
            sonuctext.setText("Sonuç:" + resultt);
        }

    }

    public void bol(View view){
        if (number1.getText().toString().matches("") || number2.getText().toString().matches("")){

            sonuctext.setText("Bir yerleri boş bıraktın sankiiii :)");
        } else if (number1.getText().toString().matches("0") || number2.getText().toString().matches("0")) {
            sonuctext.setText("Bir sayıyı sıfıra bölemezsin, bu bilgi de benden sana kıyak olsun :)");
        }
        else {
            int numberr = Integer.parseInt(number1.getText().toString());
            int numberrr = Integer.parseInt(number2.getText().toString());
            int resultt = numberr / numberrr;
            sonuctext.setText("Sonuç:" + resultt);
        }

    }
}
