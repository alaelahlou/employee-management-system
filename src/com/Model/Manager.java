package com.Model;

public class Manager extends Employe {
    private double primeManager;

    public Manager(int id, String nom, int age, String mail,
                   double salairebase, double primeManager) {
        super(id, nom, age, mail, salairebase);
        this.primeManager = primeManager;
    }

    public double getPrimeManager() { return primeManager; }
    public void setPrimeManager(double primeManager) { this.primeManager = primeManager; }

    @Override
    public String getposte() {
        return "Manager";
    }

    @Override
    public double calculeSalaire() {
        return getSalairebase() + primeManager;
    }
}
