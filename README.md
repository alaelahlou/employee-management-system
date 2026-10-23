# Employee Management System — Java

Application console développée en Java pour gérer les employés d'une entreprise.

## Fonctionnalités

- Ajouter un employé de type Développeur ou Manager
- Afficher la liste des employés
- Rechercher un employé par son identifiant
- Supprimer un employé
- Calculer le salaire total en tenant compte des primes

## Technologies et concepts

- Java 17+
- Eclipse IDE
- Programmation orientée objet (POO)
- Classe abstraite, héritage et polymorphisme
- Interface Java
- Collections Java : `ArrayList`
- Saisie console avec `Scanner`

## Structure du projet

```text
src/
├── com/
│   ├── Interface/CalculSalaire.java
│   ├── Main/Main.java
│   ├── Model/
│   │   ├── Employe.java
│   │   ├── Developpeur.java
│   │   └── Manager.java
│   └── Service/GestionEmploye.java
└── module-info.java
```

## Lancer le projet avec Eclipse

1. Cliquez sur **Code → Download ZIP** ou clonez ce dépôt.
2. Dans Eclipse, sélectionnez **File → Import → Existing Projects into Workspace**.
3. Choisissez le dossier du projet téléchargé.
4. Ouvrez `src/com/Main/Main.java`.
5. Cliquez sur **Run**.

## Fonctionnement

Les données sont conservées en mémoire pendant l'exécution. Elles ne sont pas encore enregistrées dans une base de données ou dans un fichier.

## Améliorations possibles

- Ajouter la modification des informations d'un employé
- Enregistrer les données dans un fichier ou une base de données
- Renforcer la validation des saisies
- Ajouter des tests automatisés

---
Projet personnel d'apprentissage Java.
