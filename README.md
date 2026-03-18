# Object-Oriented-System-Design-Project-Java-JavaFX-

[English Version](#english-version) | [Version Française](#version-française)

---

<a name="english-version"></a>
# Java Player Management System

This project implements a robust player management system in Java. It is designed to demonstrate core and advanced **Object-Oriented Programming (OOP)** principles, ensuring data integrity and algorithmic efficiency.

## Prerequisites (Installation)

Before compiling, you need the **Java Development Kit (JDK)** installed on your system.

**For Linux (Ubuntu/Debian):**
bash
sudo apt update
sudo apt install default-jdk

### To verify installation:

Bash
javac -version

### How to compile and execute
### Step 1: Compilation
Open a terminal in the project root and compile the source files located in the src folder:

Bash
javac src/*.java
Note: This generates .class files inside the src directory.

### Step 2: Execution
Run the application by specifying the classpath:

Bash
java -cp src Main

### Project Structure
```text
/Object-Oriented-System-Design-Project-Java-JavaFX-
├── src/
│   ├── Joueur.java    # Core Logic & Player Model
│   └── Main.java      # Test Suite & Entry Point
├── .gitignore         # Version control exclusion
└── README.md          # Documentation
````
### Technical Concepts Implemented
Encapsulation & Data Integrity: Use of private final attributes and centralized logic (setScore) to ensure scores never drop below zero (DRY principle).

Static Context: Implementation of a global player counter using static variables to track instances across the application.

Constructor Chaining: Optimized object initialization using this() to handle automatic naming conventions.

Method Overriding:

toString(): Custom string representation with plural/singular logic for points.

equals(): Semantic comparison of objects based on name (case-insensitive).

### Technical Stack
Language: Java

Paradigm: Object-Oriented Programming

Tools: Git, JDK, Terminal

### Authors
Lucien Boyer

<a name="version-française"></a>

# Object-Oriented-System-Design-Project-Java-JavaFX-
Ce projet implémente un système de gestion de joueurs en Java, conçu pour illustrer les principes fondamentaux et avancés de la Programmation Orientée Objet (POO), tels que l'encapsulation, les membres statiques et le chaînage de constructeurs.

### Prérequis (Installation)
Vous devez avoir installé le Java Development Kit (JDK) sur votre système avant de commencer.

Sur Linux (Ubuntu/Debian) :

Bash
sudo apt update
sudo apt install default-jdk

### Pour vérifier l'installation :

Bash
javac -version
### Comment compiler et exécuter le projet
### Étape 1 : Compilation
Ouvrez un terminal à la racine du projet et compilez les fichiers sources :

Bash
javac src/*.java
### Étape 2 : Exécution
Lancez le programme en spécifiant le chemin des classes :

Bash
java -cp src Main
### Structure du Projet
```text
/Object-Oriented-System-Design-Project-Java-JavaFX-
├── src/
│   ├── Joueur.java    # Logique métier et modèle
│   └── Main.java      # Suite de tests et point d'entrée
├── .gitignore         # Exclusion pour le versioning
└── README.md          # Documentation
```
### Concepts Techniques Implémentés
Encapsulation et Intégrité : Utilisation d'attributs private final et d'une méthode setScore privée pour garantir que le score reste positif (principe DRY).

Contexte Statique : Suivi automatique du nombre total de joueurs via une variable de classe static.

Chaînage de Constructeurs : Appel de constructeurs via this() pour éviter la duplication de code lors de la création de joueurs sans nom.

Redéfinition de Méthodes (Overriding) :

toString() : Représentation textuelle personnalisée avec gestion intelligente du singulier/pluriel pour les points.

equals() : Comparaison sémantique basée sur le nom, insensible à la casse.

### Technologies utilisées
Langage : Java

Paradigme : Programmation Orientée Objet

Outils : Git, JDK, Terminal

### Auteurs
Lucien Boyer
