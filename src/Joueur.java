public class Joueur {
    /**
     * Le nom du joueur (immuable).
     */
    private final String nom;
    /**
     * Compteur de joueurs (variable de classe).
     */
    private static int nombreDeJoueurs = 0;
    /**
     * Le score actuel du joueur.
     */
    private int score;

    /**
     * Construit un nouveau joueur avec un score initialisé à 0.
     *
     * @param nom Le nom du joueur (ne pourra plus être modifié).
     */
    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
        // On augmente le compteur partagé à chaque création (Notion : Variable de classe)
        nombreDeJoueurs++;
    }/**
     * Constructeur par Défaut (Niveau 6).
     * Crée un joueur sans nom fourni. Le nom sera généré automatiquement
     * sous la forme "JoueurN" où N est le numéro du joueur.
     * <p>
     * Utilise le CHAÎNAGE DE CONSTRUCTEURS (this(...)) pour ne pas dupliquer le code.
     */
    public Joueur() {
        // On appelle le constructeur principal en calculant le nom à la volée.
        // nombreDeJoueurs + 1 car l'incrémentation réelle se fera dans l'autre constructeur.
        this("Joueur" + (nombreDeJoueurs + 1));
    }
    /**
     * Ajoute des points au score du joueur.
     * @param points Le nombre de points à ajouter (peut être négatif, mais géré par setScore).
     */
    public void ajouterPoints(int points) {
        this.setScore(this.score + points);
    }

    /**
     * Retire des points au score du joueur.
     * @param points Le nombre de points à retirer.
     */
    public void retirerPoints(int points) {
        this.setScore(this.score - points);
    }

    /**
     * [MÉTHODE INTERNE - DRY]
     * Centralise la modification du score pour garantir la règle : JAMAIS NÉGATIF.
     * Cette méthode est privée : seul l'objet lui-même peut l'utiliser.
     * * @param nouveauScore Le score cible.
     */
    private void setScore(int nouveauScore) {
        // Logique centralisée : si < 0 alors 0, sinon la valeur.
        this.score = (nouveauScore < 0) ? 0 : nouveauScore;
    }

    /**
     * Récupère le nom du joueur.
     *
     * @return Le nom du joueur.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Récupère le score actuel du joueur.
     *
     * @return Le score sous forme d'entier.
     */
    public int getScore() {
        return this.score;
    }

    /**
     * Retourne une représentation textuelle du joueur sous la forme "Nom : Score pts".
     * Gère l'accord du pluriel pour "pt/pts" (un 's' seulement si score > 1).
     *
     * @return Une chaîne formatée décrivant l'état du joueur.
     */
    @Override
    public String toString() {
        // Logique ternaire pour l'accord grammatical Si score > 1, suffixe = pts, sinon pt
        String suffixe = (this.score > 1) ? "pts" : "pt";

        return this.nom + " : " + this.score + " " + suffixe;
    }
    /**
     * Retourne le nombre total de joueurs créés depuis le début du programme.
     * Méthode statique (de classe).
     *
     * @return Le nombre total de joueurs.
     */
    public static int getNombreDeJoueurs() {
        return nombreDeJoueurs;
    }

    /**
     * Teste l'égalité entre deux joueurs.
     * Deux joueurs sont égaux s'ils ont le même nom (insensible à la casse).
     *
     * @param obj L'objet à comparer.
     * @return Vrai si les joueurs ont le même nom, Faux sinon.
     */
    @Override
    public boolean equals(Object obj) {
        // 1. Test d'identité est-ce la même adresse mémoire ?
        if (this == obj) {
            return true;
        }

        // 2. Test de nullité et de type avec la notion : instanceof
        if (obj == null || !(obj instanceof Joueur)) {
            return false;
        }

        // 3. Transtypage (Downcast) pour accéder au nom de l'autre objet
        Joueur autreJoueur = (Joueur) obj;

        // 4. Comparaison sémantique (Contenu) : Noms identiques ?
        // Consigne : "insensible à la casse" -> equalsIgnoreCase
        return this.nom.equalsIgnoreCase(autreJoueur.nom);
    }
}
