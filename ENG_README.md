🇫🇷 Version Française
Ce projet consiste à créer un programme permettant de faire la synthèse de données d’un système de distribution d'électricité. Il utilise un script shell pour filtrer et traiter les données et un programme C pour la partie calcul.

Comment faire pour que le programme compile et qu'il s'exécute ?
Quand vous êtes dans le github, il faut tout d'abord être dans la branche "main", ensuite cliquer sur "<> Code", et enfin tout télécharger en zip (Download ZIP). Ensuite vous devrez extraire l'entièreté du zip dans un repertoire.

Il faut mettre les fichiers d'entrée que vous voulez dans le dossier input (chemin : Projet-Info-2024-2025-main/input).

Lors de l'exécution du programme il faut être dans le bon dossier (faire cd "chemin du fichier télécharger").

Commande pour l'éxecution :

Bash
bash c-wire.sh input/"le fichier d'entrée" "type de station" "type de consommateur" "identifiant de centrale (optionnel)" "-h (optionnel et pour aide)"
Exemple : bash c-wire.sh input/c-wire_v00.dat hvb comp 1

Les fichiers résultats seront dans le dossier principal, les fichiers temporaires dans tmp, les graphiques dans graphs et nos essais dans tests. Sur certains ordinateurs la première exécution peut prendre jusqu'à 40 secondes mais les suivantes seront beaucoup plus rapides (entre 0.3 et 7 secondes).

Comment ça fonctionne ?
La partie shell va prendre en entrée le fichier de données et va compiler make dans le dossier codeC, puis le shell va sélectionner les lignes et colonnes correspondantes à la demande de l'utilisateur. Le C qui recevra ces lignes par entrée directe via le shell va additionner les valeurs de capacité et de consommation pour chaque identifiant.

Pour lv all, le programme va faire un tri supplémentaire qui va garder les 10 premières et 10 dernières stations par leur capacité moins la consommation.

Ce que l'on a utilisé
Langage : C, Script Shell.

Bibliothèques : stdlib.h, stdio.h, math.h, assert.h.

IA (ChatGPT) : 15%.

Auteurs
Lucien Boyer

Eliot Durand de Gevigney

Marc-Antoine Abale
