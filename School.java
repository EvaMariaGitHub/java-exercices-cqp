package com.simplon;
import java.util.ArrayList;

/**
 * Created by alonso on 19/01/17.
 */
public class School {
    private  String name;
    private ArrayList <Student> students;

    public School (String name){
        this.name = name;
        students = new ArrayList<Student>();
    }

    public String getName (){
        return this.name;
    }

    public void setStudents (Student student){
        this.students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int ageMoyen (){
        int ageM = 0; int sommeA = 0;
        if (this.students.size()>0){
            for (Student s : this.students){
                sommeA = sommeA + s.getAge();
            }
            ageM = sommeA / this.students.size();
        }
        return ageM;
    }

    @Override
    public String toString() {
        String s = this.name+"\n";
        for (Student stud : this.students) {
            s = s+stud+"\n";
        }
        return s;
    }
}
