package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Student> studentList = new ArrayList<>();
    RecyclerView students_rv;
    StudentsAdapter studentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        students_rv = findViewById(R.id.students_rv);
        students_rv.setLayoutManager(new LinearLayoutManager(this));
        studentsAdapter = new StudentsAdapter(this , studentList);
        students_rv.setAdapter(studentsAdapter);
    }

    private void initData() {
        studentList. add(new Student("1","Level Five",95.5f,"Ehdaa Hassan"));
        studentList. add(new Student("2","Level One",80.0f,"Ehdaa Hassan"));
        studentList. add(new Student("3","Level Two",98.5f,"Ehdaa Hassan"));
        studentList. add(new Student("4","Level Three",55.5f,"Ehdaa Hassan"));
        studentList. add(new Student("5","Level Four",52.2f,"Ehdaa Hassan"));
        studentList. add(new Student("6","Level Five",77.5f,"Ehdaa Hassan"));
        studentList. add(new Student("7","Level One",90.5f,"Ehdaa Hassan"));
        studentList. add(new Student("8","Level Five",95.5f,"Ehdaa Hassan"));


    }
}
