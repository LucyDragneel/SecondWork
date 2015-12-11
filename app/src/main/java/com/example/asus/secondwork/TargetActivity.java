package com.example.asus.secondwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_target);
            Intent intent = this.getIntent();
                TextView studentMajor = (TextView)findViewById(R.id.student_major);
                TextView studentClass = (TextView)findViewById(R.id.student_banji);
                TextView studentName = (TextView)findViewById(R.id.name_student);
                TextView studentGrade = (TextView)findViewById(R.id.grade_student);
                studentName.setText(getIntent().getStringExtra("name"));
                studentGrade.setText(getIntent().getStringExtra("grade"));
                studentMajor.setText(getIntent().getStringExtra("major"));
                studentClass.setText(getIntent().getStringExtra("banji"));
            }
        }
