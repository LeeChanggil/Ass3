package com.example.ass3;

import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.b_n1);
        button2 = (Button) findViewById(R.id.b_n2);
        button3 = (Button) findViewById(R.id.b_n3);
        button4 = (Button) findViewById(R.id.b_n4);
        button5 = (Button) findViewById(R.id.b_n5);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                d1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                d2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                d3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                d4();
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                d5();
            }
        });
    }

    private void d1() {
        AlertDialog.Builder _alert = new AlertDialog.Builder(this);
        _alert.setTitle("Music No.1");
        _alert.setMessage("메시지를 넣으심녀 됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n").setCancelable(false);
        _alert.setNeutralButton("Close", null);
        _alert.show();
    }
    private void d2() {
        AlertDialog.Builder _alert = new AlertDialog.Builder(this);
        _alert.setTitle("Music No.2");
        _alert.setMessage("메시지를 넣으심녀 됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n").setCancelable(false);
        _alert.setNeutralButton("Close", null);
        _alert.show();
    }
    private void d3() {
        AlertDialog.Builder _alert = new AlertDialog.Builder(this);
        _alert.setTitle("Music No.3");
        _alert.setMessage("메시지를 넣으심녀 됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n").setCancelable(false);
        _alert.setNeutralButton("Close", null);
        _alert.show();
    }
    private void d4() {
        AlertDialog.Builder _alert = new AlertDialog.Builder(this);
        _alert.setTitle("Music No.4");
        _alert.setMessage("메시지를 넣으심녀 됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n").setCancelable(false);
        _alert.setNeutralButton("Close", null);
        _alert.show();
    }
    private void d5() {
        AlertDialog.Builder _alert = new AlertDialog.Builder(this);
        _alert.setTitle("Music No.5");
        _alert.setMessage("메시지를 넣으심녀 됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n").setCancelable(false);
        _alert.setNeutralButton("Close", null);
        _alert.show();
    }


}
