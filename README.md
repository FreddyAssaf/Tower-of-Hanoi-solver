# Tower of Hanoi Solver

## Overview
This is the README for the Tower of Hanoi Solver project, which is part of my first artificial intelligence course at my University. This project focuses on solving the Tower of Hanoi puzzle using object-oriented programming in Java. The goal is to implement various search algorithms, including breadth-first search, depth-first search, best-first search, and A* search, to find the optimal solution to the puzzle while considering specified states, move costs, and heuristic functions.

## Project Structure
The project is structured as follows:

  - `Main.java`: The main entry point of the program.
  - `Graph.java`: A class representing the Tower of Hanoi puzzle as a graph, including state representation, move validation and where search algorithms are created.
  - `Node.java`: A class representing the node and it's cost.
  - `Path.java`: A class representing the path between nodes and it's cost.

## Getting Started
To run the Tower of Hanoi Solver project, follow these steps:

1. Clone this repository to your local machine using `git clone`.

   ```bash
   git clone https://github.com/FreddyAssaf/Tower-of-Hanoi-solver.git

2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. Build and run the `Main.java` file to execute the Tower of Hanoi Solver program.

## Usage
The Tower of Hanoi Solver program is designed to work with a pre-generated graph representation of the states of the pegs. The nodes and their paths/edges are already added to the graph. To use the program, follow these steps:

1. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

2. Build and run the `Main.java` file to execute the Tower of Hanoi Solver program.

4. The program will automatically use the pre-generated graph representation of the Tower of Hanoi states.

5. The solver will find the optimal solution using each search algorithm and display the sequence of moves and the number of nodes expanded.

## Features

- Solves the Tower of Hanoi puzzle.
- Implements various search algorithms for finding the optimal solution.
- Provides state representation, move cost consideration, and heuristic functions.
- Generates output that includes the sequence of moves and the number of nodes expanded for each search algorithm.

## Contributing
If you would like to contribute to this project, please follow the standard open-source contribution guidelines. We welcome bug reports, feature requests, and pull requests.


