package com.Service;

import com.Model.Developpeur;
import com.Model.Employe;
import com.Model.Manager;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmploye {
    private final ArrayList<Employe> emp = new ArrayList<>();
    private int id = 1;

    public void ajoterEmployer(Scanner input) {
        System.out.println("--------- AJOUT EMPLOYÉ ---------");
        System.out.println("1. Développeur");
        System.out.println("2. Manager");
        System.out.print("Choix : ");
        int type = input.nextInt();
        input.nextLine();

        if (type != 1 && type != 2) {
            System.out.println("Type invalide !");
            return;
        }

        System.out.print("Nom : ");
        String nom = input.nextLine();

        System.out.print("Age : ");
        int age = input.nextInt();
        input.nextLine();
        if (age < 18 || age > 70) {
            System.out.println("Age invalide !");
            return;
        }

        System.out.print("Email : ");
        String mail = input.nextLine();

        System.out.print("Salaire de base : ");
        double salaire = input.nextDouble();
        input.nextLine();
        if (salaire < 0) {
            System.out.println("Salaire négatif !");
            return;
        }

        Employe employe;
        if (type == 1) {
            System.out.print("Langage : ");
            String langage = input.nextLine();

            System.out.print("Prime projet : ");
            double prime = input.nextDouble();
            input.nextLine();
            if (prime < 0) {
                System.out.println("Prime négative !");
                return;
            }

            employe = new Developpeur(id, nom, age, mail, salaire, langage, prime);
        } else {
            System.out.print("Prime management : ");
            double prime = input.nextDouble();
            input.nextLine();
            if (prime < 0) {
                System.out.println("Prime négative !");
                return;
            }

            employe = new Manager(id, nom, age, mail, salaire, prime);
        }

        emp.add(employe);
        id++;
        System.out.println("Employé ajouté avec succès !");
    }

    public void afficherEmployer() {
        if (emp.isEmpty()) {
            System.out.println("La liste est vide.");
            return;
        }

        System.out.println("--------- LISTE DES EMPLOYÉS ---------");
        for (Employe e : emp) {
            System.out.println(e);
            System.out.println("---------------------------------------");
        }
    }

    public void supprimerEmployer(int id) {
        boolean supprime = emp.removeIf(e -> e.getId() == id);
        if (supprime) {
            System.out.println("Employé supprimé avec succès !");
        } else {
            System.out.println("Employé introuvable.");
        }
    }

    public void rechercherEmploye(int idrecherche) {
        Employe trouve = null;
        for (Employe e : emp) {
            if (e.getId() == idrecherche) {
                trouve = e;
                break;
            }
        }

        if (trouve != null) {
            System.out.println("Employé trouvé :");
            System.out.println("Nom : " + trouve.getNom());
            System.out.println("Email : " + trouve.getMail());
            System.out.println("Age : " + trouve.getAge());
            System.out.println("Poste : " + trouve.getposte());
            System.out.println("Salaire de base : " + trouve.getSalairebase() + " DH");
        } else {
            System.out.println("Aucun employé trouvé avec cet ID.");
        }
    }

    public void calculeSalaire() {
        if (emp.isEmpty()) {
            System.out.println("Aucun employé à afficher.");
            return;
        }

        for (Employe e : emp) {
            System.out.println(e.getNom() + " : " + e.calculeSalaire() + " DH");
        }
    }
}
