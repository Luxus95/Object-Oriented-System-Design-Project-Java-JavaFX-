Markdown
# C-Wire: High-Performance Electrical Grid Data Engine

## Overview
This project is a high-performance data processing engine designed to synthesize large-scale electrical distribution datasets. It combines the flexibility of **Shell scripting** for data pre-filtering with the algorithmic power of **C** for massive data aggregation.

## Technical Architecture
The core engine is built on a custom **AVL Tree (Self-Balancing Binary Search Tree)** implementation. 

* **Complexity**: Guarantees $O(\log n)$ time complexity for search, insertion, and aggregation, enabling efficient processing of datasets exceeding **5,000,000 rows**.
* **Memory Management**: Engineered with a strict low-level allocation policy to ensure zero memory leaks (validated via Valgrind).
* **Hybrid Pipeline**: A Shell wrapper handles input sanitization and multi-parameter filtering before streaming data to the C binary.



## Key Features
* **Scalability**: Designed to handle national-level energy distribution data.
* **Precision**: Optimized for different station types (HVB, HVA, LV) and consumer categories.
* **Visualization**: Integrated GnuPlot automated workflows to generate consumption-load analytics.

## Installation & Usage

### Prerequisites
* GCC Compiler
* Make
* GnuPlot (for graphs)

### Setup
```bash
make
Execution
Bash
bash c-wire.sh <input_file> <station_type> <consumer_type> [power_plant_id]
Example: bash c-wire.sh input/c-wire_v00.dat hvb comp 1

Performance
The system is optimized for speed. While the first execution on massive raw files may include I/O overhead (~30s), subsequent processed queries are handled in sub-second intervals (0.3s - 7s) thanks to the optimized AVL structure.
