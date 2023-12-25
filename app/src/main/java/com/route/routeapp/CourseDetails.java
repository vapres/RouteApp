package com.route.routeapp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class CourseDetails implements Parcelable {
    private int imageResource;
    private String courseDetails;

    public CourseDetails(int imageResource, String courseDetails){
        this.imageResource = imageResource;
        this.courseDetails = courseDetails;
    }

    protected CourseDetails(Parcel in) {
        imageResource = in.readInt();
        courseDetails = in.readString();
    }

    public static final Creator<CourseDetails> CREATOR = new Creator<CourseDetails>() {
        @Override
        public CourseDetails createFromParcel(Parcel in) {
            return new CourseDetails(in);
        }

        @Override
        public CourseDetails[] newArray(int size) {
            return new CourseDetails[size];
        }
    };

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public void setCourseDetails(String courseDetails) {
        this.courseDetails = courseDetails;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getCourseDetails() {
        return courseDetails;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(imageResource);
        dest.writeString(courseDetails);
    }
}
