# Day 3 — Shapes

A small console-based Java program that reads length and breadth from the user, constructs a Rectangle, and prints the area.

## Files
- `Shapes.java` — main program (reads input, uses `Rectangle` class, prints result)

## Prerequisites
- Java JDK (javac and java) installed on the system.

## Build
From the `Day 3` folder run:

```bash
javac Shapes.java
```

## Run
From the `Day 3` folder run:

```bash
java Shapes
```

You will be prompted to enter two numbers (length and breadth). Example session:

```
Enter the length of the rectangle: 5
Enter the breadth of the rectangle: 3
The area of your rectangle is 15.0
```

## Notes
- The program may contain minor prompt typos (e.g., "reactagle"). Fix the prompt strings in `Shapes.java` if desired.
- To add unit tests later, extract the area calculation into a separate method or class so it can be tested with JUnit.