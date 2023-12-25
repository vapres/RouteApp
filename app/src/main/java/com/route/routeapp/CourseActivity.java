package com.route.routeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseActivity extends AppCompatActivity {
    int imgRes;
    String courseDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("course_android")) {
                CourseDetails course = intent.getParcelableExtra("course_android");
                imgRes = course.getImageResource();
                courseDetails = course.getCourseDetails();

                ImageView imgView = findViewById(R.id.imgv_course);
                imgView.setImageResource(imgRes);
                TextView txtView = findViewById(R.id.tv_course_details);
                txtView.setText(courseDetails);
            } else if (intent.hasExtra("course_ios")) {
                CourseDetails course = intent.getParcelableExtra("course_ios");
                imgRes = course.getImageResource();
                courseDetails = course.getCourseDetails();

                ImageView imgView = findViewById(R.id.imgv_course);
                imgView.setImageResource(imgRes);
                TextView txtView = findViewById(R.id.tv_course_details);
                txtView.setText(courseDetails);
            } else if (intent.hasExtra("course_full_stack")) {
                CourseDetails course = intent.getParcelableExtra("course_full_stack");
                imgRes = course.getImageResource();
                courseDetails = course.getCourseDetails();

                ImageView imgView = findViewById(R.id.imgv_course);
                imgView.setImageResource(imgRes);
                TextView txtView = findViewById(R.id.tv_course_details);
                txtView.setText(courseDetails);
            }


        }
    }
}