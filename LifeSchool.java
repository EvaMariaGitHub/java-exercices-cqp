package com.simplon;
import java.time.LocalDate;
import java.time.Month;

/**
 * Created by alonso on 19/01/17.
 */
public class LifeSchool {

    public static void main (String [] args)
    {
        //partie 1
        School s = new School("simplon");
        s.setStudents(new Student("Stéphanie","Durand", LocalDate.of(1980, Month.NOVEMBER, 12)));
        s.setStudents(new Student("Mamadou","Fort", LocalDate.of(1992, Month.SEPTEMBER, 13)));
        s.setStudents(new Student("Florence","Lune", LocalDate.of(2001, Month.APRIL, 5)));
        s.setStudents(new Student("Loic","Martin", LocalDate.of(1998, Month.JULY, 7)));
        System.out.println(s);
        System.out.println("L\'age moyen des élèves est de "+s.ageMoyen()+" ans");
        //partie 2
        s.setStudents(new Graduate("Drake","Foudre",LocalDate.of(1990, Month.NOVEMBER,11),2));
        s.setStudents(new Graduate("Solange","Feu",LocalDate.of(1990, Month.DECEMBER,12),5));
        s.setStudents(new Graduate("Johnny","Lumière",LocalDate.of(1990, Month.OCTOBER,1),3));
        System.out.println(s);
        Graduate etud1 = (Graduate) s.getStudents().get(5);
        Graduate etud2 = (Graduate) s.getStudents().get(6);
        if (etud1.equals(etud2)){
            System.out.println("Bizarre mais les 2 étudiants sont identiques");
        } else {
            System.out.println("les 2 étudiants "+etud1.getPrenom()+" et "+etud2.getPrenom()+  " sont différents");
        }

    }
}
