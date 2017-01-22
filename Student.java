package com.simplon;
import java.time.LocalDate;
/**
 * Created by alonso on 19/01/17.
 */
public class Student {
    private String prenom;
    private String nom;
    private LocalDate date;
    private int age;

    public Student(String prenom, String nom, LocalDate date){
        this.prenom = prenom;
        this.nom = nom;
        this.date = date;
        this.setAge();
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(){
        this.age = LocalDate.now().getYear() - this.getDate().getYear();
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return this.prenom+" "+this.nom+", "+this.date.getDayOfMonth()+"/"+this.date.getMonth()+"/"+this.date.getYear()+", "+this.age+" ans";
    }

    // génération automatique des méthodes equals et hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        //if (age != student.age) return false;
        if (prenom != null ? !prenom.equals(student.prenom) : student.prenom != null) return false;
        if (nom != null ? !nom.equals(student.nom) : student.nom != null) return false;
        return date != null ? date.equals(student.date) : student.date == null;
    }

    @Override
    public int hashCode() {
        int result = prenom != null ? prenom.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        //result = 31 * result + age;
        return result;
    }
}
