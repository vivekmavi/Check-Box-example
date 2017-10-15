package com.example.paras.checkboxprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CheckBox.OnCheckedChangeListener
{
    CheckBox checkBox1 , checkBox2 , checkBox3 , checkBox4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkbox4);

        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);
        checkBox3.setOnCheckedChangeListener(this);
        checkBox4.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked)
    {
        if (isChecked)
        {
            if (compoundButton==checkBox1)
            {
                Toast.makeText(this,"vivek selected",Toast.LENGTH_SHORT).show();
            }
            if (compoundButton==checkBox2)
            {
                Toast.makeText(this,"prakash selected",Toast.LENGTH_SHORT).show();
            }
            if (compoundButton==checkBox3)
            {
                Toast.makeText(this,"paras selected",Toast.LENGTH_SHORT).show();
            }
            if (compoundButton==checkBox4)
            {
                Toast.makeText(this,"vikas selected",Toast.LENGTH_SHORT).show();
            }
        }
        if (isChecked==false)
        {
            if (compoundButton == checkBox1) {
                Toast.makeText(this, "vivek uncheckedd", Toast.LENGTH_SHORT).show();
            }
            if (compoundButton == checkBox2) {
                Toast.makeText(this, "prakash unchecked", Toast.LENGTH_SHORT).show();
                checkBox1.setChecked(true);
                checkBox3.setChecked(true);
                checkBox4.setChecked(true);
            }
            if (compoundButton == checkBox3) {
                Toast.makeText(this, "paras unchecked", Toast.LENGTH_SHORT).show();
            }
            if (compoundButton == checkBox4) {
                Toast.makeText(this, "vikas unchecked", Toast.LENGTH_SHORT).show();
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
            }
        }


    }
}
