package com.example.tw2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] departments = new String[]{"CSE", "ISE", "EC", "EE", "ME", "CV", "MECH"};
    String name, usn, dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner deptObj = findViewById(R.id.dept);
        ArrayAdapter<String> aa = new ArrayAdapter<>(this,
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item, departments);
        aa.setDropDownViewResource(com.google.android.material.R.layout.support_simple_spinner_dropdown_item);
        deptObj.setAdapter(aa);
    }

    public void onSubmit(View view) {
        EditText nameObj = findViewById(R.id.name);
        EditText usnObj = findViewById(R.id.usn);
        Spinner deptObj = findViewById(R.id.dept);
        name = nameObj.getText().toString();
        usn = usnObj.getText().toString();
        dept = deptObj.getSelectedItem().toString();

        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        i.putExtra("name_key", name);
        i.putExtra("usn_key", usn);
        i.putExtra("dept_key", dept);
        startActivity(i);
    }

}