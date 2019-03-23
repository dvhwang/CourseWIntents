package com.example.practiceassessment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {
    private ArrayList<Course> mCourse;

    public CourseAdapter(ArrayList<Course> course){
        mCourse = course;
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder{
        public TextView week,date, lectureContent, labContent;

        public CourseViewHolder(View v){
            super(v);
            week = v.findViewById(R.id.text_week);
            date = v.findViewById(R.id.text_date);
            lectureContent = v.findViewById(R.id.text_lecture);
            labContent = v.findViewById(R.id.text_lab);
        }

    }

    @Override
    public CourseAdapter.CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_text_view, parent, false);
        return new CourseViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CourseViewHolder holder, int position){
        Course course = mCourse.get(position);
        holder.week.setText(course.getWeek());
        holder.date.setText(course.getDate());
        holder.lectureContent.setText(course.getLectureTopic());
        holder.labContent.setText(course.getLabTopic());
    }

    @Override
    public int getItemCount(){
        return mCourse.size();
    }


}
