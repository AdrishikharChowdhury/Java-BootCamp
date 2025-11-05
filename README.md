# LetsUpgrade — Java BootCamp

This repository contains exercises from the LetsUpgrade Java Bootcamp. Each "Day N" folder holds a small, self-contained Java exercise that demonstrates a specific concept.

## Overview
- Purpose: Practice core Java concepts through daily exercises and small programs.
- Environment: Dev container running on Ubuntu 24.04.2 LTS with JDK installed.

## Repository structure
- Day 1/ — (basic setup and examples)
- Day 2/ — Prime number example (`Prime.java`)
- Day 3/ — Shapes example (`Shapes.java`, computes rectangle area)
- ... — additional Day N folders for subsequent exercises

## Prerequisites
- Java JDK (javac and java)
- Optional: Git for version control

## Quick start — build & run
From a specific day folder (e.g., `Day 3`):
```bash
javac Shapes.java
java Shapes
```

To compile all Java sources from the workspace root:
```bash
find . -name "*.java" -print0 | xargs -0 javac
```

## Git
Add a `.gitignore` in the repo root to ignore compiled classes:
```
*.class
```
To stop tracking already committed `.class` files:
```bash
git add .gitignore
find . -name "*.class" -print0 | xargs -0 git rm --cached --ignore-unmatch
git commit -m "Stop tracking .class files"
```

## Contributing
- Name new folders using the pattern `Day N`.
- Add a short `README.md` inside each day folder explaining the exercise and how to run it.
- Keep exercises small and extract logic into methods/classes to enable unit testing.

## Notes
- This workspace runs in a dev container