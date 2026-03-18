public class Main {

    /**
     * Point d'entrée du programme pour tester la classe Joueur.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        System.out.println("\n--- DÉBUT PROGRAMME ---");
        System.out.println("Nombre total de joueurs initial : " + Joueur.getNombreDeJoueurs() + " (Attendu: 0)");
        Joueur j1 = new Joueur("Alice");
        Joueur j2 = new Joueur("Bob");
        System.out.println("Après création Alice et Bob : Nombre de joueurs total est de " + Joueur.getNombreDeJoueurs() + " joueurs.");
        // 3. [Niveau 6] Création de joueurs SANS donner de nom Le système doit générer Joueur3 et Joueur4 car Alice=1, Bob=2
        System.out.println("\n--- Création des joueurs sans noms ---");

        Joueur j3 = new Joueur(); // Appel du constructeur par défaut
        System.out.println("1er Joueur créé sans nom : " + j3.getNom() + " (Attendu: Joueur3)");

        Joueur j4 = new Joueur();
        System.out.println("2eme Joueur créé sans nom v2 : " + j4.getNom() + " (Attendu: Joueur4)");

        // 4. Vérification finale du compteur
        System.out.println("\nNombre total de joueurs : " + Joueur.getNombreDeJoueurs() + " (Attendu: 4)");

        //Niveau 1 : Affichage des joueurs
        System.out.println("\n--- Liste des joueurs ---");
        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
        System.out.println(j4);
        // : "Afficher le nom et le score" = Utilise les Get
        System.out.println("Le joueur 1 : " + j1.getNom() + " a un score de " + j1.getScore());
        System.out.println("Le joueur 2 : " + j2.getNom() + " a un score de " + j2.getScore());
        //Niveau 2 : Modification des scores AVEC PAS DE NEGATIF
        System.out.println("\n--- Modification des scores ---");
        System.out.println("AJOUT DE 10 POINTS A ALICE ET RETRAIT DE 5 POINTS A BOB");
        j1.ajouterPoints(10);
        j2.retirerPoints(5);
        System.out.println("Après modification, Le joueur 1 : " + j1.getNom() + " a un score de " + j1.getScore());
        System.out.println("Après modification, Le joueur 2 : " + j2.getNom() + " a un score de " + j2.getScore());
        // Niveau 4 : Affichage avec toString()
        j1.ajouterPoints(1); // Alice passe à 11
        j2.ajouterPoints(1); // Bob passe à 1
        // Affichage utilisant la nouvelle méthode toString()
        System.out.println("AJOUT DE 1 POINT A ALICE ET BOB");
        System.out.println(j1); // Affichera "Alice : 11 pts" Plusieurs s car 11 > 1
        System.out.println(j2); // Affichera "Bob : 1 pt"    Pas de s car 1 <= 1

        //Niveau 5 : Tests d'égalité
        System.out.println("Nombre total de joueurs créés : " + Joueur.getNombreDeJoueurs());
        System.out.println("\n--- Tests d'égalité (equals) ---");

        //-- SCÉNARIOS DE TEST ÉGALITÉ ---

        // 1. [TEST VALIDÉ] La joueuse Alice n'est pas égale à la chaîne "Alice"
        // Notion : equals vs String
        System.out.println("1. Alice == \"Alice\" ? " + j1.equals("Alice") + " (Attendu: false)");

        // 2. [TEST VALIDÉ] La joueuse Alice n'est pas égale au joueur Bob
        System.out.println("2. Alice == Bob ? " + j1.equals(j2) + " (Attendu: false)");

        // 3. [TEST VALIDÉ] Le joueur Bob est égal à un nouveau joueur BOB
        // Notion : Référence vs Objet + equalsIgnoreCase
        Joueur bobMaj = new Joueur("BOB"); // Nouveau joueur en majuscules
        System.out.println("3. Bob == BOB (equals) ? " + j2.equals(bobMaj) + " (Attendu: true)");

        // 4. [TEST VALIDÉ] Le joueur Bob n'est pas == au joueur BOB
        // Notion : Opérateur == (compare les adresses mémoire)
        System.out.println("4. Bob == BOB (opérateur ==) ? " + (j2 == bobMaj) + " (Attendu: false)");

        // 5. [TEST VALIDÉ] Le joueur Bob est == à b où b est une nouvelle référence au joueur Bob
        // Notion : Référence vs objet (Aliasing)
        Joueur b = j2; // b pointe vers le MÊME objet que la variable bob
        System.out.println("5. Bob == b (alias) ? " + (j2 == b) + " (Attendu: true)");

        // --- SUPPRESSION ---

        // [TEST VALIDÉ] Supprimer un joueur
        // Notion : Référence null, Ramasse-miettes
        bobMaj = null;
        System.out.println("Suppression effectuée (bobMaj = null)");
    }
}
