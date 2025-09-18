package ua.opnu;

import java.util.ArrayList;

public class Student {
    String name;
    int year;
    ArrayList<String> disciplines = new ArrayList<>();
    final int COST = 20000;

    public Student(String name, int year){
        this.name = name;
        if (year >= 1 && year <= 4) {
            this.year = year;
        } else {
            this.year = 1;
        }
    }

    public void addCourse(String course){
        if(course != null && !course.trim().isEmpty()) {
            this.disciplines.add(course);
        }
    }

    public void dropAll(){
        this.disciplines.clear();
    }

    public int getCourseCount(){
        return this.disciplines.size();
    }

    public String getName(){
        return this.name;
    }

    public int getTuition(){
        return COST * this.year;
    }

    public int getYear(){
        return this.year;
    }
}
