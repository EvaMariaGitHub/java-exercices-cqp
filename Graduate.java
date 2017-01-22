package com.simplon;

import java.time.LocalDate;

/**
 * Created by alonso on 21/01/17.
 */
public class Graduate extends Student {

    private int diplome;

    public Graduate(String prenom, String nom, LocalDate date, int diplome){
        super (prenom, nom, date);
        this.diplome = diplome; // doit on utiliser des méthodes set
    }

    public int getDiplome(){
        return this.diplome;
    }

    public void setDiplome(int diplome){
        this.diplome = diplome;
    }

    @Override
    public String toString(){
        return super.getPrenom()+" "+super.getNom()+", bac+ "+this.getDiplome();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Graduate graduate = (Graduate) o;

        return diplome == graduate.diplome;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + diplome;
        return result;
    }
}
