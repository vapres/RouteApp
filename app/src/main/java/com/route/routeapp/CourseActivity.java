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
        ImageView imgView = findViewById(R.id.imgv_course);
        TextView txtView = findViewById(R.id.tv_course_details);

        Intent intent = getIntent();
        if (intent != null) {
            CourseDetails course = intent.getParcelableExtra("course");
            imgRes = course.getImageResource();
            courseDetails = course.getCourseDetails();
            imgView.setImageResource(imgRes);
            txtView.setText(courseDetails);

        }
    }
}