package com.Model;

import com.Interface.CalculSalaire;

public abstract class Employe implements CalculSalaire {
    private int id;
    private String nom;
    private int age;
    private String mail;
    private double salairebase;

    public Employe(int id, String nom, int age, String mail, double salairebase) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.mail = mail;
        this.salairebase = salairebase;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }

    public double getSalairebase() { return salairebase; }
    public void setSalairebase(double salairebase) { this.salairebase = salairebase; }

    public abstract String getposte();

    @Override
    public String toString() {
        return "ID : " + id + "\n"
                + "Nom : " + nom + "\n"
                + "Age : " + age + "\n"
                + "Email : " + mail + "\n"
                + "Salaire de base : " + salairebase + " DH\n"
                + "Poste : " + getposte();
    }
}
