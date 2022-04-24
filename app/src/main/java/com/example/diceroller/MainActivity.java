package com.example.diceroller;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



        RadioGroup radioGroup;
        RadioButton radioButton4;
        RadioButton radioButton6;
        RadioButton radioButton8;
        RadioButton radioButton10;
        RadioButton radioButton12;
        RadioButton radioButton20;
        Button button1;
        TextView ans;
        int maximumValue;
        int randomValue;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            radioGroup = findViewById(R.id.radioGroup);
            radioButton4 = findViewById(R.id.radioButton4);
            radioButton6 = findViewById(R.id.radioButton6);
            radioButton8 = findViewById(R.id.radioButton8);
            radioButton10 = findViewById(R.id.radioButton10);
            radioButton12 = findViewById(R.id.radioButton12);
            radioButton20 = findViewById(R.id.radioButton20);

            button1 = findViewById(R.id.button1);

            ans = findViewById(R.id.textView1);

            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId == R.id.radioButton4) {
                maximumValue = 4;
            } else if (selectedId == R.id.radioButton6) {
                maximumValue = 6;
            } else if (selectedId == R.id.radioButton8) {
                maximumValue = 8;
            } else if (selectedId == R.id.radioButton10) {
                maximumValue = 10;
            } else if (selectedId == R.id.radioButton12) {
                maximumValue = 12;
            } else if (selectedId == R.id.radioButton20) {
                maximumValue = 20;
            }

            button1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("DefaultLocal")
                @Override
                public void onClick(View v) {
                    int selectedId = radioGroup.getCheckedRadioButtonId();

                    if (selectedId == R.id.radioButton4) {
                        maximumValue = 4;
                    } else if (selectedId == R.id.radioButton6) {
                        maximumValue = 6;
                    } else if (selectedId == R.id.radioButton8) {
                        maximumValue = 8;
                    } else if (selectedId == R.id.radioButton10) {
                        maximumValue = 10;
                    } else if (selectedId == R.id.radioButton12) {
                        maximumValue = 12;
                    } else if (selectedId == R.id.radioButton20) {
                        maximumValue = 20;
                    }
                    randomValue = (int) (Math.random() * maximumValue) + 1;
                    ans.setText(String.format("%d", randomValue));
                }
            });


        }

}




