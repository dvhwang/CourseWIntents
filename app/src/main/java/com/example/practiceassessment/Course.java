package com.example.practiceassessment;

import java.util.ArrayList;

public class Course {
    private String week;
    private String date;
    private String lectureTopic;
    private String labTopic;

    public Course(){
    }

    public Course(String week, String date, String lectureTopic, String labTopic){
        this.week = week;
        this.date = date;
        this.lectureTopic = lectureTopic;
        this.labTopic = labTopic;
    }

    public String getWeek(){
        return week;
    }

    public void setWeek(String week){
        this.week = week;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getLectureTopic(){
        return lectureTopic;
    }

    public void setLectureTopic(String lectureTopic){
        this.lectureTopic = lectureTopic;
    }

    public String getLabTopic(){
        return labTopic;
    }

    public void setLabTopic(String labTopic){
        this.labTopic = labTopic;
    }

    public static ArrayList<Course> getCourse(){
        ArrayList<Course> course = new ArrayList<>();
        course.add(new Course("1:", "18 February", "Intro & Android Fundamentals", "Android Studio, Git & App basics"));
        course.add(new Course("2:", "25 February", "Activities, Lifecycle & Intents", "Activities & Intents"));
        course.add(new Course("3:", "4 March", "Layouts & UI", "Designing a UI"));
        course.add(new Course("4:", "11 March", "Lists & Adapters", "Displaying Items in a List"));
        course.add(new Course("5:", "18 March", "Fragments & Multi-layout Apps", "Fragments for Multi-layout Apps"));
        course.add(new Course("6:", "25 March", "APIs, Permissions & Libraries", "APIs & JSON"));
        course.add(new Course("7:", "1 April", "Networking", "Networking"));
        course.add(new Course("8:", "8 April", "Threads & Async Tasks", "Async Tasks"));
        course.add(new Course("9:", "15 April", "Data Saving", "Database"));
        course.add(new Course("10:", "22 April", "Outlook & Course Summary", "Revision"));

        return course;

    }

}


