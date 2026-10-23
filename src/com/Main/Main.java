package com.Main;

import com.Service.GestionEmploye;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEmploye ge = new GestionEmploye();
        Scanner input = new Scanner(System.in);
        int id;
        int choix;

        do {
            System.out.println("================================");
            System.out.println("      GESTION DES EMPLOYES");
            System.out.println("================================");
            System.out.println("1. Ajouter un employé");
            System.out.println("2. Afficher les employés");
            System.out.println("3. Rechercher un employé");
            System.out.println("4. Supprimer un employé");
            System.out.println("5. Calculer les salaires");
            System.out.println("0. Quitter");
            System.out.print("Entrer votre choix : ");

            choix = input.nextInt();

            switch (choix) {
                case 1:
                    ge.ajoterEmployer(input);
                    break;
                case 2:
                    ge.afficherEmployer();
                    break;
                case 3:
                    System.out.print("ID de l'employé : ");
                    id = input.nextInt();
                    ge.rechercherEmploye(id);
                    break;
                case 4:
                    System.out.print("ID de l'employé à supprimer : ");
                    id = input.nextInt();
                    ge.supprimerEmployer(id);
                    break;
                case 5:
                    ge.calculeSalaire();
                    break;
                case 0:
                    System.out.println("Merci d'avoir utilisé l'application.\nAu revoir !");
                    break;
                default:
                    System.out.println("Choix invalide ! Veuillez choisir une option entre 0 et 5.");
            }
        } while (choix != 0);

        input.close();
    }
}
