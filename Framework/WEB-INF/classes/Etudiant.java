package etu2041.framework;

import etu2041.annotation.Urls;
import etu2041.framework.MethodAnnotation;
import etu2041.framework.ModelView;

public class Etudiant {
    String Nom;
    int Age;

    public String getNom() {
        return Nom;
    }

    @Urls(value = "test.do", argName = "thename")
    public ModelView anarana() {
        // this.setNom(thename);

        ModelView md = new ModelView();
        md.setView("/Etudiant.jsp");
        md.addItem("nom", this.getNom());
        md.addItem("age", this.getAge());

        return md;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String test2() {
        return "hafakoa";
    }

}
