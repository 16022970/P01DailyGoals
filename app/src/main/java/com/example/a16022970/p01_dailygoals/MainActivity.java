package com.example.a16022970.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOK = (Button)findViewById(R.id.button);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                RadioGroup rg1 = (RadioGroup)findViewById(R.id.radioGroupQn1);
                RadioGroup rg2 = (RadioGroup)findViewById(R.id.radioGroupQn2);
                RadioGroup rg3 = (RadioGroup)findViewById(R.id.radioGroupQn3);
                EditText etReflection = (EditText)findViewById(R.id.editText);

                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();

                RadioButton rb1 = (RadioButton)findViewById(selectedButtonId1);
                RadioButton rb2 = (RadioButton)findViewById(selectedButtonId2);
                RadioButton rb3 = (RadioButton)findViewById(selectedButtonId3);


                String[] summary = {rb1.getText().toString(),rb2.getText().toString(),rb3.getText().toString(),etReflection.getText().toString()};
                Intent i = new Intent(MainActivity .this,Activity2.class);
                i.putExtra("summary", summary);
                startActivity(i);
            }
        });


    }
}
