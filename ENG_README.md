# C-Wire: High-Performance Electrical Grid Data Engine

[English Version](#english-version) | [Version Française](#version-française)

---

<a name="english-version"></a>
# C-Wire: High-Performance Electrical Grid Data Engine

This project focuses on developing a high-performance data processing engine designed to synthesize large-scale electrical distribution datasets. It utilizes a hybrid architecture, leveraging Shell scripting for data stream filtering and C for advanced algorithmic aggregation and computation.

## How to compile and execute the program?

When on GitHub, ensure you are on the "main" branch. Click the "<> Code" button and select "Download ZIP".

Next, extract the entire ZIP archive into a directory of your choice (e.g., Documents or Personal Folder).

Place the input files you wish to process into the input folder. Path: `Projet-Info-2024-2025-main/input`.

To execute the program, navigate to the project directory using the terminal (e.g., `cd path/to/downloaded/folder`).

Example: `cd ~/Documents/Projet-Info-2024-2025-main`. (Ensure you are located at the root of the project).

**Execution Command:**
`bash c-wire.sh <input_file> <station_type> <consumer_type> [power_plant_id] [-h]`

Example: `bash c-wire.sh input/c-wire_v00.dat hvb comp 1`

Results are generated in the root directory. Temporary files (specifically for `lv_all` cases) are stored in `/tmp`. Visualizations (specifically for `lv_all_minmax` stations) are stored in `/graphs`, and test logs are located in `/tests`.

On some systems, the initial execution on massive raw datasets may take up to 40 seconds due to I/O overhead. Subsequent queries are significantly faster, typically ranging between 0.3 and 7 seconds, thanks to optimized data structures.

A sample file named `c-wire_v00.dat` is provided in the input folder for initial testing. Users can add additional datasets as needed.

## How does it work?

The Shell wrapper sanitizes the input, compiles the C engine via the Makefile in the `codeC` directory, and applies multi-parameter filters to the data stream. These filtered streams are piped into the C binary, which performs high-speed aggregation of capacity and load values for each station ID.

For the **lv all** mode, the engine performs an additional sorting operation to identify the top 10 most loaded and top 10 least loaded nodes, based on the delta between capacity and consumption.

## Technical Stack

* **Programming Languages:** C, Shell Scripting.
* **Libraries:** stdlib.h, stdio.h, math.h, assert.h.
* **AI Assistance (ChatGPT):** 15%.

## Authors
* Lucien Boyer
* Eliot Durand de Gevigney
* Marc-Antoine Abale

---

<a name="version-française"></a>
# Projet-Info-2024-2025

Ce projet consiste à créer un programme permettant de faire la synthèse de données d’un système de distribution d'électricité. Il utilise un script shell pour filtrer et traiter les données et un programme C pour la partie calcul.

## Comment faire pour que le programme compile et qu'il s'exécute ?

Quand vous êtes dans le github, il faut tout d'abord être dans la branche "main", ensuite cliquer sur "<> Code", et enfin tout télécharger en zip (Download ZIP)

Ensuite vous devrez extraire l'entièreté du zip dans un repertoire.
Exemple : Documents ou Dossier Personnel

Il faut mettre les fichiers d'entrée que vous voulez dans le dossier input. (chemin : Projet-Info-2024-2025-main/input).

Lors de l'exécution du programme il faut être dans le bon dossier (faire cd "chemin du fichier télécharger").

Exemple : cd ~/Documents/Projet-Info-2024-2025-main (peu importe le chemin il faut être dans Projet-Info-2024-2025-main).

Commande pour l'éxecution : bash c-wire.sh input/"le fichier d'entrée" "type de station" "type de consommateur" "identifiant de centrale (optionnel)" "-h (optionnel et pour aide)"
Exemple : bash c-wire.sh input/c-wire_v00.dat hvb comp 1

Les fichiers résultats seront dans le dossier principal, les fichiers temporaires dans tmp, les graphiques dans graphs et nos essais dans tests.

Sur certains ordinateurs la première exécution du programme par un nouveau fichier d'entrée de beaucoup de données peut prendre jusqu'à 40 secondes mais les suivantes seront beaucoup plus rapides (entre 0.3 et 7 secondes).

Il y a déjà un premier fichier dans input pour tester le programme et il est nommé "c-wire_v00.dat", on laisse l'utilisateur rajouter d'autres fichiers dans le dossier input selon ses besoins.

## Comment ça fonctionne ?

La partie shell va prendre en entrée le fichier de données et va compiler make dans le dossier codeC, puis le shell vas sélectionner les lignes et colonnes correspondantes à la demande de l'utilisateur. Le C qui recevra ces lignes par entrée directe via le shell vas additionner les valeurs de capacité et de consommation pour chaque identifiant des différentes stations demandées.
Pour lv all le programme vas faire un tri supplémentaire qui vas garder les 10 premières et 10 dernières stations. Puis il va les trier par leur capacité moins la consommation.


## Ce que l'on a utilisé

Langage de programmation: Langage C, script shell.
Les différentes bibliothèques utilisées: stdlib.h,stdio.h,math.h,assert.h.
Chat gpt : 15% (notamment pour se lancer dans le projet).

## Auteurs
Lucien Boyer
Eliot Durand de Gevigney
Marc-Antoine Abale
