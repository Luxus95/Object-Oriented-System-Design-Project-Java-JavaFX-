Markdown# C-Wire: High-Performance Electrical Grid Data Engine

[English Version](#english-version) | [Version Française](#version-française)

---

<a name="english-version"></a>
## 🇺🇸 English Version

### 1. Overview
This project is a high-performance data processing engine designed to synthesize large-scale electrical distribution datasets. It leverages a hybrid architecture combining **Shell scripting** for efficient data stream filtering and **C** for advanced algorithmic aggregation.

### 2. Technical Architecture
The core engine is built on a custom **AVL Tree (Self-Balancing Binary Search Tree)** implementation.
* **Complexity**: Guarantees **$O(\log n)$** time complexity for search, insertion, and aggregation, enabling sub-second processing of datasets exceeding **5,000,000 rows**.
* **Memory Management**: Engineered with a strict low-level allocation policy to ensure **zero memory leaks** (validated via Valgrind).
* **Hybrid Pipeline**: A Shell wrapper handles input sanitization and multi-parameter filtering before streaming data to the C binary.



### 3. Installation & Usage
```bash
# Compilation
make

# Execution
bash c-wire.sh <input_file> <station_type> <consumer_type> [power_plant_id]
Example: bash c-wire.sh input/c-wire_v00.dat hvb comp 14. PerformanceThe system is optimized for algorithmic speed. Initial I/O overhead on massive raw files may take up to 30s, but subsequent processed queries utilize the optimized AVL structure for near-instant results (0.3s to 7s).<a name="version-française"></a>🇫🇷 Version Française1. PrésentationC-Wire est un moteur de synthèse de données pour réseaux de distribution électrique. Le programme traite des ensembles de données massifs pour extraire des statistiques de consommation et de capacité par station.2. Architecture TechniqueLe traitement repose sur une structure d'Arbre AVL (Arbre binaire de recherche auto-équilibré) développée en C.Efficacité : La structure AVL garantit une performance en $O(\log n)$, cruciale pour maintenir la fluidité du traitement sur plus de 5 millions de lignes.Gestion Mémoire : Optimisation rigoureuse des allocations (malloc/free) pour une exécution sans fuite mémoire.Pipeline Hybride : Utilisation du Shell pour le filtrage amont et du C pour les calculs intensifs.3. UtilisationLes fichiers de données doivent être placés dans le dossier /input.Résultats : Générés à la racine du projet.Temporaires : Stockés dans /tmp (notamment pour les tris LV).Graphiques : Visualisations GnuPlot générées dans /graphs.4. AuteursLucien Boyer - Conception algorithmique & Structures de donnéesEliot Durand de Gevigney - Implémentation CMarc-Antoine Abale - Logique Shell & Automatisation (Makefile)
