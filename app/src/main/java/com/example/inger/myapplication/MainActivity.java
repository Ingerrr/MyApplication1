package com.example.inger.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    int clear = 0;
    int type = 0;
    int equals = 0;
    double hold;
    String modifyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Clear(){
        TextView tekst = (TextView)findViewById(R.id.textfield);
        tekst.setText(" ");
        count = 0;
    }

    public void IsClicked() {
        TextView tekstje = (TextView)findViewById(R.id.textfield);
        String tekst = tekstje.getText().toString();
        int negative = 0;

        if(Character.isDigit(tekst.charAt(1))== false){
            tekst = tekst.substring(2);
            System.out.println(tekst);
            negative = 1;
        }
        System.out.println(tekst);

        tekst = tekst.trim().replaceAll("[^0-9]","|").replaceAll("(\\D)\\1+", "$1");
        String numbers[] = tekst.trim().split("\\|");
        int intNumbers[] = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            hold = Double.parseDouble(numbers[i]);
            intNumbers[i] = (int)hold;
        }
        if(negative == 1){
            intNumbers[0] = -intNumbers[0];
        }

        if (type == 0) {
            for (int i = 0; i < intNumbers.length; i++) {
                count = count + intNumbers[i];
            }
        }
        if (type == 1) {
            for (int i = 1; i < intNumbers.length; i++) {
                count = intNumbers[i - 1] - intNumbers[i];
            }
        }
        if (type == 2) {
            for (int i = 1; i < intNumbers.length; i++) {
                count = intNumbers[i - 1] * intNumbers[i];
            }
        }
        if (type == 3) {
            for (int i = 1; i < intNumbers.length; i++) {
                count = intNumbers[i - 1] / intNumbers[i];
            }
        }

        tekstje.setText(" "+count);
        clear = 0;
        count = 0;
        equals = 0;
    }

    public void ClearClicked(View view) {
        Clear();
    }

    public void OneClicked(View view) {
        if(clear == 0){
            Clear();
        }
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + "1";
        tekst.setText(modifyText);
        clear = 1;
    }
    public void TwoClicked(View view) {
        if(clear == 0){
            Clear();
        }
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + "2";
        tekst.setText(modifyText);
        clear = 1;
    }
    public void ThreeClicked(View view) {
        if(clear == 0){
            Clear();
        }
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + "3";
        tekst.setText(modifyText);
        clear = 1;
    }
    public void FourClicked(View view) {
        if(clear == 0){
            Clear();
        }
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + "4";
        tekst.setText(modifyText);
        clear = 1;
    }
    public void FiveClicked(View view) {
        if(clear == 0){
            Clear();
        }
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + "5";
        tekst.setText(modifyText);
        clear = 1;
    }
    public void SixClicked(View view) {
        if(clear == 0){
            Clear();
        }
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + "6";
        tekst.setText(modifyText);
        clear = 1;
    }
    public void SevenClicked(View view) {
        if(clear == 0){
            Clear();
        }
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + "7";
        tekst.setText(modifyText);
        clear = 1;
    }
    public void EightClicked(View view) {
        if(clear == 0){
            Clear();
        }
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + "8";
        tekst.setText(modifyText);
        clear = 1;
    }
    public void NineClicked(View view) {
        if(clear == 0){
            Clear();
        }
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + "9";
        tekst.setText(modifyText);
        clear = 1;
    }
    public void ZeroClicked(View view) {
        if(clear == 0){
            Clear();
        }
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + "0";
        tekst.setText(modifyText);
        clear = 1;
    }

    public void PlusClicked(View view) {
        if(equals == 1){
            IsClicked();
        }

        type = 0;
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + " + ";
        tekst.setText(modifyText);
        clear = 1;
        equals = 1;
    }
    public void MinusClicked(View view) {
        if(equals == 1){
            IsClicked();
        }

        type = 1;
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + " - ";
        tekst.setText(modifyText);
        clear = 1;
        equals = 1;
    }
    public void TimesClicked(View view) {
        if(equals == 1){
            IsClicked();
        }

        type = 2;
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + " * ";
        tekst.setText(modifyText);
        clear = 1;
        equals = 1;
    }
    public void DivideClicked(View view) {
        if(equals == 1){
            IsClicked();
        }

        type = 3;
        TextView tekst = (TextView)findViewById(R.id.textfield);
        modifyText = tekst.getText().toString();
        modifyText = modifyText + " : ";
        tekst.setText(modifyText);
        clear = 1;
        equals = 1;
    }

    public void IsClicked(View view) {
        IsClicked();
    }
}
