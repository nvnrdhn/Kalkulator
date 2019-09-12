package com.hoverlight.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView back;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, clear, eq, div, sub, add, mul;
    TextView hasil;
    double res = 0, res2 = 0;
    String dis = "", last = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hasil = findViewById(R.id.hasil);
        div = findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
                last="/";
                dis="";
                res=0;
                hasil.setText(dis);
            }
        });
        sub = findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
                last="-";
                dis="";
                res=0;
                hasil.setText(dis);
            }
        });
        add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
                last="+";
                dis="";
                res=0;
                hasil.setText(dis);
            }
        });
        mul = findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
                last="x";
                dis="";
                res=0;
                hasil.setText(dis);
            }
        });
        b0 = findViewById(R.id.b0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dis.length()>=1) {
                    dis+="0";
                    hasil.setText(dis);
                    res = Double.valueOf(dis);
                }
            }
        });
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis+="1";
                hasil.setText(dis);
                res = Double.valueOf(dis);
            }
        });
        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis+="2";
                hasil.setText(dis);
                res = Double.valueOf(dis);
            }
        });
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis+="3";
                hasil.setText(dis);
                res = Double.valueOf(dis);
            }
        });
        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis+="4";
                hasil.setText(dis);
                res = Double.valueOf(dis);
            }
        });
        b5 = findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis+="5";
                hasil.setText(dis);
                res = Double.valueOf(dis);
            }
        });
        b6 = findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis+="6";
                hasil.setText(dis);
                res = Double.valueOf(dis);
            }
        });
        b7 = findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis+="7";
                hasil.setText(dis);
                res = Double.valueOf(dis);
            }
        });
        b8 = findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis+="8";
                hasil.setText(dis);
                res = Double.valueOf(dis);
            }
        });
        b9 = findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis+="9";
                hasil.setText(dis);
                res = Double.valueOf(dis);
            }
        });
        clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis = last = "";
                hasil.setText(dis);
                res = res2 = 0;
            }
        });
        eq = findViewById(R.id.eq);
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
                last="";
                hasil.setText(String.valueOf(res));
            }
        });
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dis.length() <= 1) {
                    dis = "";
                    res = 0;
                }
                else {
                    dis = dis.substring(0, dis.length()-1);
                    res = Double.valueOf(dis);
                }
                hasil.setText(dis);
            }
        });
    }

    private void calc() {
        switch (last) {
            case "+":
                res+=res2;
                res2=res;
                break;
            case "-":
                res=res2-res;
                res2=res;
                break;
            case "x":
                res*=res2;
                res2=res;
                break;
            case "/":
                res=res2/res;
                res2=res;
                break;
            default:
                res2=res;
                break;
        }
    }
}
