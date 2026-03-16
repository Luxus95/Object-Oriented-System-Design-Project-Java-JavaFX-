# C-Wire: High-Performance Electrical Grid Data Engine

[English Version](#english-version) | [Version Française](#version-française)

---

<a name="english-version"></a>
## 🇺🇸 English Version

### 1. Overview
This project is a high-performance data processing engine designed to synthesize large-scale electrical distribution datasets. It leverages a hybrid architecture combining **Shell scripting** for efficient data stream filtering and **C** for advanced algorithmic aggregation.

### 2. Technical Architecture
The core engine is built on a custom **AVL Tree (Self-Balancing Binary Search Tree)** implementation.

[Image of AVL tree balancing rotation]

* **Complexity**: Guarantees **$O(\log n)$** time complexity for search, insertion, and aggregation, enabling sub-second processing of datasets exceeding **5,000,000 rows**.
* **Memory Management**: Engineered with a strict low-level allocation policy to ensure **zero memory leaks** (validated via Valgrind).
* **Hybrid Pipeline**: A Shell wrapper handles input sanitization and multi-parameter filtering before streaming data to the C binary.

### 3. Installation & Usage

#### Prerequisites
* GCC Compiler
* Make
* GnuPlot (for graphs)

#### Setup
```bash
make


Execution
Bash
bash c-wire.sh <input_file> <station_type> <consumer_type> [power_plant_id]
Example: bash c-wire.sh input/c-wire_v00.dat hvb comp 1
