package com.example.hmand311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class MainActivity extends AppCompatActivity {
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnPoint;
    TextView txtResult;
    Queue<Character> viewResult = new ArrayDeque<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.zero);
        btnPoint = findViewById(R.id.btnPoint);
        txtResult = findViewById(R.id.txtResult);

        txtResult.setText("0");
        btnOne.setOnClickListener(clickBtn);
        btnTwo.setOnClickListener(clickBtn);
        btnThree.setOnClickListener(clickBtn);
        btnFour.setOnClickListener(clickBtn);
        btnFive.setOnClickListener(clickBtn);
        btnSix.setOnClickListener(clickBtn);
        btnSeven.setOnClickListener(clickBtn);
        btnEight.setOnClickListener(clickBtn);
        btnNine.setOnClickListener(clickBtn);
        btnZero.setOnClickListener(clickBtn);
        btnPoint.setOnClickListener(clickBtn);



    }
    Button.OnClickListener clickBtn = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.zero:
                    viewResult.add('0');
                    break;
                case R.id.btnOne:
                    viewResult.add('1');
                    break;
                case R.id.btnTwo:
                    viewResult.add('2');
                    break;
                case R.id.btnThree:
                    viewResult.add('3');
                    break;
                case R.id.btnFour:
                    viewResult.add('4');
                    break;
                case R.id.btnFive:
                    viewResult.add('5');
                    break;
                case R.id.btnSix:
                    viewResult.add('6');
                    break;
                case R.id.btnSeven:
                    viewResult.add('7');
                    break;
                case R.id.btnEight:
                    viewResult.add('8');
                    break;
                case R.id.btnNine:
                    viewResult.add('9');
                    break;
                case R.id.btnPoint:
                    if(!viewResult.contains('.')) viewResult.add('.');
                    break;


            }
            if (viewResult.size() > 6) viewResult.remove();
            txtResult.setText(viewResult.toString());


        }
    };

}

