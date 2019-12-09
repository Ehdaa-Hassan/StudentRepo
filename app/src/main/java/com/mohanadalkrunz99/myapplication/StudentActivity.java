package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {
TextView student_id,student_name,student_avg,student_level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        String id = getIntent().getStringExtra("id");
        String level = getIntent().getStringExtra("level");
        Bundle bundle = getIntent().getExtras();
        float avg = bundle.getFloat("avg");
        String name = getIntent().getStringExtra("name");

        student_id = (TextView)findViewById(R.id.student_id);
        student_name = (TextView)findViewById(R.id.student_name);
        student_avg = (TextView)findViewById(R.id.student_avg);
        student_level = (TextView)findViewById(R.id.student_level);

        student_id.setText("id = "+id);
        student_name.setText("name = "+name);
        student_avg.setText("Average = "+avg);
        student_level.setText("Level = "+level);


    }
}
