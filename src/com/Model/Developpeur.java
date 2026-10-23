package com.Model;

public class Developpeur extends Employe {
    private String langageProg;
    private double primeProjet;

    public Developpeur(int id, String nom, int age, String mail,
                       double salairebase, String langageProg, double primeProjet) {
        super(id, nom, age, mail, salairebase);
        this.langageProg = langageProg;
        this.primeProjet = primeProjet;
    }

    public String getLangageProg() { return langageProg; }
    public void setLangageProg(String langageProg) { this.langageProg = langageProg; }

    public double getPrimeProjet() { return primeProjet; }
    public void setPrimeProjet(double primeProjet) { this.primeProjet = primeProjet; }

    @Override
    public double calculeSalaire() {
        return getSalairebase() + primeProjet;
    }

    @Override
    public String getposte() {
        return "Développeur";
    }
}
