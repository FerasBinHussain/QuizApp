package com.ferasbinhussainngmail.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    RadioGroup group1;
    RadioGroup group2;
    RadioGroup group3;
    RadioGroup group4;
    RadioGroup group5;
    RadioGroup group6;
    RadioGroup group7;
    RadioGroup group8;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    EditText editedText;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        checkBox1.setOnClickListener(this);
        checkBox2.setOnClickListener(this);
        checkBox3.setOnClickListener(this);



        checkBox4.setOnClickListener(this);
    }

    public void addListenerOnButton() {
        group1 = (RadioGroup) findViewById(R.id.group1);
        group2 = (RadioGroup) findViewById(R.id.group2);
        group3 = (RadioGroup) findViewById(R.id.group3);
        group4 = (RadioGroup) findViewById(R.id.group4);
        group5 = (RadioGroup) findViewById(R.id.group5);
        group6 = (RadioGroup) findViewById(R.id.group6);
        group7 = (RadioGroup) findViewById(R.id.group7);
        group8 = (RadioGroup) findViewById(R.id.group8);

        checkBox1 = (CheckBox) findViewById(R.id.ansower1);
        checkBox2 = (CheckBox) findViewById(R.id.ansower2);
        checkBox3 = (CheckBox) findViewById(R.id.ansower3);
        checkBox4 = (CheckBox) findViewById(R.id.ansower4);
        editedText = (EditText) findViewById(R.id.editText1);

        group1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.ansowerR1G1) {
                    count++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR2G1) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR3G1) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR4G1) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        group2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.ansowerR2G2) {
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    count++;
                } else if (checkedId == R.id.ansowerR1G2) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR3G2) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR4G2) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        group3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.ansowerR2G3) {
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    count++;
                } else if (checkedId == R.id.ansowerR3G3) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR1G3) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR4G3) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        group4.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.ansowerR2G4) {
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    count++;
                } else if (checkedId == R.id.ansowerR1G4) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR3G4) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR4G4) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        group5.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.ansowerR1G5) {
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    count++;
                } else if (checkedId == R.id.ansowerR2G5) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR3G5) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR4G5) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }
            }

        });
        group6.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.ansowerR1G6) {
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    count++;
                } else if (checkedId == R.id.ansowerR2G6) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR3G6) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR4G6) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }
            }

        });
        group7.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.ansowerR2G7) {
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    count++;
                } else if (checkedId == R.id.ansowerR1G7) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR3G7) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR4G7) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        group8.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.ansowerR1G8) {
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    count++;
                } else if (checkedId == R.id.ansowerR2G8) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR3G8) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.ansowerR4G8) {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View v) {

        if (checkBox1.isChecked() && checkBox2.isChecked() && checkBox4.isChecked() && !checkBox3.isChecked()) {
            Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
            count++;
        }
    }


    public void text(View view) {
        String text = editedText.getText().toString();
        if (text.equalsIgnoreCase("Rodriguez")) {
            Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
            count++;
        } else {
            Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
        }
    }
    @OnClick(R.id.button)
    public void Submit() {

        if (count > 10) {
            count = 10;
        }
        Toast.makeText(getApplicationContext(), "You got " + count + "/10", Toast.LENGTH_LONG).show();
        if (count > 0) {
            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
            dlgAlert.setTitle("Nice job");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();


            group1.clearCheck();
            group2.clearCheck();
            group3.clearCheck();
            group4.clearCheck();
            group5.clearCheck();
            group6.clearCheck();
            group7.clearCheck();
            group8.clearCheck();
            checkBox1.setChecked(false);
            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);
            editedText.setText("");
            count = 0;
        } else {
            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
            dlgAlert.setTitle("Try again!!");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();
        }
    }
}

